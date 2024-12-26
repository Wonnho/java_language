package org.example.interfaceprac.vehicle;

public class Truck extends Vehicle implements CargoLendable{
    @Override
    void fuelMethod() {
        System.out.println("truck has fueled much energy");
    }

    @Override
    public void lendMethod() {
        System.out.println("cargo 대여됩니다.");
    }
}
