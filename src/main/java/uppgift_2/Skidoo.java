package uppgift_2;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class Skidoo implements Snowmobile {

    private final Motor motor;

    @Inject
    public Skidoo(Motor motor) {
        IO.println("Creating Skidoo");
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
