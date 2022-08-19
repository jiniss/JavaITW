package edu.java.condition05;

import java.util.Random;

public class ConditionMain05 {

    public static void main(String[] args) {
        // Random 타입 변수를 선언하고, 초기화

        // Java 과목의 점수를 0 이상 100 이하의 난수를 만들어서 저장.

        // SQL 과목의 점수를 0 이상 100 이하의 난수를 만들어서 저장.

        // JSP 과목의 점수를 0 이상 100 이하의 난수를 만들어서 저장.

        // 세 과목의 평균을 계산.

        // 모든 과목의 점수가 40점 이상이고, 평균이 60점 이상이면 "합격",
        // 그렇지 않으면 "불합격" 출력
        
        
        Random random = new Random();
        
        int javaScore = random.nextInt(101);
        System.out.println("Java 점수 : " + javaScore);
        
        int sqlScore = random.nextInt(101);
        System.out.println("SQL 점수 : " + sqlScore);

        int jspScore = random.nextInt(101);
        System.out.println("JSP 점수 : " + jspScore);
        
        double average = (javaScore + sqlScore + jspScore) / 3.0;
        System.out.println("평균 : " + average);
        
        if (javaScore >= 40 && sqlScore >= 40 && jspScore >=40 && average >= 60) {
        System.out.println("합격");
        } else {
        System.out.println("불합격");
        }
        
    }

}
