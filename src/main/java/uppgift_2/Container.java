package uppgift_2;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Container.
 */
public class Container {

    private final Map<Class<?>, Class<?>> bindings = new HashMap<>();

    /**
     * Bind.
     *
     * @param <T>            the type parameter
     * @param type           the type
     * @param implementation the implementation
     */
    public <T> void bind(Class<T> type, Class<? extends T> implementation) {
        bindings.put(type, implementation);
    }

    /**
     * Get t.
     *
     * @param <T>  the type parameter
     * @param type the type
     * @return the t
     */
    public <T> T get(Class<T> type) {
        try {
            Class<?> concrete = bindings.getOrDefault(type, type);

            Constructor<?>[] constructors = concrete.getConstructors();
            if (constructors.length == 0) {
                throw new IllegalStateException(
                        "No public constructor for " + concrete.getName()
                                + " (is it an Interface without bind()?)");
            }
            Constructor<?> constructor = constructors[0];

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] arguments = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                arguments[i] = get(parameterTypes[i]);   // recursion
            }

            return type.cast(constructor.newInstance(arguments));
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Could not create " + type.getName(), e);
        }
    }
}