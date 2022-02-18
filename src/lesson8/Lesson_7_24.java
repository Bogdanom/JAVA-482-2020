package lesson8;
import java.util.regex.*;

public class Lesson_7_24 {

	public static void main(String[] args) {
		
		/*-
		//String pattern = "abc";
		//String text = "abc";
			String pattern = "[a-zN ]+";
			String text = "Now is the time";
			
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		
		if (m.matches()) { System.out.print("Matches the entire text string"); }
		m.reset();
		System.out.println();
		while (m.find()) {
		  System.out.print(text.substring(m.start(), m.end()) + "*");
		}
		*/
		
		/*-
		// TASK - to find double b ("bb") inside the words 
		
		String pattern = " \\w*\\Bbb\\B\\w* ";//(not in the end or at the start of words)
		//String pattern = "[^ ]*\\bbb\\b[^ ]*"; ////(in the end or at the start of words)
		String text = " abba  bbs bb, !!bb sbb   asdbbbdsa bvvbvvv  ";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		if (m.matches()) {
			System.out.print("Matches the entire text string");
		}
		m.reset();
		// System.out.println();
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "*");
		}
		System.out.println("\noriginal text: " + text);
		String text2 = text.replaceAll(pattern, "_");
		System.out.println("modified text: " + text2);
		*/
		// TASK - 1. print all only tags 2. text between tags 3. all tags+text 
		//String pattern = "<[^>]+>"; // task 1
		//String pattern = ">[^<]+<"; // task 2
		//String pattern = "<([^>]+)>[^<]+</\\1>"; // task 3
		//String pattern = "<[^>]*>";
		//String pattern = "<.*>";
		//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}"; // validation of email address
	//	String pattern = "(\\d{1,3}[,'])*\\d{1,3}\\.\\d{2}"; // extract price
		//String text = "<p><b>Beginning with<> bold text</b> next, text body, <i>italic text</i> end of text.</p>";
		//String text = "<p><b>Beginning with bold text</b> next, text body, <i>italic text</i> end of text.</p>";
		//String text = "my.mail.ol@ua.ua"; // validation of email address
//		String text = " 6 item(s) - $1'695,897.60 text";// extract price
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(text);
//		if (m.matches()) {
//			System.out.print("Matches the entire text string");
//		}
//		m.reset();
//		System.out.println();
//		while (m.find()) {
//			System.out.print(text.substring(m.start(), m.end()) + "*");
//			String first = text.substring(m.start(), m.end());
//			double d = Double.parseDouble(first.replaceAll(",|'", ""));
//			System.out.println("\nd = "+d);
//		}
	}

}
