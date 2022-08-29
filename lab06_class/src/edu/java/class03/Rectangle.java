package edu.java.class03;


//class = field + constructor + method ==> data type
public class Rectangle {
    //field - 가로, 세로
    double width;
    double height;
    
    //constructor - 기본 생성자, argument 2개를 갖는 생성자
    public Rectangle() {}
        
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //method - 둘레 길이 리턴, 넓이 리턴
    public double perimeter() { //클래스가 가진 속성들을 활용
        return 2 * (this.width + this.height); //this = '만들어져있는' 직사각형
        //시각적으로 확실하게 하기 위해 this 붙임
        
    }
    public double area() {
        return this.width * this.height;
    }

}
