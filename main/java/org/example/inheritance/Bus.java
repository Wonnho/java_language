package org.example.inheritance;

public class Bus extends Vehicle{
protected static final int MAX_FULE=300;
protected int passengerCount;

    public Bus(String model) {
        super(model);
        this.passengerCount=0;
    }
    public int addPassenger(int amount) {
        passengerCount +=amount;
        return passengerCount;
    }
}
