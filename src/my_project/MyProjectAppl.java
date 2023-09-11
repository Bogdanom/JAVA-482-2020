// TODO REFACTOR - a lot of redundant info 09 Sep 23

package my_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class Fruit implements Serializable {
	private static final long serialVersionUID = 1L;

	protected String fruitName;
	protected String fruitColour;

	public Fruit(String fruitName, String fruitColour) {
		this.fruitName = fruitName;
		this.fruitColour = fruitColour;
	}
	
	public Fruit() {
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitColour() {
		return fruitColour;
	}
	public void setFruitColour(String fruitColour) {
		this.fruitColour = fruitColour;
	}
	@Override
	public String toString() {
		return "Name: " + fruitName + "; Colour: " + fruitColour;
	}
	
	 void input(BufferedReader br) throws IOException {
		
		fruitName = br.readLine();
		setFruitName(fruitName);
		fruitColour = br.readLine(); 
		setFruitColour(fruitColour);
	}
	void output() {
		System.out.println("Fruit name: "+getFruitName()+". Fruit colour: " + getFruitColour());
	}
	public static class FruitByName implements Comparator<Fruit> {
		 public int compare(Fruit f1, Fruit f2) {
			 return f1.getFruitName().compareTo(f2.getFruitName());
		 }
	 }
	
	int plus(int a, int b) {
		return a+b;
	}
}

  class Citrus extends Fruit {
		private String fruitVitamineC;
		
		public Citrus(String fruitName, String fruitColour, String fruitVitamineC) {
			super(fruitName, fruitColour);
			this.fruitVitamineC = fruitVitamineC;
		}

		public Citrus() {
		}

		public String getFruitVitamineC() {
			return fruitVitamineC;
		}
		public void setFruitVitamineC(String fruitVitamineC) {
			this.fruitVitamineC = fruitVitamineC;
		}
		@Override
			void input(BufferedReader br) throws IOException {

			fruitName = br.readLine();
			setFruitName(fruitName);
			fruitColour = br.readLine();
			setFruitColour(fruitColour);
			fruitVitamineC = br.readLine();
			setFruitVitamineC(fruitVitamineC);
		}
		@Override
		void output() {
			System.out.println("Fruit name: " + getFruitName() + ". Fruit colour: " + getFruitColour() + ". Vitamin C: "
					+ getFruitVitamineC() + " gram");
		}

	}
  public class MyProjectAppl {

		public static void main(String[] args) throws IOException {
			
	// read list of fruit(streams of characters) from file mytext.txt to ListArray of lines
						
			String fileName = "fruit.txt";
			System.out.println("Read names and colour of fruit from file: " + fileName);
			List<String> list = new ArrayList<>();
			String s = "";
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
				while ((s = br.readLine()) != null) {
					// My Exception - non-correct input
					String pattern = "[a-z, ]+";
					Pattern p = Pattern.compile(pattern);
					Matcher m = p.matcher(s);
					if (!m.matches()) throw new IOException();
					//
					list.add(s);
				}
			} 
				catch (IOException e) {
					System.out.println("Not correct input. Use names of fruit and true colors");
					e.printStackTrace();
				}
				catch (Exception e) {
				System.out.println("ERROR!");
				e.printStackTrace();
			} finally { System.out.println("check input information");
			}
			// print list of fruit from Array of lines
			
			System.out.println();
			System.out.println("List of fruit from file mytext.txt: ");
			for (String currentList : list) {
				System.out.println(currentList);
			}

			// separate lines of string to fields (name, color) and put them to class Fruit
			
			List<Fruit> fruit = new ArrayList<Fruit>();

			for (String currentList : list) {
				int n = currentList.indexOf(" ");
				String str1 = currentList.substring(0, n);
				String str2 = currentList.substring(n + 1, currentList.length());
				fruit.add(new Fruit(str1, str2));
			}

			System.out.println();
			System.out.println("List of fruit from class Fruit: ");
			for (Fruit currentFruit : fruit) {
				System.out.println(currentFruit);
			}
			//

			System.out.println();
			Collections.sort(fruit, new Fruit.FruitByName());
			System.out.println("Sorted Fruit (by name): ");
			System.out.println(fruit);

			System.out.println();
			System.out.println("We have some yellow fruit here ");
			for (Fruit currentFruit : fruit) {
				if (currentFruit.getFruitColour().contentEquals("yellow")) {
					System.out.println(currentFruit);
				}
			}

//		   System.out.println("\nEnter names and colors of THREE pieces of fruit, please");
//		   System.out.println("We have some fruit here ");

			/*-
			System.out.println("\nEnter names and colors of THREE pieces of fruit, please");
			Fruit fruit1 = new Fruit();
			Fruit fruit2 = new Fruit();
			Fruit fruit3 = new Fruit();
			
			fruit1.input(br); 
			fruit2.input(br);
			fruit3.input(br);
			
			System.out.println("We have some fruit here ");
			fruit1.output(); 
			fruit2.output(); 
			fruit3.output(); 
			*/

//		    Fruit[] fruit = new Fruit[3];
//		   
//	      System.out.println("Enter names and colors of THREE pieces of fruit, please");
//	   	for( int i=0; i<3; i++ ) {
//	   		fruit[i].input(br);
//	   	}

//		   System.out.println("We have some fruit here ");
//	   	for( Fruit currentFruit: fruit ) {
//	   		currentFruit.output();
//	   	}
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			/*
		// v.2.Citrus extends Fruit
				public static void main(String[] args) throws IOException {
							
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

					System.out.println("Enter names and colours of THREE pieces of fruit, please");
							
					Citrus citrus1 = new Citrus();
					Citrus citrus2 = new Citrus();
					Citrus citrus3 = new Citrus();
					
					citrus1.input(br); 
					citrus2.input(br);
					citrus3.input(br);
					
					System.out.println("We have some fruit here ");
					citrus1.output(); 
					citrus2.output(); 
					citrus3.output(); 
			*/		
					// System.out.println("\nEnter names and colors of THREE pieces of fruit,
					// please");

//					List<Fruit> fruit = new ArrayList<Fruit>();
//					fruit.add(new Fruit("apple", "red"));
//					fruit.add(new Fruit("grape", "green"));
//					fruit.add(new Fruit("banana", "yellow"));
//					fruit.add(new Fruit("cherry", "red"));
//					fruit.add(new Fruit("lemon", "yellow"));
		}

	}