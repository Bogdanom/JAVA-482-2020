package lesson3;

public class Appl25 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Oleg",10,160);
		Employee employee2 = new Employee("Anna",8);
		employee2.setHours(150);
		Employee employee3 = new Employee();
		employee3.setName("Marry");
		employee3.setRate(5);
		employee3.setHours(120);
		
		System.out.println("Our employees");
		System.out.print(employee1);
		System.out.print(" Salary = "+employee1.getSalary());
		System.out.println(" Bonus = "+employee1.getBonus());
		System.out.print(employee2);
		System.out.print(" Salary = "+employee2.getSalary());
		System.out.println(" Bonus = "+employee2.getBonus());
		System.out.print(employee3);
		System.out.print(" Salary = "+employee3.getSalary());
		System.out.println(" Bonus = "+employee3.getBonus());
		System.out.println();
		
		double sum=employee1.getSalary()+employee2.getSalary()+employee3.getSalary();
		System.out.printf("Salary of all employees = "+ "%.2f",sum);
		System.out.println();
		System.out.println();
		
		employee3.changeRate(7);
		System.out.println("Updated info");
		System.out.print(employee3);
		System.out.print(" Salary = "+employee3.getSalary());
		System.out.println(" Bonus = "+employee3.getBonus());
		
		sum=0;
		sum=employee1.getSalary()+employee2.getSalary()+employee3.getSalary();
		System.out.println();
		System.out.printf("Salary of all employees = "+ "%.2f",sum);
		
		
	}

}
