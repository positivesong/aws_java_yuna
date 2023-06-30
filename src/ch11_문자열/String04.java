package ch11_문자열;

public class String04 {

	public static void main(String[] args) {
		String phone = "     010-90.47   4007     ";
		
		String replacePhone = phone
				.replaceAll("-", "")  // -, 공백, . 이 있을때는 전부 없애는 걸로 바꿈
				.replaceAll(" ", "")
				.replaceAll("[.]", "");  // . 만 특이 케이스로 대괄호 안에 넣음
				// 바꾸고자 하는 코드(앞에 문자를 뒤에 문자로 바꿈)
		System.out.println(replacePhone);
		
		String phone2 = phone.trim();  // trim() 앞뒤 쪽에 실수로 넣은 공백을 없애줌 ex) 회원가입시
		System.out.println(phone2);
	}

}
