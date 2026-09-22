package uppgift_2;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class Yamaha implements Snowmobile {

    private final Motor motor;

    @Inject
    public Yamaha(Motor motor) {
        IO.println("Creating Yamaha");
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
