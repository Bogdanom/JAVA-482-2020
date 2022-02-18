package lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_7_2 {

	public static void main(String[] args) {
		// two variants Enter a sentence that contains the words between more than one space.
		/*- 
		// my solution		
		String pattern = "[A-Za-z]+";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence, please");
		String sentence = scanner.nextLine();
		scanner.close();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			System.out.print(sentence.substring(m.start(), m.end()) + " ");
		}
		 */
		/*- 
		// Yaroslav solution
		  */
		String str = "  I  am  studying    Java   language   ";
		String update = str;
		do {
			update = update.replace("  ", " ");
		} while (update.indexOf("  ") > -1);
		update = update.trim();
		update = update.replace("I am", "I'm");
		System.out.println("origin sentence = " + str);
		System.out.println("updated sentence = " + update);
		

	}

}
