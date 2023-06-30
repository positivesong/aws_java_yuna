package ch15_오브젝트;

public class EqualsMain {

	public static void main(String[] args) {
		KoreaStudent koreaStudent1 = new KoreaStudent("20230001", "송유나");
		KoreaStudent koreaStudent2 = new KoreaStudent("20230002", "이설아");
		KoreaStudent koreaStudent3 = new KoreaStudent("20230003", "설유진");
		KoreaStudent koreaStudent4 = new KoreaStudent("20230001", "송유나");
		
		// 메모리 주소 비교
		System.out.println(koreaStudent1 == koreaStudent4);
		// 데이터(값) 비교
		System.out.println(koreaStudent1.getStudentCode() == koreaStudent4.getStudentCode()
				&& koreaStudent1.getName() == koreaStudent4.getName());
		
		System.out.println(koreaStudent1.equals(koreaStudent4));  // equals 는 같다라는 뜻
	}

}
