package july23.abstraction;

abstract class Employee {
	abstract void displayName();
	void displaySalary() {
		System.out.println("Salary: " + 666);
	}
}

public class AbstractDemo extends Employee {
	
	public static void main(String[] args) {
		AbstractDemo ad = new AbstractDemo();
		ad.displayName();
		ad.displaySalary();
		
		Employee emp = new AbstractDemo();
		emp.displayName();
		emp.displaySalary();
	}

	@Override
	void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + "Shridhar");
	}
}
