package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ArrayIO {
	
	public List<Integer> arrayInput(int rangeStart, int rangeEnd, int arrLen) {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	Integer[] arr = new Integer[arrLen];

	System.out.println("Enter " + arrLen + " integer numbers belong to the range [" 
	                            + rangeStart + ":" + rangeEnd + "]");
	int i = 0;
	int k = 0;
	do {
		try {
			k = Integer.parseInt(br.readLine());
			if (k < rangeStart | k > rangeEnd) {
				System.out.println(k + " doesn't belong to the range [" + rangeStart 
						             + ":" + rangeEnd + "]");
				System.out.println("continue entering, please");
				continue;
			}
			else {
				arr[i] = k;
				i++;
			}
		} catch (NumberFormatException e) {
			System.err.println("non-format input");
			// System.out.println(e.toString());
			e.printStackTrace();
			// System.exit(1); // finally doesn't work
			// return 2; // finally work
		} catch (IOException e) {
			System.err.println("sth goes wrong");
			e.printStackTrace();
		} finally {
			// System.out.println("finally done");
		}

	} while (i < arrLen);
	
	try {
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	List<Integer> list = Arrays.asList(arr); 
	return list;
}
	public void arrayOutput(List<Integer> list, int arrLen) {
	System.out.println("\nThe array of " + arrLen + " integer numbers is:");
			System.out.print(list);
	}
}

