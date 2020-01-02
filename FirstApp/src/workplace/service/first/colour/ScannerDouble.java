package workplace.service.first.colour;

import java.util.Scanner;

	public class ScannerDouble {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double j, m;
			
			System.out.println("Enter the inputs :");
			
			Scanner sc = new Scanner(System.in);
			
			m= sc.nextDouble();
			
			System.out.println("Addition of two numbers :" +m );
			
			for (double i = 0.05d; i<=10; i++) {
				
				
				System.out.println("The value is : " +(m+i));
				
			}	
}
	}
