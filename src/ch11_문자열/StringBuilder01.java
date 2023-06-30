package ch11_문자열;

public class StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("이름: ");  // append는 제일 끝에 붙임(추가)
		builder.append("송유나");
		builder.delete(builder.indexOf(":"), builder.indexOf(":") + 1);
		builder.insert(2, ">>");  // insert는 중간에 문자 삽입
		
		String str = builder.toString();
		System.out.println(str);
		
		String name = "이름: 송유나";
		
		System.out.println(
				name.substring(0, name.indexOf(":"))
				.concat(name.substring(name.indexOf(":") + 1)));
		
		System.out.println(
				name.substring(0, 2)
				.concat(name.substring(3)));
		
	}

}
