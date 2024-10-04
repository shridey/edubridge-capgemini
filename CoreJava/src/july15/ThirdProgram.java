package july15;
class Employee {
	int eid;
    String ename;
    
    double salary(double s) {
    	return s;
    }
}
public class ThirdProgram {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
	    emp.eid = 101;
	    emp.ename="Amar";
	    double salary = emp.salary(2000.0);
	    
	    System.out.println("Employee ID : " + emp.eid);
	    System.out.println("Employee Name : " + emp.ename);    
	    System.out.println("Employee Salary : " + salary);
	}
}