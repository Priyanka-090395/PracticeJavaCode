package workplace.service.second;

public class FirstBasicArray {

	public static void main(String args[])
	{
	
		try {
		
	int[] a = new int[5];
	
	a[0] = 200;
	a[1] = 300;
	a[2] = 400;
	a[3] = 500;
	a[4] = 600;
	//a[5] = 700;
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	//System.out.println(a[5]);

		}
		
		catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Exception" +ai);
		} 
		
		finally {
			System.out.println("Print Statement");
				}
	double [] b = new double[] {1.1,2.1,3.1};
	
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	
	try {
	int i=5/0;
	System.out.println("Print the value i :" +i);
	}
	finally {
		System.out.println("Finally");
	}
	
	}
}
