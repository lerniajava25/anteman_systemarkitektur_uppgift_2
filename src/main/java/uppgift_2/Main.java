package uppgift_2;

// import java.util.ArrayList;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * The type Main.
 */
public class Main {

    /**
     * Main.
     */
    void main() {

        // ### Remove the commented block below to test part 1 and 2 ###
        /*ArrayList<Snowmobile> snowmobiles = new ArrayList<>();

        IO.println("\n\nCreating first snowmobile, an Ockelbo. Using 'new'.");
        // Create an Ockelbo snowmobile with an electric motor using dependency injection with "new"
        Snowmobile ockelbo = new Ockelbo(new ElectricMotor());
        snowmobiles.add(ockelbo);

        // Create a container with 'automated' dependency injection
        Container container = new Container();

        // Sets up dependency injection of which motor to use
        container.bind(Motor.class, ThreeCylinder.class);

        // Which brand of snowmobile to use, in this case Yamaha
        container.bind(Snowmobile.class, Yamaha.class);
        IO.println("\n\nCreating second snowmobile, an0 Yamaha. Using 'container.get'");
        Snowmobile yamaha = container.get(Snowmobile.class);
        snowmobiles.add(yamaha);

        // Change brand of snowmobile to Skidoo but not motor
        container.bind(Snowmobile.class, Skidoo.class);
        IO.println("\n\nCreating third snowmobile, a Skidoo. Using 'container.get' with changed 'bind'");
        Snowmobile skidoo = container.get(Snowmobile.class);
        snowmobiles.add(skidoo);

        IO.println("\n\nPrinting snowmobiles data to check that functions in implementing classes works:");
        for(Snowmobile snowmobile : snowmobiles) {
            IO.println("\nSnowmobile name: " + snowmobile.getClass().getSimpleName());
            IO.println("HP: " + snowmobile.getMotor().getHorsePower());
            IO.println("Cylinders: " + snowmobile.getMotor().getCylinderCount());
            IO.println("Tracklength: " + snowmobile.getTrackLength());
            IO.println("Trackwidth: " + snowmobile.getTrackWidth());
            IO.println("Runs on: " + (snowmobile.getMotor().isElectric() ? "Electric" : "Gas"));
            IO.println("Suitable for work: " + (snowmobile.isForWork() ? "Yes" : "No"));
        }*/

        // ###  This is part 3, comment out to test part 1 and 2 ###
        try (WeldContainer weldContainer = new Weld().initialize()) {
            Yamaha yamahaFromWeld = weldContainer.select(Yamaha.class).get();
            Skidoo skidooFromWeld = weldContainer.select(Skidoo.class).get();

            IO.println("Yamaha from Weld has HP: " + yamahaFromWeld.getMotor().getHorsePower());
            IO.println("Skidoo from Weld has no of cylinders: " + skidooFromWeld.getMotor().getCylinderCount());
        }

    }
}
