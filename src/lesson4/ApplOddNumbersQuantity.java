package lesson4;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class ApplOddNumbersQuantity {
		static int k=0;
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	         
			System.out.println("Enter three figures, please:");
			int c1 = Integer.parseInt(br.readLine());
			int c2 = Integer.parseInt(br.readLine());
			int c3 = Integer.parseInt(br.readLine());
			
			check(c1);
			check(c2);
			check(c3);
			
			System.out.println("Quantity of odd numbers: " + k); 
			
		}
		
	static void check(int x) {
		if(x%2!=0) { k++;};

	}
	}