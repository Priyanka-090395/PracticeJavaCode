package home.work.project2;
public class ExceptionHandlingWithThrow {

    public static void main(String[] args) {
    	try {
    		System.out.println("Print");
    		
    	    a();
    	}
    	catch (ArithmeticException e) {
    		System.out.println("Dont");
    
    	}
    }

    public static void a() throws ArithmeticException {
            b();
        System.out.println("Method 1");

    }

    public static void b() throws ArithmeticException {
        System.out.println("Method 2");
        
           int a=50/0;
           System.out.println("Execute ainda???");
       
 
    }
}
