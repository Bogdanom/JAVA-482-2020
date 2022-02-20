package lesson7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student3 implements Comparable<Student3> {
	
	private int id;
	private String name;

	public Student3(int id, String name) {
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
	public int compareTo(Student3 o) {
		return name.compareTo(o.name);
	}
	public static class StudentById implements Comparator<Student3> {
		@Override
		public int compare(Student3 o1, Student3 o2) {
			return o1.getId()-o2.getId();
		}
	}
}
public class ListArraySortAppl {

	public static void main(String[] args) {
		/*-*/
		List<Student3> list = new ArrayList<>();
		list.add(new Student3(11, "Ivan"));
		list.add(new Student3(2, "Petro"));
		list.add(new Student3(1, "Anna"));
		System.out.println("Original List: " + list);
		//Collections.sort(list);   //sort by name, we should use Comparable
		//Collections.sort(list, new Student3.StudentById());//sort by id,should use Comparator	
		list.sort(new Student3.StudentById()); //do the same as previous line
		System.out.println("Sorted List: " + list);
		
		/*-
		 // array sorting by name (Student3 implements Comparable, 
		 // override compareTo method in the Student3 class
		 
		Student3[] arr = { new Student3(1, "Ivan"), new Student3(2, "Petro"), new Student3(11, "Anna") };
		System.out.println("Original Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		*/
	}
}