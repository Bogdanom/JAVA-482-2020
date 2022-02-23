package lesson10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFilePT3Appl {

	public static void main(String[] args) {
		int count = 0;
		String fileName = "mytext-022322.txt";
		System.out.println("Read data from file: " + fileName);
		List<String> list = new ArrayList<>();
		String s = "";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((s = br.readLine()) != null) {
				list.add(s);
				count++;

			}
		} catch (Exception e) {
			System.out.println("ERROR!");
		}
		System.out.println("row = " + count);
		//
		String max = list.get(0);
		String min = list.get(0);
		for (String current : list) {
			if (max.length() < current.length()) {
				max = current;
			}
		}
		for (String current : list) {
			if (min.length() > current.length()) {
				min = current;
			}
		}
		System.out.println("max = " + max + " len = " + max.length());
		System.out.println("min = " + min + " len = " + min.length());
		//
		System.out.println("Lines contains: yellow");
		for (String current : list) {
			if (current.contains("yellow")) {
				System.out.println(current);
			}
		}
		
	}

}
