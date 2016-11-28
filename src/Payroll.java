import java.util.ArrayList;

public class Payroll {
	ArrayList<Employee> employees;

	private Payroll() {
		this.employees = new ArrayList<Employee>();
	}

	public static Payroll createPayroll() {
		Payroll payroll = new Payroll();
		return payroll;

	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public void getTotalOwedForEmployee(int id){
		
	}
}
