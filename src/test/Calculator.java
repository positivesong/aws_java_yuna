package test;

public class Calculator {
	
	int num1;
    int num2;
    
	int add(int num1, int num2) {
		System.out.println(num1 + num2);
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		System.out.println(num1 - num2);
		return num1 - num2;
	}

}

//클래스(Class)명	Calculator
//접근지정자	public
//메소드(Method) 명	add
//입력 매개변수(타입/명)	int num1, int num2
//반환값(타입)	int
//처리 내용	return num1 + num2

//메소드(Method) 명	sub
//입력 매개변수(타입/명)	int num1, int num2
//반환값(타입)	int
//처리 내용	return num1 - num2