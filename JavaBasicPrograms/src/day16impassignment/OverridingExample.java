package day16impassignment;

 class Mango {
  
	int a=10;
	public void reversenumber()
	{
	System.out.println("class A reversenumber");	
	}
	public void palindrome() {
    System.out.println("class A palindrome");
	}
	public void leapyear() {
	    System.out.println("class A leapyear");
		}	
	}
         

 class Orange extends Mango {

	int a=20;

	public void reversenumber()
	{
		super.reversenumber();
	System.out.println("class B reversenumber");	
	}
	public void palindrome() {
		super.palindrome();
    System.out.println("class B palindrome");
	}
	public void leapyear() {
	  super.leapyear();
		System.out.println("class B leapyear");
		}	
	}
         
	
	public class OverridingExample {	
	
	public static void main(String[] args) {
		Orange e1=new Orange();
	      e1.reversenumber();
	      e1.palindrome();
	      e1.leapyear();
	    
	
	}

}
