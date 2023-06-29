package ch03_연산자;

/*
 * 논리연산자
 * 1. && -> and(그리고) - 곱
 * true && false => false
 * 1 * 0 => 0 (1은 true, 0은 false)
 * 
 * 2. || -> or(또는)    - 합
 * true || false => true
 * 1 + 0 => 1 (1은 true, 0은 false)
 * 
 * 3. !  -> not(부정)   - 반전
 * !(true || false) => false
 * !true => false
 */

public class Operator02 {

	public static void main(String[] args) {
		final int MAX = 100;
		final int MIN = 0;
		int num = -10;
		System.out.println(MIN < num && MAX > num);
		//  || -> 또는 을 의미  && -> 그리고 를 의미
		//  || 썼을 때 하나라도 참이면 참으로 나타나고, && 썼을 때 하나라도 거짓이면 거짓으로 나타남
		
		int year = 2000;
		System.out.println(year % 4 == 0);
		System.out.println(year % 100 != 0);
		System.out.println(year % 400 == 0);
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		System.out.println(!(year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0);  // ? 앞에 조건이 참인지 물어보는 것
		
		int result = 10 + 1;
		System.out.println(result);
		
		boolean result2 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result2);
		
		int result3 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;  // int 로 바뀌어서 int에 넣을 수 있음
		System.out.println(result3);
		
		String result4 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "1" : "0";  // String 으로 바뀌어서 String에 넣을 수 있음
		System.out.println(result4);
	}

}
