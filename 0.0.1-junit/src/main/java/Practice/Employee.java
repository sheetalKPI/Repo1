package Practice;

public class Employee implements Salary, Leaves{

	public static void main(String[] args) {
		
		Salary s = new Employee();
		s.displaySalary();
	}

	@Override
	public int displaySalary() {
	System.out.println("Salary of emp is " + 10000);
	return 100000;
		
	}

	@Override
	public int sickLeave() {
	System.out.println("Show the no of sick leaves");
	return 10;
		
	}

	@Override
	public int vacationLeave() {
	System.out.println("Show the no of vacation leave");
	return 4;
		
	}

	@Override
	public int other() {
	System.out.println("Show other leaves available");
	return 12;
		
	}

}
