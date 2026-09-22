package uppgift_2;

/**
 * The type Electric motor.
 */
public class ElectricMotor implements Motor {

    private final int horsePower;
    private final int cylinderCount;
    private final boolean electric;

    /**
     * Instantiates a new Electric motor.
     */
    public ElectricMotor() {
        IO.println("Creating ElectricMotor");
        this.horsePower = 65;
        this.cylinderCount = 0;
        this.electric = true;
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
