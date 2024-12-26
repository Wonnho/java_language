package org.example.interfaceprac.character;

public class Mage extends Character {

    public Mage() {

        this.maxHealth=75;
        this.health=75;
    }

    @Override
    public void attack() {

    }

    @Override
    public void takeDamage(int amount) {
        health-=amount+10;
    }

    @Override
    public void levelUP() {

    }

    @Override
    public void attack(Character target) {
//    public void attack(DamageTakable target) {

        System.out.println("attack"+target);
        target.takeDamage(20);
    }

}


