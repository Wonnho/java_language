package org.example.bank;

public class BankAccount {
private double balance;
private String pin;

    public BankAccount( String pin) {
        this.balance =0;
        this.pin =pin;
    }

    //잔액조회
    public double getBalance() {
        return balance;
    }
    //입금
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }


    //비밀번호 조회??==?비빌번호 변경




    private void ceateaccount() {

}

private void deposit(int amount) {
     if(!validateAmount(amount)) {
         System.out.println("입금불가");
         return;
     }
     balance+=amount;
    System.out.println(amount+"입금됨");
}

//출금 :비밀번호
private void withdraw(int amount,String pin) {
  if(!validatePin(pin)) {
     return;
  }
   if(!validateAmount(amount)) {
       System.out.println("withdrawn");
       return;
   };
   if(amount>balance){
       return;
   };
        balance-=amount;
}

private boolean validateAmount(int amount) {
        //최소출금금액을 설정하면
//        if(amount>minAmount) {
//            return true;
//
//        } else { // if less then 0, it not allowed!!!
//            return false;
//        }
    return amount>0; //smply
}

//private String checkbalance() {
//
//}

private boolean validatePin(String password) {
        return this.pin.equals(pin);
//        if(pin.equals(pin())) {
//            return true;
//        } else {
//            return false;
//        }
}

//생성시 비빌번호 확인
    public static boolean validateInitialPin(String pin) {
        // pin length >4
        if(pin.length()>4) {return true;}
        else {return false;}
    }
}
