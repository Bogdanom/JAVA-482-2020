package lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	//protected static String bachelor;
	private int id;
	private String name;
	private transient String password;

	public Student(int id, String name, String password) {
		//Student.bachelor = bachelor;
		this.id = id;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + ", password: " + password + "]";
	}
}
public class Appl_Serialization {
	public static void main(String[] args) {
		// binnary serialization 
		/**/
		Student student = new Student(5, "Seniv", "qwet33");
		System.out.println(student);
		// save object in file
		File fw = new File("demo-022322.cer");
		try {
		ObjectOutputStream ostream = 
			new ObjectOutputStream(new FileOutputStream(fw));
		ostream.writeObject(student);
		ostream.close();
		} catch (IOException e) { System.err.println(e); }
		
		// binnary de-serialization 
		//	Student.bachelor = "Mathematic";
		
			File fr = new File("demo-022322.cer");
			try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
			Student unknown = (Student) istream.readObject();
			istream.close();
			System.out.println(unknown);
			} catch (ClassNotFoundException | IOException e) {
			System.err.println(e.getMessage());
			} 
			/**/
}
}