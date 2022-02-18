package lesson8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl_Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence, please");
		String sentence = scanner.nextLine();
		scanner.close();
		String pattern = "[a-z, ]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		if (!m.matches()) {
			System.out.println("not only letters");
		} else {
			System.out.println("only letters");
		}
//		int n = sentence.indexOf(' '); 
//		int k = 0;
//		sentence = sentence.substring(n+1);    
//		System.out.println(sentence);

	}

}