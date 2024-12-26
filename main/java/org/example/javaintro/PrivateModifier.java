package org.example.javaintro;

public class PrivateModifier {
    public int publicNum=1;

    public int getPrivateNum() {
        return privateNum;
    }

    public void setPrivateNum(int privateNum) {
        this.privateNum = privateNum;
    }

    private int privateNum=10;

    public void publicHi() {
        System.out.println("hi, public");
    }

    private void privateHi() {
        System.out.println("hi, private not, public");
    }

    // a way to access private void privateHi()
    public void sayHi() {
        privateHi();
    }
}
