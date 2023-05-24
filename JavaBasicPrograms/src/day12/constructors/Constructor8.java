package day12.constructors;

class C {
	double i ;
      C(double j)   {
         System.out.println("Running class C constructor");
                 i=j;
     }
}

public class Constructor8 {
     public static void main(String[] args) {
      System.out.println("Main() of class cons5 is started");
	          C b1=new C(25.34);
	          System.out.println("class C global variable i= "+b1.i);
	          b1.i=14.65;
     System.out.println("class C global variable i= "+b1.i);
         C b2=new C(55.32);
    
     System.out.println("class C global variable i ="+b2.i);
     System.out.println("Main() of class cons5 is end here");
     }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


