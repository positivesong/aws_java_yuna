package ch22_익명클래스;

public class LambdaTest {

	public static void main(String[] args) {
		
		GrantedAuthorities authorities2 = new GrantedAuthorities() {
			@Override
			public String getAuthority() {
				System.out.println("권한출력");
				return "ROLE_USER";
			}
		};  // 아래를 이해하기 위한 참고 코드(아래와 결과는 동일)
		
		
		GrantedAuthorities authorities = () -> {  // interface 에는 딱 하나의 함수만 정의되있어야함.(클래스도 함수도 없기 때문에)
			System.out.println("권한출력");
			return "ROLE_USER";
		};
		// GrantedAuthorities 메소드(함수)를 정의한 하나의 객체가 됨.
		
		GrantedAuthorities authorities3 = () -> "ROLE_USER";
		
		System.out.println(authorities.getAuthority());
	}

}
