package uppgift_2;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

/**
 * The type Ockelbo.
 */
@Dependent
public class Ockelbo implements Snowmobile {

    private final Motor motor;

    /**
     * Instantiates a new Ockelbo.
     *
     * @param motor the motor
     */
    @Inject
    public Ockelbo(Motor motor) {
        IO.println("Creating Ockelbo");
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
