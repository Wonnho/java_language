package org.example.streamprac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);arrayList.add(3);
        arrayList.add(4);


        List<Integer> integers=new ArrayList<>(List.of(3,1,2,4));
        System.out.println(integers);

        Stream stream =integers.stream();

        List<Integer> overlist=
        integers.stream().filter(x->x>1).collect(Collectors.toList()); //list
        //stream====>stream

        //list로 바꾸고 싶으면?


        System.out.println(overlist);



    }
}
