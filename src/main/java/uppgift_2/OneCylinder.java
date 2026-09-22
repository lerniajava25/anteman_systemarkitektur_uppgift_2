package uppgift_2;

/**
 * The type One cylinder.
 */
public class OneCylinder implements Motor {

    private final int horsePower;
    private final int cylinderCount;
    private final boolean electric;

    /**
     * Instantiates a new One cylinder.
     */
    public OneCylinder() {
        IO.println("Creating OneCylinder");
        this.horsePower = 31;
        this.cylinderCount = 1;
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
