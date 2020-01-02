package priyanka.java.project1;

public class StatementElseIf {

	int add1, add2, number;

	
	public void addNumber() {
		
		if (add1==number) {
			
			System.out.println("Print as true");
		}
		else if(add2 >= add1) {
			
			System.out.println("Print as false");
		}
		
		else {
			
			System.out.println("Else is true");
		}
	}
	
	public int sumName(int add1, int add2) {
		
		number = add1 + add2;
		
		System.out.println("Sum of two numbers is :" +number);
		
		return number;
	}
}
