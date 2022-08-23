package edu.java.loop09;

public class LoopMain09 {

    public static void main(String[] args) {
        //Ex 4-2
        
        // 1부터 10까지 자연수들의 합 : sum = 1 + 2 + 3 + ... + 99 + 100
//        int sum = 0;
//        for (int n = 1; n <= 10; n++) {
//            sum += n;  // sum = sum + n;
//            System.out.println(n);
//        } 
//        System.out.println(sum);
        
        // 2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성

        int sum = 0;

        for (int n = 3; n <= 100; n+=3) {
            sum += n;
                System.out.print(n + " ");
            }
        System.out.println();
        System.out.println("3의 배수들의 합 = " + sum);
        
        System.out.println("----------");
        
        
        sum = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) {
                sum += n; 
            }
        }
        System.out.println("3의 배수들의 합 = " + sum);
        
        System.out.println("----------");
        
        
        sum = 0;  //3의 배수들의 합을 저장할 변수
        int n = 1;  //시작값은 자연수
        while (n <= 100) {  //100 이하의 자연수들 중에서
            if (n % 3 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println("3의 배수들의 합 = " + sum);


        
        
    }

}
