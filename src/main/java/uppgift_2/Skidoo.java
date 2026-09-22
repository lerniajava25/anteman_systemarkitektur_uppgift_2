package uppgift_2;

public class Skidoo implements Snowmobile {

    private final Motor motor;

    public Skidoo(Motor motor) {
        this.motor = motor;
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public int getTrackLength() {
        return 415;
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
