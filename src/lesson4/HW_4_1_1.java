package lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_4_1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    System.out.println("Enter three float numbers, please");
	float c1 = Float.parseFloat(br.readLine());
	float c2 = Float.parseFloat(br.readLine());
	float c3 = Float.parseFloat(br.readLine());
	
	if(c1 >= -5 & c1 <= 5) { System.out.println( c1 + " belongs to the range [-5,5]");}
	if(c2 >= -5 & c2 <= 5) { System.out.println( c2 + " belongs to the range [-5,5]");}
	if(c3 >= -5 & c3 <= 5) { System.out.println( c3 + " belongs to the range [-5,5]");}
	}
	
		
	
}
