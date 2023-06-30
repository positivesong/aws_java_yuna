package ch15_오브젝트;

public class ToStringMain {

	public static void main(String[] args) {
		KoreaStudent koreaStudent = new KoreaStudent("20230001", "송유나");
		
		System.out.println(koreaStudent.toString());  // toString 은 값을 확인할 때
		String str = koreaStudent.toString();
	}

}
