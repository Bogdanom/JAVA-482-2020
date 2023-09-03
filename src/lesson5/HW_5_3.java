package lesson5;
import java.util.Scanner;

public class HW_5_3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter array of 5 integer numbers: ");

		for (int i = 0; i < 5; i++) {
			arr[i] = s.nextInt();
		}

		int positiveTwoPosition = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] >= 0) {
				positiveTwoPosition++;
			}
			if (positiveTwoPosition == 2) {
				System.out.println("Position of second positive number = " + ++i);
				break;
			}
		}
		if (positiveTwoPosition == 0) {
			System.out.println("There is no positive numbers in array");
		}
		if (positiveTwoPosition == 1) {
			System.out.println("There is only one positive number in array");
		}

		int minArray = arr[0];
		int positionMin = 1;

		for (int i = 1; i < 5; i++) {
			if (arr[i] < minArray) {
				minArray = arr[i];
				positionMin = i + 1;
			}
		}
		System.out.println("Min element in the array is " + minArray + ", its position is " + positionMin);

	}

}
