package org.example;

import org.example.javaintro.Dog;
import org.example.practice.Bread;

import static org.example.practice.Coffee.taste;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Circle c1=new Circle(3);
        System.out.println(c1.radius);
        System.out.println(c1.calculateArea());

        //speed 10 right?
        Car auto=new Car("avante");

//       speed up
        for (int i = 0; i < 3; i++) {
            System.out.println(auto.speedUp());
        }

//        break
        System.out.println(auto.speedDown());
//retrieve car information
//        System.out.println(auto.carInformation());


        MP3Player mp3=new MP3Player("ipod");
        for (int i = 0; i <3 ; i++) {
            System.out.println(mp3.volumeUp());
        }

        System.out.println(mp3.volumeDown());
        mp3.mp3Info();

//        Scanner sc=new Scanner(System.in());

//        Calculator calc=new Calculator();
//        System.out.printf("덧셈:%.2f\n",calc.plus(3.14,8.99));;
//        System.out.printf("뺄셈:%.2f\n",calc.subtract(34,44));;
//        System.out.printf("나눗셈:%.2f\n",calc.divide(3.14,8.99));;
//        System.out.printf("곱셈:%.2f\n",calc.product(3.14,8.99));;

        Rectangle rec=new Rectangle(5,4);// inject initial values via constructor
        System.out.println("사각형 면적:"+rec.calculatorArea());//able to calculate 이미 초기값이 할당되어 있으므로
        System.out.println(rec.angle);
        Calculator2 cal2=new Calculator2();


        taste();

        Bread.taste();

        Dog.givemeahand();

    }





    }
