package uppgift2;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop(new AMD(3000, 8));
        desktop.printCPU();
        myDelay(800);
        desktop.restart();
        myDelay(1000);
        desktop.turnOn();
        myDelay(800);
        desktop.restart();
        myDelay(800);
        desktop.turnOff();

        Desktop desktop2 = new Desktop(new Intel(2000, 4));
        desktop2.printCPU();
        myDelay(800);
        desktop2.restart();
        myDelay(1000);
        desktop2.turnOn();
        myDelay(800);
        desktop2.restart();
        myDelay(800);
        desktop2.turnOff();
    }

    private static void myDelay(int milliSeconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliSeconds);
        } catch (InterruptedException _) {
            Thread.currentThread().interrupt();
        }
    }
}
