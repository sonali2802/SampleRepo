package Day9Assignment;

public class MethodWithReturnType1 {

	 private static final MethodWithReturnType1 MethodWithReturnType1_Calling = null;
	static double getROI() {
	      int p=55000,t=2;
	    float r=5.5f;
	double roi=(p*r*t)/100;
	System.out.println("Principle amount is:"+p);
	System.out.println("Duration is:"+t);
	System.out.println("Interest paid by you:"+roi);
	  return roi;
	 }
	 static double getROI(int p,int t,float r) {
			double roi=(p*r*t)/100;
			System.out.println("Principle amount is:"+p);
			System.out.println("Duration is:"+t);
			System.out.println("Interest paid by you:"+roi);
	 	  return roi;
	 }
	public static void main(String[] args) {
		System.out.println("Program start");
	   getROI();
	System.out.println("getROI with value in console");
	System.out.println("Interest to be paid is:"+getROI());
	System.out.println("getROI,return value store in variable");
	 double x=getROI();
	double finalAmountToBePaid=55000+x;
	System.out.println("Total amount to be paid including interest:"+finalAmountToBePaid);
	System.out.println("using parameters");
	int amount=95000;
	int duration=2;
	float roi=4.5f;
	double interest=getROI(amount,duration,roi);
	double finalamount=amount+interest;
	System.out.println("Total amount paid by you:"+finalamount);
	System.out.println("using parameters2");
	interest= MethodWithReturnType1_Calling.getROI(85000,2,4.5f);
      finalamount=85000+interest; 
	System.out.println("Total amount paid by you:"+finalamount);
	System.out.println("program ends");
	
	}

}
