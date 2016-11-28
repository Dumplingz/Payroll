public class SalariedEmployee implements Employee {
	private String name;
	private double salary;
	private int workerNumber;
	private static int workersNumber = 1;
	
	private SalariedEmployee(double salary) {
		super();
		this.salary = salary;
	}
 
	public static SalariedEmployee createSalariedWorker(double salary) {
		SalariedEmployee worker = new SalariedEmployee(salary);
		worker.setWorkerNumber(workersNumber);
		workersNumber++;
		return worker;
	}
 
	public void setYearlySalary(double salary) {
		this.salary = salary;
	}
 
	public double getYearlySalary() {
		return salary;
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
		return salary / 52.0;
	}
 
}