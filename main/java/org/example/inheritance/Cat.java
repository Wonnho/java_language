package org.example.inheritance;

public class Cat extends Animal{

    public Cat(String name,int age) {
        super(name,age);

    }

    public void noise() {
        System.out.println(name+"Myeong Myeong");
    }

    public void golgol() {
        super.noise();
        System.out.println("golrrrr");


    }
}
