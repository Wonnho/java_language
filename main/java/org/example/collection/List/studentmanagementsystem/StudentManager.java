package org.example.collection.List.studentmanagementsystem;

import org.example.collection.List.studentmanagementsystem.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    //private Student student; //composition
    List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    //find student by name
    public Student findStudent (String name) {
        for (Student student : students) {
            if(student.getName().equals(name)){
                return student;
            };
        }
        return null;
    }
    public void studentInfo() {
        for (Student student : students) {
            student.Info();
            System.out.println();

        }
    }
}
