package lesson5;

import java.util.Arrays;
import java.util.Scanner;

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car name = " + name ;
	}
}

public class Appl_teacher {

	public static void main(String[] args) {

//				int[] arr = new int[4];
//				arr[0] = +5;
//				arr[1] = +0;
//				arr[2] = 12;
//				arr[3] = -4;
//		int[] arr = { 51, -10, 12, -4, -21 };
//		
//		for (int i = 0; i < arr.length; i++) {System.out.println("i= " + i + "  arr = " + arr[i]);}

//		int i = 0;
//		for (int a : arr) {
//			System.out.println("i= " + i + "  arr = " + a);
//			i++;
//		}

//				Car[] myCars = new Car[4];
//				myCars[0] = new Car("BMW");
//				myCars[1] = new Car("Mercedes");
//				myCars[2] = new Car("Audi");
//				myCars[3] = new Car("Tesla");
		//Car[] myCars = { new Car("Bimmer"), new Car("Mers"), new Car("Audi"), new Car("Tesla"), new Car("Bugatti") };
		//for (Car a : myCars) {
			//System.out.println(a.toString());
			// System.out.println(a); // a1.toString() by default
//		}
		
		// System.out.println("myCars = " + myCars); // print address, not object
//		 System.out.println("myCars = " + Arrays.toString(myCars));

//			    double[][] twoDimensional = { { 0, 2, 2, 3 },
//						         			  { 4, 5, 6, 7 },
//						         			  { 8, 9, 10, 11 },
//						         			  { 12, 13, 14, 15 },
//						         			  { 16, 17, 18, 19 }};
//				double[][] twoDimensional = { { 0, 1 },
//		   			  						  { 4, 5, 6, 7 },
//		   			  						  { 8 },
//		   			  						  { 12, 13, 14},
//		   			  						  { 16, 17 }};
//		double[][] twoDimensional = new double[5][];
//		twoDimensional[0]= new double[2];
//		twoDimensional[1]= new double[4];
//		twoDimensional[2]= new double[1];
//		twoDimensional[3]= new double[2];
//		twoDimensional[4]= new double[1];
//		twoDimensional[0][0] = 0;
//		twoDimensional[0][1] = 1;
//		twoDimensional[1][0] = 4;
//		twoDimensional[1][1] = 5;
//		twoDimensional[1][2] = -6;
//		twoDimensional[1][3] = 7;
//		twoDimensional[2][0] = 8;
//		twoDimensional[3][0] = 12;
//		twoDimensional[3][1] = 13;
//		twoDimensional[4][0] = 16;
		//System.out.println("twoDimensional.length = " + twoDimensional.length);
//				for (int i = 0; i < twoDimensional.length; i++) {
//					for (int j = 0; j < twoDimensional[i].length; j++) {
//						System.out.print(twoDimensional[i][j] + "  ");
//					}
//					System.out.println();
//				}
			    
//				for (double[] row : twoDimensional) {
//					for (double node : row) {
//						System.out.print(node + "  ");
//					}
//					System.out.println();
//				}
//		for (double[] row : twoDimensional) {
//			for (double node : row) {
//				//System.out.print(node + "  ");
//				if (node < 0) {
//					//break;
//					continue;
//				}
//				System.out.print(node + "  ");
//			}
//			System.out.println();
//		}
		
//		int number = 0; // = 10;
//		while (number <= 5) {
//		    System.out.println(number);
//		    number++;
//		}
		//		do {
		//		    System.out.println(number);
		//		    number++;
		//		} while (number <= 5);
//		System.out.println("done");
//		
//		int[] arr = new int[5];
//		int i = 0;
//		Scanner scanner = new Scanner(System.in);
//		do {
//			System.out.print("input positive number arr[" + i + "]= ");
//			arr[i] = scanner.nextInt();
//		} while ((arr[i] <= 0) || (++i < arr.length));
//		System.out.println("arr = " + Arrays.toString(arr));
//		scanner.close();
//		
//		int[] numbers = {5, 6, 8, 3, 5, 7, 9};
		//		for(int i = 0; i < numbers.length; i++){
		//		    System.out.print(numbers[i] + "  ");
		//		}
//		for(int i = numbers.length - 1; i >= 0; i--){
//		    System.out.print(numbers[i] + "  ");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		for (int i = 0; i < 50; i++) {
//			System.out.println("Input number");
//			//n = Integer.parseInt(sc.nextLine());
//			n = sc.nextInt();
//			if (n < 0){
//				break;
//			}
//		}
//		System.out.println(n);
//		sc.close();
		
		/*-
		int[] arr = { 2, -5, 7, -4, 8 };
		//
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum = sum + arr[i]
		}
		System.out.println("Sum = " + sum);
		//
		int product = 1;
		for (int i = 0; i < 5; i++) {
			if (arr[i] > 0) {
				product = product * arr[i];
			}
		}
		System.out.println("Product = " + product);
		//
		int amount = 0;
		for (int a : arr) {
			if (a > 0 && a <= 7) {
				amount++;
			}
		}
		System.out.println("Amount = " + amount);
		*/
		//
		/*-
		int[] arr = { 2, -5, 71, -4, 8 };
		//
		int max = arr[0];
		int imax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				imax = i;
			}
		}
		System.out.print("Maximum = " + max);
		System.out.println(" is in " + (imax + 1) + " place");
		*/
		//
		int[] arr = {2, 11, -5, -1, 7, -4, 8};
//		//
		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
//		//
//		int tmp;
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j+1]) {
//					tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}
//		}
		//
		 Arrays.sort(arr);
		// Arrays.sort(arr, 1, 6);
		//
		System.out.println("\nSorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
//
	}

	}

