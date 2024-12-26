package org.example.inheritance;

public class Character {
    public String name;
    private int level;
    protected double physical;
//      private int maxPhysical;
    protected int maxPhysical;


    public Character(String name) {
        this.name = name;
        this.level=1;
        this.physical=100;
        this.maxPhysical=100;//add
    }


    public void cheapShot() {
        System.out.println("hit");
    }

    public void levelUp() {
        level+=1;
        System.out.println("achieve level up ");
    }


}
