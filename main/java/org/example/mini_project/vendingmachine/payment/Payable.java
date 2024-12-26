package org.example.mini_project.vendingmachine.payment;

public interface Payable {
boolean pickPayment(int amount);
int balance(int paid,int price);
String getPaymentType();

}
