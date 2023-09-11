package my_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
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
		
		List<Fruit> fruit = new ArrayList<>();
		Fruit s = null;
		try (ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr))) {
			while ((s = (Fruit) istream.readObject()) != null) {
				fruit.add(s);
				System.out.println(s);
			}
			istream.close();
			
		} catch (ClassNotFoundException | IOException e) {
		System.err.println(e.getMessage());
		//e.printStackTrace(); // there is stack trace
		} 
		
		System.out.println();
		System.out.println("List of fruit from class Fruit: ");
		for (Fruit currentFruit : fruit) {
			System.out.println(currentFruit);
		}
		}
		}  
		
