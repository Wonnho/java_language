package org.example.composition;

public class Car implements Tool{
    protected String model;
    protected double speed;
    private Engine engine;

    public Car(String model, Engine engine) {

        this.model=model;
        this.engine = engine;
    }
//    private Engine[] engines;

    public double accel() {
     double amount=engine.horsepower;
     speed+=amount;
        System.out.println(model+"의 속도가 가속합니다. 속도는 "+speed);
     return speed;
    }

    @Override
    public void use() {
           accel();
    }

//
//    public double accelSpeed() {
//        for(Engine e:engines) {
//            e.speedUp();
//        }
//        return speed;
//    }
}
