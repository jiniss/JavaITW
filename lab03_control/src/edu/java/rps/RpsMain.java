package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

    public static void main(String[] args) {
        // 가위바위보 게임
        
/*
int computer = 난수
int user = 스캐너 입력
print(computer : user)
누가 이겼는지(조건문) 출력
*/
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("0:가위, 1:바위, 2:보");

        int computer = random.nextInt(3);

        System.out.print("user : ");
        int user = scanner.nextInt();
        
        System.out.println("computer : " + computer);
        
        System.out.println("computer(" + computer + ") : user(" + user +")");

        //누가 이겼는지(조건문) 출력
            int diff = user - computer;
            if (diff == 0) {
                System.out.println("Tie");
            } else if (diff == 1 || diff == -2) {
                System.out.println("User win");
            } else {
                System.out.println("Computere win");
            }
            
            //간단하지만 간단하다고 좋은 코드는 아님(이해하기 어려움)
}
    
}
        

    



