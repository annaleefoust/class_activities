package class_implementation;

public class Student {
	protected String name;
	protected int year;
	public Student() {
	System.out.println("Call the Parent Class");
	}
	public String getStudent() {
	System.out.println("Call getStudent in the Parent class");
	return " Name: " + name + " , Year : " + year;
	}
}
