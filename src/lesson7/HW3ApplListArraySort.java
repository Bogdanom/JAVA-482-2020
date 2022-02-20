package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	
	private int course;
	private String name;

	public Student2(int course, String name) {
		this.course = course;
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "course=" + course + " name=" + name;
	}
	public static class Student2ByCourse implements Comparator<Student2> {
		public int compare(Student2 o1, Student2 o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
	public static class Student2ByName implements Comparator<Student2> {
		public int compare(Student2 o1, Student2 o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
}

public class HW3ApplListArraySort {

	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add( new Student2(1, "Ivan"));
		list.add( new Student2(2, "Petro"));
		list.add( new Student2(1, "Anna"));
		list.add( new Student2(3, "Oleh"));
		list.add( new Student2(3, "Ira"));
		
		
		System.out.println("Original List: " + list);
		Collections.sort(list, new Student2.Student2ByCourse());
		System.out.println("Sorted List (by course) : " + list);
		Collections.sort(list, new Student2.Student2ByName());
		System.out.println("Sorted List (by name) : " + list);
	}

}
