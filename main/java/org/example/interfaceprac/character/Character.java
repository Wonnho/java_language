package org.example.interfaceprac.character;

public abstract  class Character implements DamageTakable {
    protected int level;
    protected int health;
    protected int maxHealth;

    public Character() {
        this.level = 1;
//        this.maxHealth = maxHealth;
//        this.health = maxHealth;
    }

    public abstract void attack();

    public abstract void attack(Character target);
//    public abstract void attack(DamageTakable target);

    public abstract void takeDamage(int amount);

    public abstract void levelUP();

    public void showInfo() {
        System.out.println("level:" + level);
        System.out.println("health:" + health);
    }

}
