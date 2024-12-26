package org.example.interfaceprac.vehicle;

public abstract class Vehicle {
    protected int maxFuel=100;

    abstract void fuelMethod();

    void speedMethod() {
        System.out.println( "speed Up");
    }
}
