package lesson1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HW1_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int p,p1,p2,p3;
      
		System.out.println("Enter prices per minute each of the three countries, please");
		int c1 = Integer.parseInt(br.readLine());
		int c2 = Integer.parseInt(br.readLine());
		int c3 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter timing each of the three calls, please");
		int t1 = Integer.parseInt(br.readLine());
		int t2 = Integer.parseInt(br.readLine());
		int t3 = Integer.parseInt(br.readLine());
		
		p1 = c1 * t1;
		p2 = c2 * t2;
		p3 = c3 * t3;
		p = p1 + p2+ p3;
		
		System.out.println("Price of the first call is: " + p1);  
		System.out.println("Price of the second call is: " + p2); 
		System.out.println("Price of the third call is: " + p3); 
		System.out.println("Price of the all three calls is: " + p); 
		
		br.close();
		
	}
}