package org.example.collection.List.studentManagement_inheritance;

import java.util.HashMap;

public class StudentMain {
    public static void main(String[] args) {

//        HashMap<String, Integer> std = new HashMap<>();
//        std.put("김경식",40);
//        std.put("이재현",31);
//
//        HashMap<String, Integer> grade = new HashMap<>();
//        grade.put("국어",88);
//        grade.put("기술",54);
        HashMap<String, Integer> std = new HashMap<>();
        std.put("김경식", 40);
        std.put("이재현", 31);

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("국어", 88);
        grade.put("기술", 54);

        // 두 HashMap을 합치기
        HashMap<String, Integer> combined = new HashMap<>(std);
        combined.putAll(grade);

        // 결과 출력
        System.out.println("합쳐진 HashMap: " + combined);

    }

}
