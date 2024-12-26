package org.example.interfaceprac;

public abstract class Vehicle {
    protected String model;
    protected int speed;
    protected double fuel;
    protected static int MAX_FUEL=100;

    public Vehicle(String model) {
        this.model = model;
        this.fuel=100;
        this.speed=0;
    }

    abstract int excelSpeed(int accel);


}
