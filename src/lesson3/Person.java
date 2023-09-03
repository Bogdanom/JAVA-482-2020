package lesson3;
import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private int    birthYear;
	
	public void input(String firstName,String lastName, int birthYear)   {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
	}
	public void output() {
		System.out.print("Employee - First name: " + getFirstName());
		System.out.print("; Last name: " + getLastName());
		System.out.println("; Age: " + getAge());
	}
			
	public int getAge() {
		return LocalDate.now().getYear()-getBirthYear();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void changeLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}