package edu.java.condition04;

import java.util.Random;

public class ConditionMain04 {

    public static void main(String[] args) {
        // Random 클래스: 난수를 발생시키는 기능을 가지고 있는 클래스.
        Random random = new Random(); // Random 타입의 변수를 선언, 초기화.
        
        // 0 이상 10 이하(11 미만)의 정수 난수 생성.
        int x = random.nextInt(11);  //11 미만이라는 뜻, 11개의 숫자 랜덤 생성
        System.out.println("x = " + x);
        
        int y = random.nextInt(11);
        System.out.println("y = " + y);
        
        // 두 숫자 x와 y의 차이(큰 수 - 작은 수)를 계산.
        int diff;
        
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        System.out.println("diff = " + diff);
        
        // 삼항 연산자
        // (조건식) ? 조건이 참일 때 선택할 값 : 조건이 거짓일 때 선택할 값
        int diff2 = (x > y) ? (x - y) : (y - x);
        System.out.println("diff2 = " + diff2);
        
        // 0 이상 10 이하(11 미만)의 정수 난수를 생성해서 변수(z)에 저장.
        // 문자열 변수를 선언, 변수 z가 짝수이면 "even", 홀수이면 "odd"를 저장.
        // 문자열 (even/odd)을 출력.
        
        int z = random.nextInt(11);
        System.out.println("z = " + z);
        
        String num = (z % 2 == 0) ? ("even") : ("odd"); // 괄호 없어도 됨
        System.out.println("number = " + num);
        
        
        //2
        String evenOrOdd;
        if (z % 2 ==0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }
        System.out.println(z + " : " + evenOrOdd);
        
        // 0 이상 10 이하(11 미만)의 정수 난수 2개를 저장.
        // int 타입 변수 bigger에 두 난수 중에서 더 크거나 같은 숫자를 저장.
        // bigger를 출력.
        
        int a = random.nextInt(11);
        System.out.println("a = " + a);
        
        int b = random.nextInt(11);
        System.out.println("b = " + b);

        int bigger = (a >= b) ? a : b; 
        System.out.println("bigger = " + bigger);
        
        
        //2
        int bigger2;
        if (a > b) {
            bigger2 = a;
        } else bigger2 = b;
        
        System.out.println(a + " : " + b + " : " + bigger2);
        
    }

}
