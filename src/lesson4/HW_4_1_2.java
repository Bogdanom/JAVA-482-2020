package lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_4_1_2 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int max, min;
	      
			System.out.println("Enter three numbers, please");
			int c1 = Integer.parseInt(br.readLine());
			int c2 = Integer.parseInt(br.readLine());
			int c3 = Integer.parseInt(br.readLine());
			
			if(c1 > c2) { max = c1; min = c2; } else { max = c2; min = c1;}
			if(c3 > max) { max = c3;} 
			if(c3 < min) { min = c3; }
			
			System.out.println("Maximum of them is: " + max);  
			System.out.println("Minimum of them is: " + min);  

	}

}
