package edu.java.variable03;

public class VariableMain03 {

	public static void main(String[] args) {
		// boolean 타입: true(참) 또는 false(거짓)을 저장하는 타입.
		// 비교 연산자: ==, !=, >, >=, <, <=
		// 논리 연산자: &&, ||, !
		
		boolean isEqual = (2 == 3);  //2와 3이 같은가?
		System.out.println(isEqual);
		
		boolean isNotEqual = (2 != 3);  //2와 3이 다른가?
		System.out.println(isNotEqual);
		
		int x = 99;
		boolean b = (x >= 90) && (x < 100); //왼쪽 조건도 만족하고 오른쪽 조건도 만족하는가?
		System.out.println(b);

	}

}
