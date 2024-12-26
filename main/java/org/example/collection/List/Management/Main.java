package org.example.collection.List.Management;

public class Main {
    public static void main(String[] args) {


        Student jerky = new Student("jerk", 21);
        jerky.addGrade("korean",88);
        jerky.addGrade("english",88);
        jerky.addGrade("기술",81);


jerky.showInfor();
        System.out.println("평균");
        System.out.println(jerky.averageScore());

        Student harris = new Student("Harris", 19);
        harris.addGrade("korean",83);
        harris.addGrade("english",78);
        harris.addGrade("기술",51);


        harris.showInfor();
        System.out.println("평균");
        System.out.println(harris.averageScore());

StudentManager studentManager=new StudentManager();
studentManager.addStudent(jerky);
studentManager.addStudent(harris);

        System.out.println("학생정보조회");
studentManager.showStudentINfo();


Student b=studentManager.findStudentByName("jerk");
        System.out.println("find a student");
b.showInfor();


    }
}
