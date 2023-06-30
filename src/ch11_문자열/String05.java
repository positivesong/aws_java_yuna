package ch11_문자열;

public class String05 {

	public static void main(String[] args) {
		String name = " ";
		
		boolean flag = name.isBlank();  // 공백도 비었다고 봄 *더 많이 쓰임
		System.out.println(flag);
		
		boolean flag2 = name.isEmpty();  // 공백도 문자로 봄
		System.out.println(flag2);
	}

}
