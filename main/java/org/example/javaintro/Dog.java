package org.example.javaintro;

public class Dog {
   public static int count;
   public String breed;
    public String name;

    public Dog(String breed,String name) {
        this.breed=breed;
        this.name=name;
    }

   public void sit() {
        System.out.println(this.name+"be seated");
    }

    public static void givemeahand(){
        System.out.println("Give me a right hand");
    }
}
