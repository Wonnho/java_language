package org.example.composition;

public class Character {
    public int health;

    public Weapon weapon;
   public int power;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Character(int health) {
        this.health = health;
    }

    public void attack() {
        if(weapon==null) {
            System.out.println("attack"+power);

        } else {
//            System.out.println("attack"+weapon.power);
            System.out.println("attack"+(power+weapon.power));
        }
//       System.out.println("attack");

    }

  public  void specialAttack() {
    if(weapon instanceof SpecialAttackable) {
        ((SpecialAttackable) weapon).specialAttack();
    }
     }
}
