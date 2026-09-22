package uppgift_2;

public class ElectricMotor implements Motor {

    private final int horsePower;
    private final int cylinderCount;
    private final boolean electric;

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
