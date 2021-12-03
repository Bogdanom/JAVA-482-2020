package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double pi = 3.14159;
    double p;
    double s;
    
		System.out.println("Enter bed radius, please");
		int r = Integer.parseInt(br.readLine());
		
		p = 2 * pi * r;
		s = pi * r * r;
		
		System.out.println("Bed perimeter: " + p);  
		System.out.println("Bed area: " + s);

		br.close();
	}
}