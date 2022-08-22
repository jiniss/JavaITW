package edu.java.loop05;

public class LoopMain05 {

    public static void main(String[] args) {
        // 369 게임 출력
       
       for (int n = 1; n <= 100 ; n++) {
        	if (n % 10 == 1) {
                System.out.println();
        	}
        	if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                System.out.print("*" + "\t");
            } else if (n >= 30 && n <= 39 || n >= 60 && n <= 69 || n >= 90 && n <= 99) {
            	System.out.print("*" + "\t");
            } else {
            	System.out.print(n + "\t"); 
            }
        	
        	
        }   	
                
    }
    
}


    

    

