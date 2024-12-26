package org.example.interfaceprac.vehicle;

public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.boardMethod();

        bus.fuelMethod();
        bus.speedMethod();

        Vehicle bus2=new Bus();

        bus2.fuelMethod();
        bus2.speedMethod();
//        bus2.board();

        Truck truck=new Truck();
        truck.speedMethod();
        truck.fuelMethod();
        truck.lendMethod();

        System.out.println();
        Brucks brucks = new Brucks();
        brucks.speedMethod();
        brucks.fuelMethod();
        brucks.lendMethod();
        brucks.boardMethod();


        System.out.println("------------");
        vehicleMethod(bus);
        vehicleMethod(truck);
        vehicleMethod(brucks);
        vehicleMethod(bus2);
    }

    static void vehicleMethod(Vehicle vehicle) {
        vehicle.fuelMethod();
        vehicle.speedMethod();
    }
}
