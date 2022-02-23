package my_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Appl_De_Serial {
	public static void main(String[] args) {
		
		File fr= new File("fruit022322.cer");
		// deserializaion list of fruit from file fruit.cer
		System.out.println();
		System.out.println("deserializaion list of fruit from file fruit.cer");
		
		List<Fruit> fruit = new ArrayList<Fruit>();
		
		try {
			
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
		
		 Fruit currentFruit = (Fruit) istream.readObject();
		 fruit.add(currentFruit);
		 System.out.println(currentFruit);
		
		 Fruit currentFruit2 = (Fruit) istream.readObject();
		 fruit.add(currentFruit2);
		 System.out.println(currentFruit2);
		 
		 Fruit currentFruit1 = (Fruit) istream.readObject();
		 fruit.add(currentFruit1);
		 System.out.println(currentFruit1);
		 
		 Fruit currentFruit3 = (Fruit) istream.readObject();
		 fruit.add(currentFruit3);
		 System.out.println(currentFruit3);
		 
		 Fruit currentFruit4 = (Fruit) istream.readObject();
		 fruit.add(currentFruit4);
		 System.out.println(currentFruit4);
		
		istream.close();
		
		} catch (ClassNotFoundException | IOException e) {
		System.err.println(e.getMessage());
		} 
		
		System.out.println();
		System.out.println("List of fruit from class Fruit: ");
		for (Fruit currentFruit : fruit) {
			System.out.println(currentFruit);
		}
		}
		}  
		
