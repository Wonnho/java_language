package org.example.inheritance;


//class CONST

public class Worrior extends Character{
private int rage;
private static final int MAX_RAGE=100;
    public Worrior(String name) {
        super(name);
        this.rage=0;
        this.physical=120;
        this.maxPhysical=120;
    }

    public int getRage() {
        return rage;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        maxPhysical+=30;
        physical+=30;
//       physical=maxPhysical;
    }
    @Override
    public void cheapShot() {
        rage+=10;

        if(rage>=50) {
            System.out.println("rage attack");
        }
    }


    public void rageUp() {
        rage+=50;
        System.out.println("rage up to 50");
    }
}
