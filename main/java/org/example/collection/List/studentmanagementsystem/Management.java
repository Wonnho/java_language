package org.example.collection.List.studentmanagementsystem;

public class Management {
    public static void main(String[] args) {

        Student henry = new Student("Henry",23);
         henry.addGrade("science",87);
         henry.addGrade("Math",44);
//         henry.addGrade("household",null);
         henry.addGrade("machinery",89);

        Student raye = new Student("Raye",20);
        raye.addGrade("science",89);
        raye.addGrade("Math",84);
        raye.addGrade("household",98);


        raye.Info();
        System.out.println( raye.avgPoint());
        henry.Info();
        System.out.println(henry.avgPoint());

        StudentManager b = new StudentManager();
        //update student
        b.addStudent(henry);
        b.addStudent(raye);

        //retrieve
        b.studentInfo();

        System.out.println("retrieve a student by name");
        b.findStudent("Raye"); //why null???

        Student j=b.findStudent("Henry");
        j.Info();
    }
}
