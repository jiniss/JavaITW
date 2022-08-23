package edu.java.loop13;

import java.util.Scanner;

public class LoopMain13 {

    public static void main(String[] args) {
        // Ex.4-7.
        // while문과 Scanner를 이용해 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 코드 작성
        // nextInt 사용 (nextLine 안써도됨)
        
        boolean run = true;  // 프로그램을 계속 실행할지, 종료할지를 결정할 변수.
        int balance = 0;  // 은행 계좌의 잔고를 저장할 변수.
        Scanner scanner = new Scanner(System.in);  // 콘솔창에서 키보드로 입력받기 위한 도구.

        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
            
              int menu = scanner.nextInt();  // 1 ~ 4 정수 입력

            
            switch (menu) {
            case 1:
                System.out.print("예금액> ");
                int deposit = scanner.nextInt();
                balance += deposit; // 잔고에 예금액만큼 추가.
                break;
            case 2:
                System.out.print("출금액> ");
                int withdraw = scanner.nextInt();
                balance -= withdraw; //잔고에서 출금액만큼 뺌.
                break;
            case 3: 
                System.out.println("잔고> " + balance);
                break;
            case 4:
                run = false;  //이렇게 해줘야 while을 끝낼 수 있음 (프로그램 종료)
                break;  // switch를 끝내는 용도(while은 끝낼 수 없음)
            default:
                System.out.println("잘못 입력했습니다. 메뉴를 다시 선택하세요.");
            }
//          if (menu == 1) {
//          
//      }else if  (menu == 2) {
//          
//      }else if  (menu == 3) {
//      
//      }else if  (menu == 4) {
//          break;  // switch나 반복문을 끝내는 용도 (break가 포함되어 있는 while을 끝내는 용도)
//      }else {
//          
//      }            
            
        }

        System.out.println("프로그램 종료");
        
    }
        
}
