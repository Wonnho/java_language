package org.example.collection.List;

import java.util.HashMap;
import java.util.Set;

public class Mapprac {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("koearn",100);
        map.put("english",89);
        //js:map[Korean]=100

        System.out.println(map);

        map.put("korean",90);
        System.out.println(map);

        //retrieve
        System.out.println(map.get("korean"));

        System.out.println(map.get("math"));// return null. 존재하지 않아라는 느낌


        System.out.println(map.getOrDefault("math",0));
        System.out.println(map.getOrDefault("korean",0));

       //sizeå
        System.out.println(map.size());

        Set<String> keys = map.keySet();
        for(String key:keys) {
            Integer value=map.get(key);
            System.out.println(key+value);
        }

    }
}
