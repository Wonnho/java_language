package org.example.interfaceprac;

public class Rectangle extends Shape{
    public int width=10;
    public int height=20;

//    public Rectangle(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }

    @Override
    public int calculateArea() {
        return width*height;
    }
}
