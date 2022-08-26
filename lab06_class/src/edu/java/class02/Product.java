package edu.java.class02;

//클래스의 멤버들:
// 1. 필드(field) - 클래스의 객체들이 가질 수 있는 속성들(데이터). 변수. (userId, password, age,...)
// 2. 생성자(constructor) - 객체를 생성하고 초기화.
// 3. 메서드(method) - 클래스의 객체들이 갖는 기능(함수). 

public class Product {
    //field
    int productId; //상품 아이디(번호)
    String productName; //상품 이름
    int price; //상품 가격
    
    //constructor
    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price; //this 생략 불가(구별해줘야되므로. this는 가장 가까운 변수를 가리킴)
    }
    
    //method
    public void setPrice(int price) {
        this.price = price;
    }
    
}
