package org.example.interfaceprac.vehicle;

public class Brucks extends Vehicle implements CargoLendable,PassengersBoardable{
    @Override
    void fuelMethod() {
        System.out.println("Brucks:fuel station");
    }

    @Override
    public void lendMethod() {
        System.out.println("Brucks:lent shop");
    }

    @Override
    public void boardMethod() {
        System.out.println("Brucks: passengers should be ready for boarding");
    }
}
