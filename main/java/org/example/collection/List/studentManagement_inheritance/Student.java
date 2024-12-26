package org.example.collection.List.studentManagement_inheritance;

public class Student extends Grade {
    private String name;
    private int age;

    public Student(String subject, String name) {
        super(subject);
        this.name = name;
        this.age=0;
    }


//    private Grade grade;


//    public Grade getGrade() {
//        return grade;
//    }

//    public Student(String name,Grade grade) {
//        this.name = name;
//        this.grade=grade;
//    }



}
