package uppgift_2;

public class Ockelbo implements Snowmobile {

    private final Motor motor;

    public Ockelbo(Motor motor) {
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
        return 80;
    }

    @Override
    public boolean isForWork() {
        return true;
    }
}
