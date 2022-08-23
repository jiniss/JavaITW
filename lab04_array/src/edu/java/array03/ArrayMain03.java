package edu.java.array03;

import java.util.Random;

public class ArrayMain03 {

    public static void main(String[] args) {
        // Random 객체를 선언, 생성.
        Random random = new Random();
        
        
        //정수 10개를 저장할 수 있는 배열(scores)을 선언.
        int[] scores = new int[10];
        
        
        // 배열 scores에 0 이상 10 이하의 정수 난수 10개를 저장.
        for(int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(11);
        }
        

        //배열 scores에 저장된 모든 점수들의 합계를 계산하고 출력.
        int sum = 0;
        for(int s : scores) {
            System.out.print(s + " ");
            sum += s;
        }
        System.out.println("\nsum = " + sum);
        
        
        //배열 scores에 저장된 모든 점수들의 평균을 소수점까지 계산해서 출력.
        double average = sum / 10.0;
        System.out.println("평균 = " + average);
    
    }

}
