package ch04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		int age = 0;
		String phone = "";
		String address = "";
		String gender = "";
		
		System.out.print("이름: ");
		name = scanner.next();  // next는 엔터와 스페이스바 무시함(엔터, 스페이스바 버퍼가 남는다)
		
		System.out.print("나이: ");
		age = scanner.nextInt();  // nextLine 외는 전부 next
		
		System.out.print("연락처: ");
		phone = scanner.next();
		scanner.nextLine();  // 엔터 버퍼를 없애기 위해서 nextLine 추가
		
		System.out.print("주소: ");
		address = scanner.nextLine();
		
		System.out.print("성별: ");
		gender = scanner.next();
		
		System.out.println("고객님의 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
		System.out.println("연락처는 " + phone + "이며 주소는 " + address + " 입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		
		/*
		 * 이름(name): 
		 * 나이(age): 
		 * 연락처(phone): 
		 * 주소(address): 
		 * 성별(gender): 
		 * 
		 * 고객님의 이름은 송유나이고 나이는 31세 입니다.
		 * 연락처는 010-9047-4007이며 주소는 부산 동래구 사직동 입니다.
		 * 성별은 여입니다.
		 */
	}

}
