
public class StudentTester {

	public static void main(String[] args) {
		Student student = new Student();
		student.setScore(1, 90);
		student.setScore(2, 80);
		student.setScore(3, 90);
		
		System.out.println(student.getAverage());
	}

}
