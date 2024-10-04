package august01.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee {
	private int employeeID;
	private String employeeName;
	private float employeeSalary;
	private String employeeEmail;
	
	public Employee() {
		super();
	}

	public Employee(int employeeID, String employeeName, float employeeSalary, String employeeEmail) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeEmail=" + employeeEmail + "]";
	}
	
	
    public static Comparator<Employee> sortByID = new Comparator<Employee>() {
 
        public int compare(Employee e1, Employee e2) {
            return e1.employeeID - e2.employeeID;
        }
        
    };
    
    public static Comparator<Employee> sortByName = new Comparator<Employee>() {
    	 
        public int compare(Employee e1, Employee e2) {
            return e1.employeeName.compareTo(e2.employeeName);
        }
        
    };
    
    public static Comparator<Employee> sortBySalary = new Comparator<Employee>() {
   	 
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.employeeSalary - e2.employeeSalary);
        }
        
    };
	
}

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new Employee(8, "Prashant", 5645.f, "prashant@gmail.com");
		Employee e2 = new Employee(3, "Yashuman", 3754.f, "yashuman@gmail.com");
		Employee e3 = new Employee(1, "Abhishek", 9745.f, "abhishek@gmail.com");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		Iterator<Employee> it1 = employees.iterator();
		
		System.out.println("EID\tEmployeeName\tESalary\tEEmail");
		while(it1.hasNext()) {
			Employee e = it1.next();
			System.out.println(e.getEmployeeID() + "\t" + e.getEmployeeName() + "\t" + e.getEmployeeSalary() + "\t" + e.getEmployeeEmail());
		}
		
		System.out.println();
		
		Collections.sort(employees, Employee.sortBySalary);
		
		Iterator<Employee> it2 = employees.iterator();
		
		System.out.println("EID\tEmployeeName\tESalary\tEEmail");
		while(it2.hasNext()) {
			Employee e = it2.next();
			System.out.println(e.getEmployeeID() + "\t" + e.getEmployeeName() + "\t" + e.getEmployeeSalary() + "\t" + e.getEmployeeEmail());
		}
	}

}
