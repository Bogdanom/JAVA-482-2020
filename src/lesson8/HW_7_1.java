package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_7_1 {

	public static void main(String[] args) {
		// two variants
		/*- 
		// my solution
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence, please");
		String sentence = scanner.nextLine();
		scanner.close();
		
		String[] arr = sentence.split(" ");
		
		StringBuilder sb = new StringBuilder(arr[1]);
		sb.reverse();
		String str = sb.toString();
		System.out.println("The second word in the sentence in reverse order looks like - " + str);
		
		int longest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > arr[longest].length()) {
				longest = i;
			}
		}
		System.out.print("The longest word in the sentence is " + arr[longest]);
		System.out.println(". Its length is " + arr[longest].length() + " symbols");
		*/

		/*- */
		// Yaroslav solution
		String text = "text Text money  price text not$";
		String pattern = "[^ ]+";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		List<String> result = new ArrayList<>();

		while (m.find()) {
			result.add(text.substring(m.start(), m.end()));
		}
		int maxlen = 0;
		int index = -1;
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).length() > maxlen) {
				maxlen = result.get(i).length();
				index = i;
			}
		}
		System.out.println("Origin list : " + result);
		System.out.println("max length word : " + maxlen);
		System.out.println("longest word : " + result.get(index));
		System.out.println("position of longest : " + index);
		//
		for (String str : result) {
			String reseved=new StringBuilder(str).reverse().toString();
			System.out.println("Current word: "+str);
			System.out.println("Reversed word: "+reseved);
			
		}
	}

}
