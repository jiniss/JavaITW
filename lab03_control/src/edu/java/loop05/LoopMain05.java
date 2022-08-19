package edu.java.loop05;

public class LoopMain05 {

    public static void main(String[] args) {
        // 369 게임 출력
        
/* 369게임 프린트(LoopMain03에서 별표만 넣기)
3의배수에 별표넣기 1~100
1  2  *  4  5  *  7  8  *  10
11 12 *  14  15  * ...
*/
        
        for (int n = 1; n <= 100 ; n++) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9 || (n >=30 && n <= 39)) {
                System.out.println("*" + "\t");
            } else if (n % 10 == 0) {
                System.out.println(); 
            } else {
                System.out.print(n +"\t"); 
            }
            
         }
                
    }

}


    

    

