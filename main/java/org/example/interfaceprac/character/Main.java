package org.example.interfaceprac.character;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        System.out.println("worrior level:"+warrior.level);
        warrior.attack();

        System.out.println("======");
        warrior.increaseRage(120);

        warrior.attack();





        warrior.showInfo();

        Mage mage = new Mage();
        mage.showInfo();
        warrior.showInfo();

        System.out.println("=====");
        warrior.attack(mage);
        mage.showInfo();

        System.out.println("=====");
        Warrior warrior2=new Warrior();
          warrior.attack(warrior2);
        warrior.attack(mage);
        mage.showInfo();
        warrior.showInfo();

    }
}
