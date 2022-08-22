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
        if (user == 0) {  //사용자-가위
            if (computer == 0) {//컴퓨터-가위
                System.out.println("Tie");
            } else if (computer == 1) { //컴퓨터-바위
                System.out.println("Computer win");
            } else { //컴퓨터-보
                System.out.println("User win");
            }
        } else if (user == 1) { //사용자-바위
            if (computer == 0) {//컴퓨터-가위
                System.out.println("User win");
            } else if (computer == 1) { //컴퓨터-바위
                System.out.println("Tie");
            } else { //컴퓨터-보
                System.out.println("Computer win");
            }
        } else { //사용자-보
            if (computer == 0) {//컴퓨터-가위
                System.out.println("Computer win");
            } else if (computer == 1) { //컴퓨터-바위
                System.out.println("User win");
            } else { //컴퓨터-보
                System.out.println("Tie");
            }
        }
        
    }

}
        

    



