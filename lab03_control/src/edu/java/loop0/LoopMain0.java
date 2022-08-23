package edu.java.loop0;

import java.util.Random;
import java.util.Scanner;

public class LoopMain0 {

    public static void main(String[] args) {

        // 2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성
        System.out.println("<2번>");

        int sum = 0;

        for (int n = 0; n <= 100; n += 3) {
            sum += n;
        }
        System.out.println(sum);
        
        System.out.println();

        
        /*
         * 3. while문과 Math.random()메소드 이용 - 2가지의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력 눈의 합이
         * 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행 멈춤 눈의 합이 5가 되는 조합 : (1, 4), (4, 1), (2, 3),
         * (3, 2)
         */
        System.out.println("<3번>");

        Random random = new Random();

        while (true) {
            int x = random.nextInt(1, 7);
            int y = random.nextInt(1, 7);

            System.out.println("(" + x + ", " + y + ")");
            if (x + y == 5) {
                break;
            }
        }
        System.out.println();


        // 4. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 (x, y)형태로 출력
        // x, y는 10 이하의 자연수
        System.out.println("<4번>");

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
        System.out.println();


        
        /*
         * 5. for문을 이용해서 다음 코드 출력
         *
         **
         ***
         ****
         */
        System.out.println("<5번>");

        for (int a = 1; a < 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        
        /*
         * 6. for문을 이용해서 다음 코드 출력
         *
         **
         ***
         ****
         */
        System.out.println("<6번>");

        for (int a = 1; a < 5; a++) {

            for (int b = 4; b >= a; b--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        
        // 7. while문과 Scanner를 이용해 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 코드 작성
        // nextInt 사용 (nextLine 안써도됨)
        System.out.println("<7번>");

        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
            
            int n = scanner.nextInt();
            switch (n) {
            case 1:
                System.out.println("예금액>10000");
                break;
            case 2:
                System.out.println("출금액>2000");
                break;
            case 3:
                System.out.println("잔고>8000");
                break;
            case 4:
                System.out.println();
                System.out.println("프로그램 종료");
                
            }
            break;  
        }
        
    }

}