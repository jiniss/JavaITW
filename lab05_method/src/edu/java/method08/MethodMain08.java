package edu.java.method08;

public class MethodMain08 {

    public static void main(String[] args) {
        // main 메서드의 arguments
        System.out.println("args length = " + args.length);
        // new String[0]; : 원소를 하나도 갖지 않은 배열
        // null : 배열 자체가 없음
        for(String arg : args) {
            System.out.println(arg);
        }
        
    }

}
