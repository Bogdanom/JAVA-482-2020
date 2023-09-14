package lesson6.hw_6_2;
public abstract class Employee implements Empl_payments, Comparable<Employee> {
	private long id;
	private String name;
	
	public Employee(long id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " id: " + id + ", name: " + name + " ";
	}
		@Override
		public int compareTo(Employee employee) {
			double o1=calculatePay();
			double o2=employee.calculatePay();
			return o1<o2?-1:o1>o2?1:0; //ascending salary
//			return o1<o2?1:o1>o2?-1:0; //descending salary
		}
		
	}
	

