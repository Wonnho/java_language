package org.example.collection.List.Management;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManager {

//    HashMap<String,Integer> grade=new HashMap<>();
//   int age=10;
//   String name="jerk";
    List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public List<Student> addStudent(Student student) {
    students.add(student);
    return students;
}

public void showStudentINfo() {
        for (Student student: students) {
            student.showInfor();
            System.out.println();
        }
}

public Student findStudentByName(String name) {

    for(Student student:students) {
        if(student.getName().equals(name)) {
            return student;
        }
    }
    return null;
}
}
