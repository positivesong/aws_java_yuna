package ch03_연산자;

public class Operator01 {
	public static void main(String[] args) {
		System.out.println(3 / 2);  // 연산자는 가독성을 위해 숫자 사이를 띄어서 씀
		
		int num = 10;
		System.out.println(num++);  // 뒤에++는 다음이 증가됨(메모리에 ++가 출력되지 않음)
		System.out.println(num++);
		System.out.println(num);
		System.out.println(++num);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num++);
		System.out.println(num);
	}
}
