package first.encap.one;

public class EncapOne {
	
	//class consists of fields,constructors and methods

	private int lengthOf;
	public double breadthOf;
	protected String areaOf;
	boolean switchOn;
	
	private void courseDownload() {
		
		System.out.println("Private methiod");
	}
	
	public void noteBook() {
		
		System.out.println("public method");
	}
	
	protected void mobilePhone() {
		
		System.out.println("protected method");
	}
	
	void markerPen () {
		
		System.out.println("default method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EncapOne eo1 = new EncapOne();
		eo1.areaOf = "Priyanka";
		eo1.breadthOf = 00.12;
		eo1.switchOn = true;
		eo1.lengthOf = 10;
		eo1.markerPen();
		eo1.mobilePhone();
		eo1.noteBook();
		eo1.courseDownload();
		EncapSecond eo2 = new EncapSecond();
		
		
		
	}

}
