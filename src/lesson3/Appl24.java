package lesson3;

public class Appl24 {

	public static void main(String[] args) {
		Student student1 = new Student("Oleg");
		student1.setRating(8);
		Student student2 = new Student("Anna");
		student2.setRating(9);
		Student student3 = new Student();
		student3.setName("Mary");
		student3.setRating(10);
		System.out.println("Out students");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println();
		System.out.print("The best student ");
		if (student1.betterStudent(student2)) {
			if (student1.betterStudent(student3)) {
				System.out.println(student1);
			} else {
				System.out.println(student3);
			}
		} else {
			if (student2.betterStudent(student3)) {
				System.out.println(student2);
			} else {
				System.out.println(student3);
			}
		}

		System.out.println();
		System.out.printf("Average rating is " + "%.2f", Student.getAvgRating());
	}

}
