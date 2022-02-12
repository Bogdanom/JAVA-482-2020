package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_4_1_3 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the code of the error, please:");
		int error = Integer.parseInt(br.readLine());
		
		switch (error) {
		
		case 400:
			System.out.println("Name of the error is - Bad Request");
			break;
		case 401:
			System.out.println("Name of the error is - Unauthorized");
			break;
		case 402:
			System.out.println("Name of the error is - Payment Required");
			break;
		case 403:
			System.out.println("Name of the error is - Forbidden");
			break;
		case 404:
			System.out.println("Name of the error is - Not Found");
			break;
		case 405:
			System.out.println("Name of the error is - Method Not Allowed");
			break;
		case 406:
			System.out.println("Name of the error is - Not Acceptable");
			break;
		
		default:
			System.out.println("Enter number from 401 to 406, please");
		}
		
		}

}
