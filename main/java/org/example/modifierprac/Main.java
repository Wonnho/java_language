package org.example.modifierprac;

import org.example.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
    Person ps=new Person("susan",89,162.78);
        //age
        System.out.println("Age:"+ps.age);
       //height
        System.out.println("Height:"+ps.height);

        //need getter/setter of private name

        System.out.println(ps.getName());
        ps.setName("적샛왜성");
        System.out.println(ps.getName());
        ps.age=88;
        ps.height=160.09;

        ps.walk();
        ps.study();
        ps.peepingrun();

       String myPin="abc";
       if(BankAccount.validateInitialPin(myPin)) {
           new BankAccount(myPin);
       } else {
           //if failed, retry
            System.out.println("failed");
       }

//        BankAccount myacc = new BankAccount("abc123");
//        myAccount.deposit(100000);
//        myAccount.getBalance("abc123");
//        myAccount.widthraw(10000,"abc123");
//        myAccount.getBalance("abc123");
//
//        //wrong pin
//        myAccount.getBalance("aaaa");
    }


}
