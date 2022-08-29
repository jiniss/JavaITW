package edu.java.class05;

public class ClassMain05 {

    public static void main(String[] args) {
        //Score 타입의 객체 생성, 메서드들을 테스트.
        Score score1 = new Score();
            
        System.out.println(score1.korean);
        System.out.println(score1.english);
        System.out.println(score1.math);
        
        Score score2 = new Score(100, 80, 95);
        System.out.println("국어 : " + score2.korean());
        System.out.println("영어 : " + score2.english());
        System.out.println("수학 : " + score2.math());
        System.out.println("총점 : " + score2.total());
        System.out.println("평균 : " + score2.mean());
        
        //student 타입의 객체 생성, 메서드를 테스트.
        Student stu1 = new Student();
        System.out.println(stu1.stuNo);
        System.out.println(stu1.stuName);
        System.out.println(stu1.score);
        
        Student stu2 = new Student(123412, "name", 100, 80, 95);
        System.out.println(stu2.stuNo);
        System.out.println(stu2.stuName);
        System.out.println(stu2.score);
        
        Student stu3 = new Student(123412, "name", 100, 80, 95);
        System.out.println(stu3.stuNo);
        System.out.println(stu3.stuName);
        System.out.println(stu3.score);
        
        
    }

}
