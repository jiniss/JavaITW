package edu.java.loop0;

import java.util.Random;

public class LoopMain0 {

    public static void main(String[] args) {
        //2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성
            for (int n = 0; n <= 100; n += 3) {
                System.out.println(n);
                    
                 for (int s = 0; s <= 100; s += 3) {
                    System.out.println(s);
            }
        }
        
        
        /*
        3. while문과 Math.random()메소드 이용 - 2가지의 주사위를 던졌을 때 나오는 눈을
           (눈1,눈2) 형태로 출력
           눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행 멈춤
           눈의 합이 5가 되는 조합 : (1, 4), (4, 1), (2, 3), (3, 2)
        */
            
            
            Random random = new Random();
            int x = random.nextInt(1, 7);
            int y = random.nextInt(1, 7);
            
//            while (true) {
//                System.out.println("(" + x + ", " + y + ")");
//                if (x + y == 5) {   
//                    break;
//                }
//                
//                
//            }
            
            
        
        
        //4. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 (x, y)형태로 출력
        //   x, y는 10 이하의 자연수
        
        
        
        
        /*
        5. for문을 이용해서 다음 코드 출력
           *
           **
           ***
           ****
        */
            for (int a = 1; a < 5; a++) {
                for(int b = 1; b <= a; b++)
                System.out.print("*");
            }
            System.out.println();
        
        
        
        /*
        6. for문을 이용해서 다음 코드 출력
             *
            **
           ***
          ****
        */
        
        
        
        // 7. while문과 Scanner를 이용해 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 코드 작성
        //    nextInt 사용 (nextLine 안써도됨)
        
        
        
    }

}
