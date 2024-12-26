package org.example.interfaceprac.character;

public class Warrior extends Character implements RageUsable{
    protected int rage;
    protected int maxRage;

    public Warrior() {

        this.maxHealth = 120;
        this.health = 120;
        this.rage=0;
        this.maxRage=0;
    }

    @Override
    public void attack() {
        System.out.println("attack");
    increaseRage();
    if(rage==maxRage) {
        rageAttack();
    }

    }

    @Override
    public void attack(Character target) {
//    public void attack(DamageTakable target) {
        System.out.println("attack"+target);
        target.takeDamage(20);
    }

    @Override
    public void takeDamage(int amount) {
       health-=amount;
    }

    @Override
    public void levelUP() {
     level+=1;
        System.out.println("level up");
    }

    @Override
    public void increaseRage() {
     rage+=10;
//     if(rage>=maxRage) {
//         rage=maxRage;
//     }
        rage=Math.min(maxRage,rage+10); //simply
    }

    @Override
    public void increaseRage(int amount) {
//        rage+=10;
//     if(rage>=maxRage) {
//         rage=maxRage;
//     }
        rage=Math.min(maxRage,rage+amount);
    }


    @Override
    public void rageAttack() {
        System.out.println("Rage Attack!!");
    rage=0;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("rage:"+rage);
    }
}

