package org.example.composition;

public class Sword extends Weapon implements SpecialAttackable{
    public Sword(int power, int stamina) {
        super(power, stamina);
    }

    @Override
    public void specialAttack() {

    }
}
