package org.example.interfaceprac.vehicle;

public class Bus extends Vehicle implements PassengersBoardable{
    @Override
    void fuelMethod() {
        System.out.println("how much fuel is needed?");
    }

    @Override
    void speedMethod() {
        // super.speedMethod();  ide가 추천하는 것 뿐이다.
        System.out.println("버스의 속도는 최대 80 최소 60으로 제한되어 있습니다.");

    }

    @Override
    public void boardMethod() {
         System.out.println("boardable");
    }
}
