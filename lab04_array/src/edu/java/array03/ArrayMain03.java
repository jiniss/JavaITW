package edu.java.array03;

import java.util.Random;

public class ArrayMain03 {

    public static void main(String[] args) {
        // Random 객체를 선언, 생성.
        Random random = new Random();
        
        
        //정수 10개를 저장할 수 있는 배열(scores)을 선언.
        int[] scores = new int[10];  //new 타입[원소 개수(인덱스 아님 주의)]
        
        
        // 배열 scores에 0 이상 10 이하의 정수 난수 10개를 저장.
        for(int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(11);
        }
        
        //배열 scores의 원소들을 출력.
        for(int s : scores) {
            System.out.print(s + " ");
        }
        
        //배열 scores에 저장된 모든 점수들의 합계를 계산하고 출력.
        int sum = 0;
        
//        for (int i = 0; i < scores.length; i++) {   //같은 코드
//            sum += scores[i];
//        }
        for(int s : scores) {
            sum += s;
        }
        System.out.println("\n합계 = " + sum);
        
        
        //배열 scores에 저장된 모든 점수들의 평균을 소수점까지 계산해서 출력.
        double mean = (double) sum / scores.length;   //mean = 평균이라는 뜻
        System.out.println("평균 = " + mean);
    
    }

}
