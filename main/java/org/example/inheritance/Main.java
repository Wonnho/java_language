package org.example.inheritance;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent("my public value");

        Animal animal = new Animal("animal", 3);

        Dog dog = new Dog("Minmi", 4, "Jindog");
        dog.noise();

        Cat stin = new Cat("Stin", 3);
        stin.noise();
        stin.golgol();

        Vehicle vehicle = new Vehicle("avante");
        System.out.println("model:"+vehicle.model);

        vehicle.addFuel(20);
        vehicle.speed(67);

        System.out.println(vehicle.speed);
        System.out.println(Vehicle.MAX_VALUE);

        Bus county = new Bus("county");
        county.addFuel(30);
        System.out.println("county speed:"+county.speed);
        System.out.println("Bus MAX FUEL:"+Bus.MAX_FULE);
        System.out.println("passenger 3"+county.addPassenger(3));
        county.addFuel(400);
//        System.out.println(county.addFuel(400));
        System.out.println("county fuel"+county.fuel);

        Motion motion = new Motion("Grandeur");
        System.out.println("model:"+motion.model);
        System.out.println("model gas:"+motion.gas);

        Grandeur grandeur= new Grandeur("GrandeurV3");
        System.out.println("grandeur gas:"+grandeur.getGas(40));
        grandeur.getGas(45);
        System.out.println("gas gauge:"+grandeur.getGas(45));
//        grandeur.getSpeed(55);
        System.out.println("speed:"+grandeur.getSpeed(47));
        System.out.println("add passengers:"+grandeur.addPassengers(4));
        grandeur.getGas(400);
        System.out.println("gas gauge:"+grandeur.getGas(400));


        Character basic = new Character("basic");
        basic.cheapShot();
        basic.levelUp();
        Worrior worrior = new Worrior("Worrio");
        System.out.println(worrior.physical);
        worrior.cheapShot();
//        System.out.println(worrior.rageUp());
        //cheapShot실행후 rage가 변화했는지 확인해 보자
        //rage가 private이므로 getter를 써서 가져온다.
        System.out.println(worrior.getRage());
        worrior.rageUp();
        System.out.println("rage gauge:"+worrior.getRage());
        worrior.cheapShot();


    }
}
