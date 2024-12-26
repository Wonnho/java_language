package org.example.modifierprac;

public class Person {
    private String name="superNova";
    public int age=25000000;
    double height=23412.908;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void run() {
        System.out.println("Run faster!!!");
    }

    public  void walk() {
        System.out.println("Take a walk");
    }

    void study( ) {
        System.out.println("Study Java as well as React");
    }


    private void notaccess() {
        String name;
    }

    public void peepingrun() {
        run();
    }
}
