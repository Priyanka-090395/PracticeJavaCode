package workplace.service.first.colour;

public class AssignmentLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Equalto == operator
		
		double a = 0.05d;
		double b = 0.07d;
		
		if(a == b) {
		
			System.out.println("Print the value a == b");
		}
		
		// Not to != operator
		
		if (a != b) {
		
			System.out.println("Print the value a!=b");
			
			// && AND Operator
			
			if ((a < b) && (a > b)) {
				
				System.out.println("Print the value as true");
			}
			
			// || OR Operator
			
			if ((a <= b) || (a >= b)) {
				
				System.out.println("Print the value as false");
			}
			
			boolean i = false;
			
				
				System.out.println(!i);
				
			}
			

}
}
