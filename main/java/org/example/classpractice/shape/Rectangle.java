package org.example.classpractice.shape;

public class Rectangle {

int width,height;
static int angleCount=4;

Rectangle() {
//    this.width=10;
//    this.height=10;
    this(10,10);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width*height;
    }
    int func() {
        int value=3;
        String word="staticVariable";
        return 1;
    }
}
