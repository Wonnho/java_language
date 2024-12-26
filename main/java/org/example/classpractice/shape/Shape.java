package org.example.classpractice.shape;

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println();

        Rectangle rec = new Rectangle(12,45);

        System.out.println("rectangel area:"+rec.area());
        System.out.println("angleCount:"+rec.angleCount);
        rec.angleCount=11;
        System.out.println("angleCount:"+rec.angleCount);
        System.out.println(Rectangle.angleCount);
    }


}
