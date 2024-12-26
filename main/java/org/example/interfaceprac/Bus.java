package org.example.interfaceprac;

public class Bus extends Vehicle{
    protected int passengers;
    protected static int MAX_FUEL=300;

    public Bus(String model) {
        super(model);
        this.passengers=0;
    }

    @Override
    int excelSpeed(int accel) {
        speed+=accel;
//        fuel-=accel/4; 정수/4 하면 정수로 나온다.
        fuel-=(double) accel/4;
//        double[] arr = {speed, fuel}
        return speed;
    }

    public int addPassengers(int person) {
        passengers+=person;
        fuel-=person*0.12;
        return passengers;
    }


}
