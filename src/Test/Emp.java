package Test;
//Method overloading
public class Emp
{
	public void empId(String name) {
		System.out.println("String Method " +name);
	}
	public void empId(String name, long phno, char block) {
		System.out.println("3Methods " +name);
		System.out.println("Ph number "+phno + "\n" + block);
	}
	//Data Types
	public void empId(int regno) {
		System.out.println("int method " +regno);
	}
	private void empId(boolean perEmp) {
		System.out.println("boolean method "+perEmp);
	}
	public void empId(String manager,String project) {
		System.out.println("String String method\n" +manager);
		System.out.println(project);
	}
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.empId("Suvi");
		emp.empId("velu", 8056054653l, 'c');
		emp.empId(1203);
		emp.empId(true);
		emp.empId("Vijay","java");
	}
}
/*
	//Diff Datatype in args
	public void empId(String name) {
		System.out.println("String method "+name);
	}
	public void empId(int id) {
		System.out.println("Emp Id "+id);
	}
	public void empId(boolean perEmp) {
		System.out.println("Boolean Method "+perEmp);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId("Priya");
		emp.empId(541);
		emp.empId(true);
		
		
	}
}
*/