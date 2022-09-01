package edu.java.inheritance02;

public class SubClass extends SuperClass{  

    public SubClass() {
        super(0);
        //superclass가 기본 생성자를 갖고 있지 않기 때문에,
        //명시적으로(explicitly) superclass의 argument를 갖는 생성자를 호출해야만 함! 
        //반드시 어떤 값을 채우기 위한 목적으로 기본생성자 없는 부모클래스를 상속하는 경우가 있음.
    }
    
    public SubClass(int a) {
        super(a);
    }
    
}
