package edu.java.modifier07;

//객체(object): 프로그램에서 만들 대상.(ex. 붕어빵. 추상명사의 느낌)
//클래스(class): 객체를 생성하기 위한 설계도. 데이터 타입.(ex. 붕어빵 틀)
//인스턴스(instance): 메모리에 생성된 객체.(ex. 진열되어 있는 만들어진 붕어빵)(객체와 거의 비슷한 개념)

//인스턴스 멤버(변수/필드, 메서드)
// - static 수식어가 사용되지 않은 멤버.
// - 객체를 생성한 후에, 참조 변수를 이용해서 사용.
// - Java Runtime이 사용하는 메모리 공간 중 Heap(힙) 영역에 생성됨.

//static 멤버(변수/필드, 메서드)
// - static 수식어가 사용된 멤버.
// - 객체를 생성하지 않아도 사용할 수 있는 멤버.
// - 클래스 이름을 이용해서 사용. (예) Math.PI, Math.sqrt()
// - Java Runtime이 사용하는 메모리 공간 중 Method(메서드) 영역에 생성됨.
// - 프로그램 로딩 시점(main 메서드 시작 전)에 메모리에 생겨남.
// - static 멤버들은 static 멤버들만 접근(사용) 가능.

//final 수식어: 클래스, 멤버(필드/변수, 생성자, 메서드), 지역 변수에 사용됨.
//final 지역 변수: 값이 한번 저장되면 변경할 수 없는 변수. 
//final 멤버 변수: 객체가 생성될 때 값이 초기화되면 변경할 수 없는 멤버 변수.

public class ModifierMain07 { //class에 static 붙일 수 없음.

    public static void main(String[] args) {
        // static 멤버(변수, 메서드)는 클래스 이름으로 참조해서 사용.
        System.out.println(StaticTest.staticVariable);
        StaticTest.staticVariable = 100;
        StaticTest.printVariables2();
        
        System.out.println();
        //인스턴스 멤버(변수, 메서드)는 객체 생성 후 참조 변수를 이용해서 사용.
        StaticTest test1= new StaticTest();  //지역변수 앞에 static, public, private 붙일 수 없음.
        System.out.println(test1.instanceVariable);
        System.out.println(test1.staticVariable);
        //static 변수를 참조 변수를 이용해서 사용할 수는 있지만, 권장하지 않는 방법.
        //마치 종속된 변수인 것처럼 보이므로 '클래스이름.static변수'로 사용하는 것이 바람직.
        
        //바꾸고 싶은 단어 블록 후 Refactor -> Rename 하면 한번에 바꾸기 가능.
        
        test1.instanceVariable = 10;
        test1.printVariables();
        
        StaticTest test2 = new StaticTest();
        test2.printVariables();
 
        final int number = 100;
//        number = 200;  //final 지역 변수의 값은 변경할 수 없음.
        
        FinalTest ftest = new FinalTest(100);
        System.out.println(ftest.getNumber());
    
    
    }

}
