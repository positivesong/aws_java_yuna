package ch11_문자열;

public class String07 {

	public static void main(String[] args) {
		String name = "송유나";
		String address = "양산 동면";
		
		System.out.println(name.concat(" ".concat(address)));  // 문자열 뒤에는 . 해서 함수 추가할 수 있음
	}

}
