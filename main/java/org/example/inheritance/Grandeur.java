package org.example.inheritance;

public class Grandeur extends Motion{

    protected int passengers;
    protected static int MAX_FUEL=300;

    public Grandeur(String model) {
        super(model);
        this.passengers=0;
//        this.getGas(gas) > MAX_FUEL;//함수 호출, 데이터 타입이 필요없음.
    }
//
//    @Override
//    public int getGas(int gas) {
//        if(MAX_FUEL<gas) {
//            gas=MAX_FUEL;
//        }
//        return gas;
//    }
//
//    @Override
//    public int getSpeed(int gas) {
//       speed+=90;
//       gas-=(speed/9);
//       return 2;
//    }

    public  int addPassengers(int men) {
        passengers +=men;
        return passengers;
    }

    public int getMaxFuel(){
        return MAX_FUEL;
    }
}
