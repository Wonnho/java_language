package org.example.classpractice.car;

public class Car {

    String model;
    double speed;
    public static final double MAX_SPEED = 140;

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }


    double speedUp(double vel) {
        if (this.speed > 140) {
            this.speed = MAX_SPEED;
        } else {
            speed += vel;
        }
        return speed;

    }

    double speedDown(double vel) {
        if (this.speed == 0) {
            return this.speed;
        } else {
            speed -= vel;
            return speed;
        }
    }


    void carSpec() {
        System.out.println("model:"+model+", max speed:"+speed);
    }
}
