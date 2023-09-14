package lesson6.hw_6_2;

import java.util.Arrays;
import java.util.Comparator;

public class HW_6_2 {

	public static void main(String[] args) {
		/*
		 * //sorting by salary Empl_payments[] empl = { new
		 * SalariedEmployee(19L,"Olga","sn123"), new
		 * ContractEmployee(11L,"Ivan",8,"fn123"), new
		 * ContractEmployee(14L,"Petro",12,"fn345"), new
		 * SalariedEmployee(18L,"Ira","sn223")};
		 */
		/*- */
		// sorting by id
		Employee[] empl = { new SalariedEmployee(19L, "Olga", "sn123"), 
				new ContractEmployee(11L, "Ivan", 8, "fn123"),
				new ContractEmployee(14L, "Petro", 12, "fn345"), 
				new SalariedEmployee(8L, "Ira", "sn223") };

		System.out.println("Original list ");
		for (Empl_payments empl_current : empl) {
			System.out.println(empl_current);
			System.out.println("\t\tSalary: " + empl_current.calculatePay());
		}
		 Arrays.sort(empl); // sort by salary
//        Arrays.sort(empl, new EmployeeSort()); // sort by id
//		Arrays.sort(empl, new EmployeeSortName()); // sort by name
		System.out.println("Sorted list: ");
		for (Empl_payments empl_current : empl) {
			System.out.println(empl_current);
			System.out.println("\t\tSalary: " + empl_current.calculatePay());
		}
	}
}

class EmployeeSort implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		double o1 = emp1.getId();
		double o2 = emp2.getId();
		 return o1<o2?-1:o1>o2?1:0; //ascending id
//		return o1 < o2 ? 1 : o1 > o2 ? -1 : 0; // descending id
	}
}

class EmployeeSortName implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName()); //ascending name
//		return emp2.getName().compareTo(emp1.getName()); // descending name
	}
}
