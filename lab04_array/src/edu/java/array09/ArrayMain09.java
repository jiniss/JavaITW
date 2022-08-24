package edu.java.array09;

import java.util.Scanner;

public class ArrayMain09 {

    public static void main(String[] args) {
        //Ch. 6-2 Ex. 6 (p201)
        //학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하기
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo = Integer.parseInt(scanner.nextLine());
            
            if(selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
                
            } else if(selectNo == 2) {
                for(int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i +"]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine());    
                }
                
            } else if(selectNo == 3) {
                System.out.println("scores[0]> " + scores[0]);
                System.out.println("scores[1]> " + scores[1]);
                System.out.println("scores[2]> " + scores[2]);
                
            } else if(selectNo == 4) {
                int max = scores[0];
                int sum = 0;
                for(int s : scores) {
                max = (s > max) ? s : max;
                sum += s;
                }
                System.out.println("최고 점수: " + max);
                
                double mean = (double) sum / scores.length;
                System.out.println("평균 점수: " + mean);
                
            } else if(selectNo == 5) {
                run = false;
            }
            
        }
        
        System.out.println("프로그램 종료");

    }

}
