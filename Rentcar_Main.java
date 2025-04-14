package class_implementation;

public class Rentcar_Main {
	public static void main(String[] args) {
		Employee_Class e;
		e= new Employee_Class();
		e.setEmployee("A", "Sales", 30, "CEO");
		System.out.println("Name = " + e.getName());
		e.setEmployee("B", "Sales", 32, "Manager");
		System.out.println("Name = " + e.getName());
		}
		}

