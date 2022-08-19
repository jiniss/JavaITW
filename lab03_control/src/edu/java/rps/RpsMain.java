package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

    public static void main(String[] args) {
        // 가위바위보 게임
        
/*
가위바위보-> 나:컴퓨터 ->컴퓨터한테 가위바위보 시킴(Random 3보다작은수 x)
-> 0,1,2를 스캐너를 통해 y 입력, < 0:가위, 1:바위, 2:보 >
컴퓨터는 난수입력 유저는 스캐너입력 -> 숫자를 비교해서 이기는 조건 설정
if문 활용해서 9가지 경우의수
else if 9번도 되지만 다른방법도 생각해보기    


int computer = 난수
int user = 스캐너 입력
print(computer : user)
누가 이겼는지(조건문) 출력
*/
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int computer = random.nextInt(3);

        
        System.out.print("user : ");
        int user = scanner.nextInt();
        
        System.out.println("computer : " + computer);

        
        System.out.print("User : Computer = ");
        System.out.println(user + " : " + computer);
        
        if (user == 0 && computer == 2) {
            System.out.println("User Win!");
        } else if (user == 2 && computer == 0) {
            System.out.println("Computer Win!");
        } else if (user > computer) {
            System.out.println("User Win!");
        } else if (user < computer) {
            System.out.println("Computer Win!");
        } else {
            System.out.println("Draw!");
        }
        
    }

}
