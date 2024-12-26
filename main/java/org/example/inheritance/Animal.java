package org.example.inheritance;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public void noise() {
        System.out.println("Make a noise");
    }
}
