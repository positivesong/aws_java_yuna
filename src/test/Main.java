package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

//	public static void main(String[] args) {
//		Calculator calculator = new Calculator();
//		
//		calculator.add(10, 20);
//		calculator.sub(200, 100);
//	}
	
//	public static void main(String[] args) {
//		List<String> subjects = Arrays.asList(new String[]{"C", "Java", "Python"});
//		SubjectService subjectService = new SubjectService(subjects);
//		subjectService.showSubjects();
//	}
	
//	public static void main(String[] args) {
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(1001, "홍길동"));
//		students.add(new Student(1002, "강철수"));
//		students.add(new Student(1003, "김영희"));
//		
//		for(Student student : students) {
//			student.showStudent();
//		}
//	}
	
//	public static void main(String[] args) {
//		Order order = null;
//		order.showOrderInfo();
//	}
	
	public static void main(String[] args) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Product product = new Product (2001, "laptop", "Samsung GalaxyBook", 1400000);
        System.out.println(gson.toJson(product));

    }
	
	
	
}
