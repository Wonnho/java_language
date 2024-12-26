package org.example.composition;

public class Main {
    public static void main(String[] args) {

        Pencil pencil = new Pencil("yellow");
//        Person person = new Person("jerk", pencil);
//        person.Writing();
//
//        Pencil blue=new Pencil("blue");
//        person.setPencil(blue);
//        person.Writing();
//
//       Pencil violet=new Pencil("violet");
//        System.out.println("=====");
//        Pencil[] pencils={blue,violet};
//        Person Jane = new Person("Jane",pencils);
//        Jane.WritingMany();


        Engine engine = new Engine(30);
        Car car = new Car("sonata",engine);
        car.accel();
        System.out.println(car.speed);


        Engine engine2 = new Engine(60);
        Car car2 = new Car("grand",engine2);
        car2.accel();
        System.out.println(car2.speed);



        Person amma = new Person("Amma",pencil);
        amma.use(); //현재 뭘 사용하는지 확인함
        amma.tool=car2;
        System.out.println("amma changes exploit car is:"+car2.speed);
        amma.use();
        amma.tool=pencil;
//        System.out.println("amma wants to change car to pencil˜e for use:"+pencil.write());
        System.out.println("amma wants to change car to pencil for use:");
        pencil.write();

        System.out.println("======character");
        Character character = new Character(100);
        Gun gun = new Gun(10,20);
        character.attack();

        character.setWeapon(gun);
        character.attack();

        Sword sword = new Sword(30,4);
        character.setWeapon(sword);
        character.attack();




  //문제상황
        // 처음 구현 상황-우리는 Weapon and SpecialAttakable을 따로 분리함
        //-Character는 Weapon만 받을 수 있음=>특별무기 불가능함

        //1.Weapon을 Special Attack이라는 것을 분리하지 말고 하나로 합침.
        //2.Character은 basic speacialAttack method 내부에서 Weapon이 SAable을 구현하는지 확인함
        //instanceof 라는 연산자르 사용

        //3.Weapon이 SA을 Composition으로 가짐
        //SA이 null인지를 확인해서 진행


    }
}
