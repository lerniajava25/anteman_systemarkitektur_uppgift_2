package uppgift_2;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Container {

    private final Map<Class<?>, Class<?>> bindings = new HashMap<>();

    public <T> void bind(Class<T> type, Class<? extends T> implementation) {
        bindings.put(type, implementation);
    }

    public <T> T get(Class<T> type) {
        try {
            Class<?> concrete = bindings.getOrDefault(type, type);

            Constructor<?>[] constructors = concrete.getConstructors();
            if (constructors.length == 0) {
                throw new IllegalStateException(
                        "Ingen publik konstruktor för " + concrete.getName()
                                + " (är det ett interface utan bind()?)");
            }
            Constructor<?> constructor = constructors[0];

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] arguments = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                arguments[i] = get(parameterTypes[i]);   // rekursionen
            }

            return type.cast(constructor.newInstance(arguments));
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Kunde inte skapa " + type.getName(), e);
        }
    }
}