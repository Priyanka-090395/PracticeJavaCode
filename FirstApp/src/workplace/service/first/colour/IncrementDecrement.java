package workplace.service.first.colour;

import java.util.Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		
		//System.out.println("This is a table :");
		
		Scanner sc = new Scanner(System.in);
		
		k= sc.nextInt();
		
		System.out.println("Multiplication of two table :" +k );
		
		for (int i = 1; i<=10; i++) {
			
			
			System.out.println("The value is : " +(k*i));
			
		}
	
	}

}

// less than or = true