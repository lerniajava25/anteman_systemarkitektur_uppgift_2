package uppgift2;

public class Intel implements Processor{
    private  final int clockSpeedMhz;
    private final int cacheL1MB;

    public Intel(int clockSpeedMhz, int cacheL1MB){
        this.clockSpeedMhz = clockSpeedMhz;
        this.cacheL1MB = cacheL1MB;
    }

    @Override
    public int getClockSpeedMhz(){
        return clockSpeedMhz;
    }

    @Override
    public int getCacheL1(){
        return cacheL1MB;
    }

    @Override
    public String getCPU(){
        return "Intel";
    }
}
