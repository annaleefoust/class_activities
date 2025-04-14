package class_implementation;

public class Run_JAVA {
	public static void main(String[] args) {
		String studentInfo = null;
		HighSchool h = new HighSchool("A", 13);
		University u = new University("B", 3, "Business");
		studentInfo = h.getStudent();
		System.out.println("Student info = " + studentInfo);
		studentInfo = u.getStudent();
		System.out.println("Student info = " + studentInfo + ", Major : " +
		u.getMajor());
		}
}
