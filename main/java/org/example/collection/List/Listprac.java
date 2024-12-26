package org.example.collection.List;

import java.util.ArrayList;
import java.util.List;

public class Listprac {
    public static void main(String[] args) {

        // int[] arr=new int[3];
        ArrayList<Integer> list =new ArrayList<>();  //size free
//      Student student = new Student();

        list.add(1);
        list.add(3);
        System.out.println(list);

        list.add(1,100);
        System.out.println(list);
        //언제가 효율적일지 구분해서 사용

        //접근
        System.out.println(list.get(1));

        //수정
        list.set(1,100);
        System.out.println(list);

        //list  를 반복. 길이를 가지고 있다.
        System.out.println(list.size());

        //예시
        list.isEmpty(); //
         if(!list.isEmpty()){
             list.get(9);
         }

         for(Integer k:list) {
             System.out.println(k);
         }

         for(int index = 0; index<list.size(); index++) {
             int value=list.get(index);
         }
         //.contains

        List<String> strings = new ArrayList<>();

         strings.add("1");



    }
}
