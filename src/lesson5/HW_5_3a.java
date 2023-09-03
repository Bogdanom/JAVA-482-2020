/*
 * Organize entering integers until the first negative number. 
 * Count the product of all entered even numbers.
 */

package lesson5;
import java.util.Scanner;

public class HW_5_3a {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[20];
		System.out.println("Enter array of integer numbers: ");
		
		int productEven = 1;
		int i = 0;
		do {
			arr[i] = s.nextInt();
			if(arr[i]%2==0) { productEven*=arr[i];}
		} while (arr[i]>=0);
		
		System.out.println("product of all entered even numbers is " + productEven);

	}

}
