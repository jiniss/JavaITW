package edu.java.loop05;

public class LoopMain05 {

    public static void main(String[] args) {
        // 369 게임 출력
       
       for (int i = 1; i <= 100 ; i++) {
           // 1의 자릿수 - 10으로 나눈 나머지
           int n1 = i % 10;
           // 10의 자릿수 - 10으로 나눈 몫
           int n10 = i / 10;
           
           if (n1 == 3 || n1 == 6 || n1 == 9 || n10 == 3 || n10 == 6 || n10 == 9) {
               System.out.print("*\t");  
           } else {
               System.out.print(i + "\t");
           }
        	
           if (i % 10 == 0) {
                System.out.println();
        	}
        	
        }   	
                
    }
    
}


    

    

