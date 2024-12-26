package org.example.classpractice.car;

public class Machine {
    public static void main(String[] args) {

        Car car = new Car("stella");
        car.carSpec();
        car.speedUp(45.6);

        for (int k = 0; k < 3; k++) {
                 car.speedUp(11);
            System.out.println("speed meter:"+car.speed);
        }

        car.speedDown(34.09);
        System.out.println("speed meter:"+car.speed);
        car.carSpec();



    }
}
