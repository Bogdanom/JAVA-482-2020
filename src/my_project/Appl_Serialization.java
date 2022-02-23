package my_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Appl_Serialization {
		
	public static void main(String[] args) {
		String fileName = "fruit.txt";
		// System.out.println("Read names and color of fruit from file: " + fileName);
		List<String> list = new ArrayList<>();
		String s = "";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((s = br.readLine()) != null) {
				list.add(s);
			}
		} catch (Exception e) {
			System.out.println("ERROR!");
		}

		// print list of fruit from Array of lines
//		System.out.println();
//		System.out.println("List of fruit from file mytext.txt: ");
//		for (String currentList : list) {
//			System.out.println(currentList);
//		}

		// separate lines of string to two fields (name, color) and put them to class
		// Fruit
		List<Fruit> fruit = new ArrayList<Fruit>();

		for (String currentList : list) {
			int n = currentList.indexOf(" ");
			String str1 = currentList.substring(0, n);
			String str2 = currentList.substring(n + 1, currentList.length());
			fruit.add(new Fruit(str1, str2));
		}

		// System.out.println();
		System.out.println("List of fruit from class Fruit: ");
		for (Fruit currentFruit : fruit) {
			System.out.println(currentFruit);
		}

		// serializaion list of fruit to file fruit.cer
		System.out.println();
		System.out.println("serializaion list of fruit to file fruit.cer");

		File fw = new File("fruit022322.cer");
		
		try {

			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
			for (Fruit currentFruit : fruit) {
				ostream.writeObject(currentFruit);
				System.out.println(currentFruit);
			}
			ostream.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
