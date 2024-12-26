package org.example.collection.List.studentManagement_interface.studentManagement_inheritance;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {
    public static void main(String[] args) {
        // 학생 정보 생성
        HashMap<String, Integer> std = new HashMap<>();
        std.put("김경식", 40);
        std.put("이재현", 31);
        System.out.println("student list:" + std);

        // 성적 정보 생성
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("국어", 88);
        grade.put("기술", 54);
        System.out.println("grade list:" + grade);

        // Student 객체 생성 및 정보 추가
        for (Map.Entry<String, Integer> entry : std.entrySet()) {
            Student student = new Student(entry.getKey());
            student.std.put(entry.getKey(), entry.getValue());

            // 각 학생에게 성적 추가
            for (Map.Entry<String, Integer> gradeEntry : grade.entrySet()) {
                student.addSubject(gradeEntry.getKey(), gradeEntry.getValue().doubleValue());
            }

            // 총점과 평균 계산
            student.summ();
            student.avg();

            // 결과 출력
            System.out.println("\n학생 정보:");
            System.out.println("이름: " + student.name);
            System.out.println("나이: " + student.std.get(student.name));
            System.out.println("과목별 점수: " + student.getSub());
            System.out.println("총점: " + student.getSumm());
            System.out.println("평균: " + student.getAvg());
        }
    }
}
