package org.example.composition;

public abstract  class Weapon {
   protected int power;
   protected int stamina;

    public Weapon(int power, int stamina) {
        this.power = power;
        this.stamina = stamina;
    }

    //스페셜어택을 추가한다면 다음과 같이
//    public void specialAttack() {
//        "basically impossible"
//       "but possible once override"
//    }
}
