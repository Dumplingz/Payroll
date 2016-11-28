public class HourlyEmployee implements Employee {
	private String name;
	private double salary;
	private int workerNumber;
	private static int workersNumber = 1;
	private static final double OVERTIME_HOURS = 40;
	private static final double OVERTIME_MULTIPLIER = 1.5;
 
	private double hoursWorked;
 
	private HourlyEmployee(double salary, double hoursWorked) {
		super();
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}
 
	public HourlyEmployee createHourlyWorker(double salary, double hoursWorked) {
		HourlyEmployee worker = new HourlyEmployee(salary, hoursWorked);
		worker.setWorkerNumber(workersNumber);
		workersNumber++;
		return worker;
	}
 
	public HourlyEmployee createHourlyWorker(double salary) {
		return createHourlyWorker(salary, 0);
	}
 
	public void setHourlySalary(double salary) {
		this.salary = salary;
	}
 
	public double getHourlySalary() {
		return salary;
	}
 
	public void setHoursWorked(double hours) {
		this.hoursWorked = hours;
	}
 
	public double getHoursWorked() {
		return this.hoursWorked;
	}
	
	public void setName(String name) {
		this.name = name;
	}
 
	public String getName() {
		return this.name;
	}
	
	public int getWorkerNumber() {
		return this.workerNumber;
	}
	
	private void setWorkerNumber(int number) {
		this.workerNumber = number;
	}

	public double calculatePay() {
		if (hoursWorked > OVERTIME_HOURS) {
			return (OVERTIME_HOURS * salary) + ((hoursWorked - OVERTIME_HOURS) * salary * OVERTIME_MULTIPLIER);
		} else {
			return hoursWorked * salary;
		}
	}
 
}