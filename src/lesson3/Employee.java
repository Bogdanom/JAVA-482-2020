package lesson3;

public class Employee {
	private String name;
	private int rate;
	private int hours;
		
	public Employee() {
		
	}

	public Employee(String name, int rate) {
		
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSalary() {
		return rate*hours;
	}
	
	public double getBonus() {
		return getSalary()*0.1;
	}
	
	public void changeRate(int rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	
}
