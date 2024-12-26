package org.example.interfaceprac;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("사각형면적:"+rectangle.calculateArea());

        Triangle triangle = new Triangle();
        System.out.println("삼각형면적:"+triangle.calculateArea());
        rectangle.test();  //general method

//        new Animal();
        Dog dog = new Dog("happy",4, "puddle");
        dog.makeSound();
        Cat cat = new Cat("cat",3);
        cat.makeSound();

        makeThemSound(dog);
        makeThemSound(cat);
        cat.grr();

        Bus bus = new Bus("Mach370");
        System.out.println("bus speed"+bus.speed);
        bus.excelSpeed(30);
//        System.out.println("bus speed up:"+bus.excelSpeed(30));;
        System.out.println("bus speed up: " + bus.excelSpeed(30));
//        System.out.println("bus speed up: " + bus.excelSpeed(31));
        System.out.println("passengers add up:"+bus.addPassengers(16));
    }


//    public static void makeThemSound(Dog dog) {
//        System.out.println("cry!!");
//        dog.makeSound();
//    }


//
//    public static void makeThemSound(Cat cat) {
//        System.out.println("cry!!");
//        cat.makeSound();$
//    }

    public static void makeThemSound(Animal animal) {
        System.out.println("cry!!");
        animal.makeSound();
    }
}
