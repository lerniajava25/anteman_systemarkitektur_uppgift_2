package uppgift_2;

public class TwoCylinder implements Motor {

    private final int horsePower;
    private final int cylinderCount;
    private final boolean electric;

    public TwoCylinder() {
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
