package org.example.mini_project.vendingmachine.payment;

public class Cash implements Payable {

    @Override
    public boolean pickPayment(int amount) {
        return false;
    }

    @Override
    public int balance(int paid, int price) {
        return paid-price;
    }

    @Override
    public String getPaymentType() {
        return "Cash";
    }
}
