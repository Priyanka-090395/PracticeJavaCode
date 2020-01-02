package home.work.project2;

public class JavaException {

		 public static void main(String args[]) {
		  int i = 0;
		  int j = 20;
		  try {
		   int fraction = i / j;
		   
		   System.out.println("This line will not be Executed");
		   
		  } catch (ArithmeticException e) {
			  
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  
		  System.out.println("Print");
		  
		 }
		}
