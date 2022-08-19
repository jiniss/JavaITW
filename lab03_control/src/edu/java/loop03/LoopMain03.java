package edu.java.loop03;

public class LoopMain03 {

    public static void main(String[] args) {
        /* 아래와 같은 형식으로 구구단 2단을 출력하세요.
           2 x 1 = 2
           2 x 2 = 4
           2 x 3 = 6
           ...
           2 x 8 = 16
           2 x 9 = 18
         */

        
        for (int n = 1; n < 10; n++) {
            System.out.println("2 x " + n + " = " + (2 * n));
            // Ctrl + /: 현재 커서가 있는 라인을 주석 토글
        }
        System.out.println("-----");
        for (int n = 1; n < 10; n++) {
            System.out.printf("2 x %d = %d\n", n, (n * 2));
        }
        // System.out.printf();: 문자열을 포맷에 맞춰서 출력.
        // %d: 정수, %f: 실수, %s: 문자열
        // \n: new line(줄바꿈), \t: tab(탭:일정간격 띄기)
        
        System.out.println("-----");
        for (int n = 1; n <= 100; n++) {
            System.out.print(n + "\t");
//          System.out.printf("%d\t", n);  => 동일식
        
        if (n % 10 == 0) {
            System.out.println();
//          System.out.printf("\n");    => 동일식

            }
        }
            
    }
}

