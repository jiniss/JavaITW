package edu.java.class04;

public class ClassMain04 {

    public static void main(String[] args) {
        //기본 생성자 이용.
        Circle cir1 = new Circle();
        System.out.println(cir1);
        System.out.println("cir1 반지름 : " + cir1.radius);
        System.out.println("cir1 둘레 : " + cir1.perimeter());
        System.out.println("cir1 넓이 : " + cir1.area());
        
        //argument를 갖는 생성자 이용.
        Circle cir2 = new Circle(10);
        System.out.println(cir2);
        System.out.println("cir2 반지름 : " + cir2.radius);
        System.out.println("cir2 둘레 : " + cir2.perimeter());
        System.out.println("cir2 넓이 : " + cir2.area());
        
        //생성자를 호출할 때마다 메모리의 다른 주소에 다른 객체가 만들어짐.        
        Circle cir3 = new Circle(10);
        System.out.println(cir3);
        
    }

}
