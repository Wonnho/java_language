package org.example.mini_project.vendingmachine.payment;

public class Card implements Payable {

    @Override
    public boolean pickPayment(int amount) {
        return false;
    }

    @Override
    public int balance(int paid, int price) {
        return 0;
    }

    @Override
    public String getPaymentType() {
        return "Card";
    }
}
