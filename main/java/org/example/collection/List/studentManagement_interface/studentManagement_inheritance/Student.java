package org.example.collection.List.studentManagement_interface.studentManagement_inheritance;

import java.util.HashMap;
import java.util.Map;

public class Student implements Grade {
private double summ;
private double avg;
public String name;
//    private String name;
//    private int age;
Map<String,Integer> std=new HashMap<>();

//    private double point;
//    private String subject;
Map<String,Double> sub=new HashMap<>();

    public Student(String name) {
        this.name = name;
        this.avg=0;
        this.summ=0;
        this.sub=new HashMap<>();
        this.std=new HashMap<>();
    }
    public void addSubject(String subject, double point) {
        sub.put(subject, point);
    }

    @Override
    public void summ( ) { // get value of sub
        summ = 0;
        for (Double point : sub.values()) {
            summ += point;
        }
    }
//    @Override
//    public void summ(sub value) { // get value of sub
//      summ=과목점수합
//    }

    @Override
    public void avg() {
        if (!sub.isEmpty()) {
            avg = summ / sub.size();
        } else {
            avg = 0;
        }
    }

    public double getSumm() {
        return summ;
    }

    public double getAvg() {
        return avg;
    }

    public Map<String, Double> getSub() {
        return sub;
    }

//    @Override
//    public void avg(double summ) {
//        avg=summ/(과목수)
//
//    }

}