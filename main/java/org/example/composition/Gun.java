package org.example.composition;

public class Gun extends Weapon implements SpecialAttackable {
//composition
    //public SpecialAttack specialAttack <== maybe not good idea
    public Gun(int power, int stamina) {
        super(power, stamina);
    }

    @Override
    public void specialAttack() {
        System.out.println("shoot a gun");
    }
}
