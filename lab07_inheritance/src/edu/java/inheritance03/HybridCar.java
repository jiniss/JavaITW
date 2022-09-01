package edu.java.inheritance03;

public class HybridCar extends Car{
    //field
    private int battery;
    
    
    public HybridCar(double fuel, double speed, int battery) {
        super(fuel, speed);
        this.battery = battery;
    }
    
    //메서드/생성자 overload:
    //파라미터가 다르면 같은 이름으로 여러개의 메서드/생성자를 만드는 것.
    
    //메서드 override:
    //상위 클래스의 메서드를 하위 클래스에서 재정의하는 것.
    //리턴 타입, 메서드 이름, 파라미터 선언이 모두 같아야 함.
    //접근제한 수식어는 상위 클래스에서의 수식어보다 범위가 같거나 넓어질 수 있음.(보통 똑같이 만듦)
    //ex)부모:protected로 선언 - 자식:protected나 public로 선언 (범위: public>protected)
    
    @Override  //애너테이션(annotation): 항상 필수적인건 아니지만 밑의 메서드를 override라고 선언해주는 역할
                //선언시 override를 문법에 맞게 잘 썼는지 이클립스가 검사해주므로 써주는 게 좋음
    public void drive() {
        System.out.println("speed: " + getSpeed() + ", fuel: " + getFuel() + ", battery: " + battery);
    }
    
    
}
