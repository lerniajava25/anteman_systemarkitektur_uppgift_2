package uppgift2;

public class AMD implements Processor{
    private final int clockSpeedMhz;
    private final int cacheL1;

    public AMD(int clockSpeedMhz, int cacheL1){
        this.clockSpeedMhz = clockSpeedMhz;
        this.cacheL1 = cacheL1;
    }

    @Override
    public int getClockSpeedMhz(){
        return clockSpeedMhz;
    }

    @Override
    public int getCacheL1() {
        return cacheL1;
    }

    @Override
    public String getCPU(){
        return "AMD";
    }
}
