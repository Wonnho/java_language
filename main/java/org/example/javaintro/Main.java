package org.example.javaintro;

import org.example.javaintro.temp.DefaultModifier;

public class Main {
    public static void main(String[] args) {
        PrivateModifier pm=new PrivateModifier();
        System.out.println(pm.publicNum);
        pm.publicHi();

        System.out.println(pm.getPrivateNum());
        pm.setPrivateNum(1001);
        System.out.println(pm.getPrivateNum());

        pm.sayHi();
        DefaultModifier dm=new DefaultModifier();
        System.out.println(dm.publicString);
//        System.out.println(dm.defaultString);
    }


}
