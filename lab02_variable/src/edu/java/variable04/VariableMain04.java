package edu.java.variable04;

import java.util.Scanner;

public class VariableMain04 {

    public static void main(String[] args) {
        // 콘솔 창에서 키보드로 숫자를 입력받아서 변수에 저장:

        // 1. Scanner 타입의 변수를 선언하고 초기화.

        // 2. Scanner 객체를 사용해서 콘솔 창에서 정수를 입력받고 저장.

        // Java 시험 점수(정수)를 입력
        // SQL 시험 점수를 입력 (변수 선언 + 콘솔창에 입력한 값을 저장)
        // JSP 시험 점수를 입력
        // 세 과목의 총점(정수)을 계산하고 출력
        // 세 과목의 평균(실수)을 계산하고 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("Java 점수를 입력>>>");
        int javaScore = scanner.nextInt();

        System.out.print("SQL 점수를 입력>>>");
        int sqlScore = scanner.nextInt();

        System.out.print("JSP 점수를 입력>>>");
        int jspScore = scanner.nextInt();

        int totalScore = javaScore + sqlScore + jspScore;
        System.out.println("총점 = " + totalScore);

        double average = (double) totalScore / 3;
        System.out.println("평균 = " + average);

        // Ctrl + Shift + F: 소스 코드 포맷팅(자동 정렬)
    }

}
