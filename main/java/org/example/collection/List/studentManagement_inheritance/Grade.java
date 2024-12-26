package org.example.collection.List.studentManagement_inheritance;

import java.util.ArrayList;
import java.util.HashMap;

public class Grade {
    public String subject;
//    private double point =new int[] ;
    // there are many subjects and accordingly,many points? how to deal with?
    private double point ;
    private double summ;
    private double avg;
//    ArrayList <Integer>
HashMap<String,Double> sub=new HashMap<>();

    public Grade(String subject) {
        this.subject = subject;
        this.point = 0;
        this.summ=0;
        this.avg=0;
        this.sub=new HashMap<>();
    }

     // new HashMap 과목별 성적저장은 Main에서 한다.

    public double summ(double point) {
         summ+=point;
        return summ;
    }

    public double mean(double summ) {
        avg=summ/sub.size();
       return avg;
    }
}
