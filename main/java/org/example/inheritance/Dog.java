package org.example.inheritance;

public class Dog extends Animal {

    private String breed;

    //constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void noise() {
          super.noise();  //보무의 무언가를 변화를 주고 싶을 때
//          this.breed=breed;
        System.out.println("Dogs bark"+"this dog is a"+breed);
//        return "무언가의 string";
//        return breed;
    }
}
