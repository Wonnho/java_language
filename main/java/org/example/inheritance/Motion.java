package org.example.inheritance;

public class Motion {
    protected String model;
    protected int speed;
    protected int gas;
    protected static final int MAX_FUEL = 100;

    public Motion(String model) {
        this.model = model;
        this.gas = 0;
        this.speed = 0;
    }


    public int getGas(int gas) {
        if (gas > getMaxFuel()) {
            gas = getMaxFuel();
        } else {
            this.gas=gas;
        }
        return gas;
    }

    public int getSpeed(int oil) {
        if (oil <= gas) {
            speed += 80;
            gas -= (gas / 8);
        }
        return speed;
    }

    public int getMaxFuel() {
        return MAX_FUEL;
    }
}