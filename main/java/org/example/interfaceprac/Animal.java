package org.example.interfaceprac;

public abstract  class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();  //소리는 존재하지만 공통적인 소리는 없다.
}
