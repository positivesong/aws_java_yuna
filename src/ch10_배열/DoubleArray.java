package ch10_배열;

public class DoubleArray {

	public static void main(String[] args) {
		String[][] students = new String[2][2];
		
		students[0][0] = "송유나";
		students[0][1] = "이설아";
		students[1][0] = "양산";
		students[1][1] = "울산";
		
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students[i].length; j++) {
				System.out.println(students[i][j]);
			}
		}
		
	}

}
