package lesson3;
public class HW_3 {

	public static void main(String[] args)  {
		
		Person person1 = new Person();
		person1.input("leh", "stor", 1988); 
		Person person2 = new Person();
		person2.input("mari", "sten", 1989); 
		Person person3 = new Person();
		person3.input("nat", "lev", 1992); 
		
		
		person1.output();
		person2.output();
		person3.output();
		
		person2.changeLastName("rend");
		System.out.println("Employee with changed name ");
		person2.output();
		
	}
}
