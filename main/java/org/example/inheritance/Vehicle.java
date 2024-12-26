package org.example.inheritance;

public class Vehicle {
    protected String model;
    protected int speed;
    protected int fuel;
    protected static final int MAX_VALUE = 100;

    //생성자
    public Vehicle(String model) {
        this.model = model;
        this.speed = 0;
        this.fuel = 0;
    }

    public int speed(int amount) {
        if (amount <= fuel) {//단순히
            speed += amount;
            fuel += amount;
        }
        return speed;
    }


    public int addFuel(int amount) {
        fuel += amount;
        if (fuel > getMaxFuel()) {
            fuel = getMaxFuel();
        }
        return fuel;
    }


    public int getMaxFuel() {
        return MAX_VALUE;
    }
}
