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
        
        System.out.print("User : Computer = ");
        System.out.println(user + " : " + computer);
        
        if (user == 0 && computer == 2) {
            System.out.println("<User Win!>");
        } else if (user == 2 && computer == 0) {
            System.out.println("<Computer Win!>");
        } else if (user > computer) {
            System.out.println("<User Win!>");
        } else if (user < computer) {
            System.out.println("<Computer Win!>");
        } else {
            System.out.println("<Draw!>");
        }
        
    }

}
