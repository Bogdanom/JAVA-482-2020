
package lesson9;

/*- write a method main(), that has to enter n numbers:
a1, a2, ..., a10, such that range_Start < a1 < ... < a10 < range_End
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AppArrayInput {

	public static void main(String[] args) {
		
		int rangeStart = 0;
		int rangeEnd = 0;
		int arrLen = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter range_Start");
			rangeStart = Integer.parseInt(br.readLine());
			System.out.println("Enter range_End");
			rangeEnd = Integer.parseInt(br.readLine());
			System.out.println("Enter array length");
			arrLen = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayIO arrayIO = new ArrayIO();
		List<Integer> inputList = arrayIO.arrayInput(rangeStart, rangeEnd, arrLen);
		arrayIO.arrayOutput(inputList, arrLen);
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
