package uppgift_2;

import jakarta.inject.Singleton;

/**
 * The type Three cylinder.
 */
@Singleton
public class ThreeCylinder implements Motor {

    private final int horsePower;
    private final int cylinderCount;
    private final boolean electric;

    /**
     * Instantiates a new Three cylinder.
     */
    public ThreeCylinder() {
        IO.println("Creating ThreeCylinder");
        this.horsePower = 135;
        this.cylinderCount = 3;
        this.electric = false;
    }

    @Override
    public int getCylinderCount() {
        return cylinderCount;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public boolean isElectric() {
        return electric;
    }
}
