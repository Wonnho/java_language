package org.example;

public class Car {
    String model;
    float speed;

    Car(String model) {
        this.speed=0;
        this.model=model;
    }

    float speedUp() {
        this.speed+=10;
        return this.speed;

        //       return this.speed+=10;
    }

    float speedDown() {
        if(this.speed==0) {
            return this.speed;
        }
        this.speed -=10;
        return this.speed;

//        return this.speed-=10;
    }

    void carInformation() {
        System.out.println("모델:"+this.model+  ", 현재속도:"+this.speed);
        System.out.printf("model:%s  speed: %f \n",model, speed);
    }
    float uptoSpeed(int amount) {
        this.speed+=amount;
        return this.speed;
    }
}
