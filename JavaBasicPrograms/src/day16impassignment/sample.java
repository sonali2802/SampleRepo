package day16impassignment;


class sample {

	     public void reversenumber() {
		  System.out.println("reverse number is");
		 }
		
		public void palindrome() {
		System.out.println("palindrome number is");
		
		}
		
		public void leapyear() {
		System.out.println("leap year is");
		}
	 }
	   class child extends sample {
			//overriding

		   
		   public void reversenumber() {
		   
			   super.reversenumber();
	       System.out.println("It is a child class reversenumber()");
		
		   }
		 public void palindrome ()	{
		      super.palindrome();
		       System.out.println("It is a child class palindrome()");

		 }
		  public void leapyear()  {
		   super.leapyear();
	       System.out.println("It is a child class leapyear()");
		  }
		  
	   
		public class day16impassignment{ 
		//overriding
			public static void main(String[] args) {

		child e1=new child();
	        e1.reversenumber();
	        e1.palindrome();
		    e1.leapyear();
		 System.out.println(" ***** ");
		    sample e2=new sample();
		
		    e2.reversenumber();
		    e2.palindrome();
		    e2.leapyear();
		 System.out.println(" ***** ");
			
			
			}
		}	
	   }   			
	   		
			

	
	
	
	
	
	
	
	
	

	
	
 
 
 
 

	