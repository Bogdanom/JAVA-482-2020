package lesson8;
public class Appl_Str_reverse {

	public static void main(String[] args) {
		String str = "maskara"; // input text
		System.out.println("str = " + str);
		int strLength = str.length();
		//
		System.out.print("reverse = ");
		for (int i = 1; i <= strLength; i++) 
			System.out.print(str.substring(strLength - i, strLength - i + 1));
			System.out.println();
		//
		String str2 = "";
		System.out.print("reverse = ");
		for (int i = 1; i <= strLength; i++) {
			str2 = str.substring(strLength - i, strLength - i + 1);
			System.out.print(str2);
		}
		System.out.println();
		//
		str2 = "";
		for (int i = 1; i <= strLength; i++) {
			str2 = str2 + str.substring(strLength - i, strLength - i + 1);
		}
		System.out.println("reverse = " + str2);
		//
		str2 = "";
		int sLength = strLength; 
		do {
			str2 = str2 + str.substring(sLength - 1, sLength);
			sLength--;
		} while (sLength > 0);
		System.out.println("reverse = " + str2);
		//
		StringBuffer sb = new StringBuffer(str);
		//sb.reverse();
		//str2 = sb.toString();
		//System.out.println("reverse = " + str2);
		System.out.println("reverse = " + sb.reverse());
	}

}
