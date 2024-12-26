package org.example;

public class Rectangle {
    int width,height;
    static int angle=4;

    //constructor
    Rectangle(int width,int height) {
    this.width=width;
    this.height=height;
    }

    int calculatorArea() {
        return width*height;
    }
}