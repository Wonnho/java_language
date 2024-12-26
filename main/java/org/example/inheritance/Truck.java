package org.example.inheritance;

public class Truck extends Vehicle{
    private double payload;
    protected static final int MAX_FULE=250;
    protected static final int MAX_PAYLOAD=1000;
    public Truck(String model) {
        super(model);
        this.speed=0;
        this.fuel=0;
        this.payload=0;

    }

    public Boolean arryingCapa(double burden) {
        return MAX_PAYLOAD<burden;
    }




}
