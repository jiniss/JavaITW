package edu.java.inheritance03;

public class InheritanceMain03 {

    public static void main(String[] args) {
        // Car 타입의 객체 생성
        Car sonata = new Car(100, 60);
        sonata.drive();
        
        //HybridCar 타입의 객체 생성
        HybridCar x3 = new HybridCar(50, 60, 100);
        x3.drive();  //하위 클래스에서 override된 메서드를 호출
        
        //다형성(polymorphism): 하나의 객체를 두 개 이상의 타입으로 부를 수 있는 것. 
        Car k8 = new HybridCar(10,10,10);  //하이브리드 자동차는 자동차이다. (O)
        //HybridCar x = new Car(10,10);  //자동차는 하이브리드 자동차이다. (X) , 컴파일 에러
        k8.drive();  //Car클래스의 메서드지만 HybridCar 메서드로 출력됨
        //다형성을 적용하더라도 override되어 있는 drive() 메서드가 실행됨!
        
        //다형성은 코드의 재사용성(reuse)을 높여줌. 중복되는 코드를 만들지 않아도 됨.
        //배열/리스트를 사용. 메서드 파라미터 선언.
        //배열을 선언할 때 상위(super) 타입의 배열로 선언하면,
        //상위 타입은 물론 그 하위 타입의 객체까지도 저장할 수 있음.
        Car[] cars = {sonata, x3};
        
        System.out.println(new Car(0, 0));  //파라미터가 Object 이면 어떤 타입이던 다 올 수 있음
        System.out.println(new HybridCar(0, 0, 0));
    }
    
    public static void test(Car car) { //다형성에 의해 HybridCar도 포함.
        
    }
    
//    public static void test(HybridCar hcar) {  //다형성 덕분에 필요가 없음.
//    }

}
