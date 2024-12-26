package org.example.collection.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_HashMap_prac {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //입력
        list.add("orange");
        list.add("apple");
        System.out.println("list box:"+list);

        //조회
        System.out.println("first element:"+list.get(1));

        //수정
        list.set(0,"plumber");
        System.out.println("retrieve list:"+list);

        // iterable retrieval
        for (String k:list) {
            System.out.println("retrieve all:"+k);

            HashMap<String,String> map = new HashMap<>();
            map.put("first","airline");
            map.put("navigator","airborne early warning");
            map.put("sky","triton");
            System.out.println("map box:"+map);

            //retrieve
            System.out.println("Hashmap box:"+map.get("first"));

            //default
            // if not fore there, then call airStriker
            System.out.println(map.getOrDefault("force","airStriker"));
            System.out.println("map size:"+map.size());


            Set<String> keys=map.keySet();

            for( String key:keys) {
                String value=map.get(key);
                System.out.println("key value via keySet:"+key+value);
            }
            //HashSet
            HashSet<Integer> set= new HashSet<>();
            set.add(1);
            set.add(2);
            System.out.println("set"+set);

            HashSet<String> setStr= new HashSet<>();

            setStr.addAll(list);
            System.out.println("set element by putting String list:"+setStr);
            System.out.println("hashset size:"+setStr.size());
            System.out.println("Empty:"+set.isEmpty());
            System.out.println("contains sky?"+setStr.contains("sky"));
            System.out.println("remove second element:"+set.remove(1));
            System.out.println("check set element:"+set);


        }

    }
}
