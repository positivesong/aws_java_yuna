package ch03_연산자;

public class Operator04 {

	public static void main(String[] args) {
		int score = 80;
		
		String result = score < 0 || score > 100 ? "X" 
				: score > 89 ? "A" 
				: score > 79 ? "B" 
				: score > 69 ? "C"
				: score > 59 ? "D"
				: "F";
		
		System.out.println(result);
		
		System.out.println((score > 100) ? "100점 보다 큼" :
			(score >= 90) ? "A" :
				(score >= 80) ? "B" :
					(score >= 70) ? "C" :
						(score >= 60) ? "D" :
							(score >= 60) ? "F" : "X");
		
		
		
	}

}
