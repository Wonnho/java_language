package org.example.collection.List;

import java.util.ArrayList;

public class SumAvg {
    public static void main(String[] args) {

        ArrayList<Integer> pnt = new ArrayList<>();
        pnt.add(30);
        pnt.add(20);
        pnt.add(10);
        System.out.println("retrieve pnt:"+pnt);
        int summ=pnt.get(0)+pnt.get(1)+pnt.get(2);
        int avg=summ/3;
        System.out.println("Sum of pnt:"+summ);
        System.out.println("mean:"+avg);
    }
}
