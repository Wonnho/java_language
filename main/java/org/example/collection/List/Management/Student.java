package org.example.collection.List.Management;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    //과목별 성적 저장
    private Map<String,Integer> grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = new HashMap<>();
    }

    //과목성적을 받는다=>grade에 추가한다
    //grade를 반환하거나 void return- 기능에 집중 둘중하나


//    public void setGrade(Map<String, Integer> grade) {
//        this.grade = grade;
//    }

    public  Map<String,Integer> addGrade(String subject, Integer score) {
        grade.put(subject,score);
        return grade;
    }

    public void showInfor() {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("grade:"+grade);
    }

    public String getName() {
        return name;
    }

    public double averageScore() {
 Integer sum=0;
        for(String key:grade.keySet()) {
     Integer value=grade.get(key);
     sum+=value;
 }

  return (double) sum/grade.size();
    }
}
