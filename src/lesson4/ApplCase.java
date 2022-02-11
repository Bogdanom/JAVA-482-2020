package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplCase {
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Do you enjoy Java? (yes/no/maybe)");
	String input = br.readLine();

	switch (input.toLowerCase()) {
	case "yes":
	case "maybe":
		System.out.println("Great!");
		break;
	case "no":
		System.out.println("Too bad!");
		break;
	default:
		System.out.println("Wrong!");
	}
	}

}
