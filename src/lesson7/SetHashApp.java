package lesson7;

import java.util.HashSet;
import java.util.Set;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
public class SetHashApp {
    public static void main(String args[ ]){
    	
    	// we should override hashcode and equals
    			Student[] arr = { new Student(1, "Ivan"), new Student(1, "Ivan"), new Student(2, "Petro"), 
    					new Student(1, "Ivan"), new Student(2, "Petro"), new Student(1, "Ivan") };
    			Set<Student> s = new HashSet<>();
    			for (int i = 0; i < arr.length; i++) {
    				if (!s.add(arr[i])) {
    					System.out.println("i= " + i + " Duplicate detected: " + arr[i]);
    				}
    			}
    			System.out.println(s.size() + " distinct words detected: " + s);
    	
    	/*-
    	//find duplicated elements of the command line + print all unique elements
        Set<String> s = new HashSet<>( );
        for (int i = 0; i < args.length; i++) {
            if (!s.add(args[i])) {
		   System.out.println("Duplicate detected: " + args[i]);
        }
        }
        System.out.println(s.size( ) + 	" distinct words detected: " + s);
        */
    }
}