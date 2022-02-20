package lesson7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student1 implements Comparable<Student1> {
	private int id;
	private String name;

	public Student1(int id, String name) {
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
		return "Stud [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student1 o) {
		return name.compareTo(o.name);
	}
	public static class StudentById implements Comparator<Student1> {
		@Override
		public int compare(Student1 o1, Student1 o2) {
			return o1.getId() - o2.getId();
		}
	}
}
public class SetTreeSortAppl {

	public static void main(String[] args) {

		// Set<Student1> set = new TreeSet<>(); //by default set is sorted by name
		Set<Student1> set = new TreeSet<>(new Student1.StudentById()); // set is sorted by id
		set.add(new Student1(11, "Ivan"));
		set.add(new Student1(2, "Petro"));
		set.add(new Student1(1, "Anna"));
		System.out.println("Original, just sorted, Set: " + set);
	}
}
