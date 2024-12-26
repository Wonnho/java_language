package org.example.mini_project.vendingmachine.user;

import org.example.mini_project.vendingmachine.machine.VM;
import org.example.mini_project.vendingmachine.payment.Payable;

public class Customers extends Users{

    private int coin;
    private String payment;
    public VM vm;
    private Payable payable;

//자판기를 호출한다.

    //in fact, don't need to notify change in stocks or sales
    @Override
    public void update(String message) {

    }

    @Override
    String usertype() {

        return "Customer";
    }

    // 상품선택,cancel
  // 결제-신용카드,현금,모바일 간편결제
  //현금시 잔돈 반환

}
