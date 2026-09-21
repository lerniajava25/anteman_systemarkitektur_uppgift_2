package uppgift2;

public class Desktop implements Computer{
    private final Processor processor;
    private boolean isOn;

    public Desktop(Processor processor){
        this.processor = processor;
    }

    @Override
    public void turnOn() {
        IO.println("Desktop turned on");
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        IO.println("Desktop turned off");
        this.isOn = false;
    }

    @Override
    public void restart() {
        if(this.isOn){
            turnOff();
            turnOn();
            IO.println("  Desktop restarted");
        } else {
            IO.println("Desktop is off, cannot restart");
        }
        }


    @Override
    public void printCPU(){
        IO.println("CPU: " + processor.getCPU()
                + "Clockspeed: " + processor.getClockSpeedMhz()
                + "MHz, Cache L1: " + processor.getCacheL1() + " MB");
    }

    @Override
    public boolean status(){
        return isOn;
    }
}
