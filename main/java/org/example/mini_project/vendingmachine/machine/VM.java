package org.example.mini_project.vendingmachine.machine;

import org.example.mini_project.vendingmachine.payment.Payable;
import org.example.mini_project.vendingmachine.product.Chips;
import org.example.mini_project.vendingmachine.product.Drinks;
import org.example.mini_project.vendingmachine.product.Inventory;
import org.example.mini_project.vendingmachine.product.Products;

import java.util.Scanner;

public class VM {
    private Products products;
    public Products chips = new Chips("chocoball");
    public Products drinks = new Drinks("cola");
    private Payable payable;

//    public VM(Payable payable) {
//        this.payable = payable;
//    }

    public void pickProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select product (1: Chocoball, 2: Cola): ");
        int choice = scanner.nextInt();

        Products selectedProduct;  //변수 선언
        if (choice == 1) {
            selectedProduct = chips;
            System.out.println("Selected: " + chips.getName() + ", Price: " + chips.getProductprice());
        } else if (choice == 2) {
            selectedProduct = drinks;
            System.out.println("Selected: " + drinks.getName() + ", Price: " + drinks.getProductprice());
        } else {
            System.out.println("Invalid selection");
            return;
        }

        pickPayment(selectedProduct);
    }

//            사용자가 결제방식으 ㄹ선택하게 하자.
//        if card
//                payable = new Card
//        else if cash
//                payable = new cash
    private void pickPayment(Products selectedProduct) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose payment, cash: 1 or card: 2");
        int paymentChoice = sc.nextInt();
        if (paymentChoice == 1) {
            System.out.println("enter cash amount:");
            int cash = sc.nextInt();
            if (cash > selectedProduct.getProductprice()) {
                int change = cash - selectedProduct.getProductprice();
                System.out.println("결제가 완료되었습니다.");
                if (change > 0) {
                    System.out.println("잔액:" + change);
                }
            } else {
                System.out.println("금액이 부족합니다.");
            }
        } else if (paymentChoice == 2) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("Invalid payment");
        }
    }


}



//        if(payable.pickPayment(product.getProductprice())) {
//            if(payable.getPaymentType().equals("cash")) {
//                System.out.println("enter cash amount: ");
//                int paid=sc.nextInt();
//                int change=payable.balance(paid,product.getProductprice());
//                System.out.println("Change: "+change);
//            }
//            System.out.println("product purchase completed");
//        } else {
//            System.out.println("payment failed");
//        }
//    }

//    }



