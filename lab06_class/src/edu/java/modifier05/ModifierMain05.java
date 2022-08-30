package edu.java.modifier05;

import edu.java.modifier06.PublicClass;
//import edu.java.modifier06.PackageClass;  //public이 아닌 클래스는 다른 패키지에서 사용할 수 없음

//클래스의 접근제한 수식어(access modifier)
//1. public: 어디에나 공개된 클래스.(import 문장을 사용해서 변수 선언, 객체 생성 가능)
//2. (package): 수식어가 없는 경우. 같은 패키지에 속한 클래스들에게만 공개된 클래스.
//public class의 이름은 java 파일의 이름과 같아야 함! (그냥 클래스는 상관없으므로 여러개도 있을 수 있음)
//한 개의 java 파일에서 여러개의 클래스를 정의하는 것은 가능하지만,
//public class는 오직 한 개만 정의할 수 있음.
//한 개의 java 파일에서 여러개의 클래스를 정의하면, 컴파일 후에는 각각의 class 파일들이 생성됨.

class A{}

//(예) class ModifierMain05
public class ModifierMain05 {

    public static void main(String[] args) {
        // edu.java.modifier06.PublicClass 타입 객체 생성
        PublicClass cls = new PublicClass();
        System.out.println(cls);
        
        A a = new A();
        System.out.println(a);
    }

}
