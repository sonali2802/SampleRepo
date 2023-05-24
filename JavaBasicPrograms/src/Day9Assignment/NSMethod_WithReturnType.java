package Day9Assignment;

public class NSMethod_WithReturnType {
   double x=10,y=20,z=30;
	//methodtype:nonstatic
   boolean checkSameOrNot(int a,int b) {
	boolean res=(a==b);
	return res;
	}
	//methodtype:static
	static void display() {
  NSMethod_WithReturnType m2=new NSMethod_WithReturnType(); 
		System.out.println("Input the frist number:"+m2.x);
        System.out.println("Input the second number:"+m2.y);
        System.out.println("Input the third number:"+m2.z);
	}
	public static void main(String[] args) {
     System.out.println("I am method 5 class....");
	 NSMethod_WithReturnType m1=new NSMethod_WithReturnType(); 
	 System.out.println("Input the frist number:"+m1.x);
     System.out.println("Input the second number:"+m1.y);
     System.out.println("Input the third number:"+m1.z);
	   m1.average(m1.x,m1.y,m1.z);
	//or  m1.average(10,20,30);
	   boolean res=m1. checkSameOrNot(10,10) ;
       System.out.println("Is both no is same:"+res);
       System.out.println(m1. checkSameOrNot(10,20));
	}
	public void average(double p,double q,double r)
       {
	double res=(p+q+r)/3;
	System.out.println("The averege value is:"+res);
	
	
	}

}
