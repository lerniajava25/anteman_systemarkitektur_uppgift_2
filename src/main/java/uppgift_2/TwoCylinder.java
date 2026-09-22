package uppgift_2;

/**
 * The type Two cylinder.
 */
public class TwoCylinder implements Motor {

    private final int horsePower;
    private final int cylinderCount;
    private final boolean electric;

    /**
     * Instantiates a new Two cylinder.
     */
    public TwoCylinder() {
        IO.println("Creating TwoCylinder");
        this.horsePower = 64;
        this.cylinderCount = 2;
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
