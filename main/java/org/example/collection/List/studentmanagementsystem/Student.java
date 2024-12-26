package org.example.collection.List.studentmanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;

    private HashMap<String, Integer> grade;

    public Student(String name,int age) {
        this.name = name;
        this.age=age;
        this.grade=new HashMap<String, Integer>();
    }

    public Map<String, Integer> addGrade(String sub, Integer pnt) {
        grade.put(sub,pnt);
        return grade;
    }

    public double avgPoint() {
        double summ=0;
        for (String key : grade.keySet()) {
            Integer value=grade.get(key);
            summ += value;
//           how to process value if value=null?
            //henry.addGrade("household",null); for example
//            if(!(value==null)) {
//                summ += value;
//            } else{
//              summ+= ?
//            }
        }

        return (double) summ/grade.size();
    }

    public void setGrade(HashMap<String, Integer> grade) {
        this.grade = grade;
    }

    public void Info() {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("grade:"+grade);
    }

    public String getName() {
        return name;
    }
}
