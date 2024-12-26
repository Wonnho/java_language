package org.example.interfaceprac;

//상속받는 다른 클래스에게 가지고 있는 변수들과 메서드들을 가지고 구현하도록 강제해 보자
public abstract  class Shape {
    public int width;
    public int height;

    public abstract int calculateArea();

    public void test() {
        System.out.println("test");
    }
}
