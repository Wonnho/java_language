package org.example.mini_project.vendingmachine.user;

public abstract class Users {

    public abstract void update(String message);

//    void update(String message);

    // Admin or customers
    abstract String usertype();

    //관리자인 경우 관리자 ID and password를 보관하고 관리자가 아이디와 암호를 입력할 경우 관리할 수 있도록 구현
   // void Pin();
}
