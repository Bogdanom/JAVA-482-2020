package lesson5;

import java.util.Scanner;

class Employee {
	private String name;
	private int departmentNumber;
	private double salary;

	public Employee(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}

}

public class Appl_slide_PT_2 {

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0] = new Employee("Ivan", 1, 2000);
		emp[1] = new Employee("Petro", 2, 1000);
		emp[2] = new Employee("Stepan", 1, 1500);
		emp[3] = new Employee("Vasyl'", 3, 3000);
		emp[4] = new Employee("Iryna", 2, 1000);
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Department Number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Employees from Department " + num);
		for (Employee currentEmp : emp) {
			if (currentEmp.getDepartmentNumber() == num) {
				System.out.println(currentEmp);
			}
		}
		//
		double avg = 0;
		for (Employee currentEmp : emp) {
			avg = avg + currentEmp.getSalary();
		}
		System.out.println("avarage salary is " + (avg / emp.length));
		//
		System.out.println("Original Employee Array");
		for (Employee currentEmp : emp) {
			System.out.println(currentEmp);
		}
		// Sort
		Employee tmp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = 0; j < emp.length - 1 - i; j++) {
				if (emp[j].getSalary() < emp[j + 1].getSalary()) {
					tmp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = tmp;
				}
			}
		}
		System.out.println("Sorted Employee Array by Salary");
		for (Employee currentEmp : emp) {
			System.out.println(currentEmp);
		}
	}

}
