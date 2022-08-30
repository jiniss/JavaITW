package edu.java.modifier04;

public class ModifierMain04 {

    public static void main(String[] args) {
        //Member 타입의 객체 생성.
        Member member1 = new Member("qwer1234", "123450") ;
        System.out.println(member1.getId());
        //m.id = "";  //private 멤버는 다른 클래스에서 직접 사용할 수 없음.
        System.out.println(member1.getPassword());        
        member1.setPassword("789560");
        System.out.println(member1.getPassword());
        
        System.out.println("-------------------");
        Member member2 = new Member("idididid", "111444");
        System.out.println(member2.getId());
        System.out.println(member2.getPassword());
        member2.setPassword("ssss233");
        System.out.println(member2.getPassword());
    
    
    }

}
