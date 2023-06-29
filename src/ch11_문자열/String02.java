package ch11_문자열;

public class String02 {

	public static void main(String[] args) {
		String phone = "010-9047-4007";
		
		int index = phone.indexOf("-");  // 해당 문자의 위치를 가지고 옴
		int lastIndex = phone.lastIndexOf("-");
		
		System.out.println(index);
		System.out.println(lastIndex);
		
		String midNumber = phone.substring(index + 1, lastIndex);
		System.out.println(midNumber);
		
		boolean findlag = phone.contains("9047");
		System.out.println(findlag);
	}

}
