package ch02_변수;

public class Variabe {

	public static void main(String[] args) {
		
		String num1 = "10";
		int num2 = 10;
		System.out.println("String: " + num1);
		System.out.println("int: " + num2);
		System.out.println(num1 + num2);   // = ("10" + 10);
		
		char num3 = '5';
		System.out.println(num3 + num2);  // 연산에 의해 53으로 강제 캐스팅됨
		System.out.println((int) num3);   // 내가 직접 캐스팅 시키는 법
		System.out.println((double) num3);   // 내가 직접 캐스팅 시키는 법
		
		// 1. 묵시적 형변환(업캐스팅일 때만 가능 : 문자 -> 정수 -> 실수)
		int num4 = (int) num3;   // num4는 문자 5인 num3을 정수 53으로 업캐스팅 한 것과 같다
		System.out.println(num4);
		// 2. 명시적 형변환(다운캐스팅일 때만 가능 : 실수 -> 정수 -> 문자)
		char num5 = (char) num4;   // num5는 정수 53인 num4를 문자 5로 다운캐스팅 한 것과 같다
		System.out.println(num5);  // 아스키코드에 의한 정수53와 문자5로 바뀜
		
	}

}
