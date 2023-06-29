package ch08_생성자;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("송유나", 31, "양산시");
		System.out.println(s1);
//		s1.name = "송유나";
//		s1.age = 31;
//		s1.address = "양산시";
		
		System.out.println(s1.name);
		
	}

}
