package uppgift_2;

public class Yamaha implements Snowmobile {

    private final Motor motor;

    public Yamaha(Motor motor) {
        this.motor = motor;
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public int getTrackLength() {
        return 307;
    }

    @Override
    public int getTrackWidth() {
        return 38;
    }

    @Override
    public boolean isForWork() {
        return false;
    }
}
