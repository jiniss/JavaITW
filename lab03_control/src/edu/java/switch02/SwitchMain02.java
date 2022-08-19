package edu.java.switch02;

public class SwitchMain02 {

    public static void main(String[] args) {
        int n = 123;
        switch (n % 2) {  //(n % 2 ==0)같은 비교식은 쓸 수X
        case 0:
            System.out.println("짝수");
            break;
        case 1:
            System.out.println("홀수");
            break;    
        }
        
        
        if (n % 2 == 0 ) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
        
        
    }

}
