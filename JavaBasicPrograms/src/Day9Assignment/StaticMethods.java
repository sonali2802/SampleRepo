package Day9Assignment;

public  class StaticMethods {

	public static void display() {
		
      System.out.println("Hi,I am Sonali");
	  System.out.println("hello everyone");
	  System.out.println("My contact no is 8390708408 ");
	}
      static void showDetails(String name,char grade,int num) {
	  System.out.println("Hi,I am "+name);
	  System.out.println("Your grade is"+grade);
	  System.out.println("my contact no is"+num);
	
      }
	  static void addNumber() {
	      int num1=20,num2=30,res;
	        res=num1+num2;
	System.out.println("Number 1 is "+num1);
	System.out.println("number 1 is "+num2);
	System.out.println("Result is"+res);
	 }
    static void addNumber(int num1,int num2) {
       int res;
     res=num1+num2;
     System.out.println("Number 1 is "+num1);
 	System.out.println("number 1 is "+num2);
 	System.out.println("Result is"+res);
 	 }
     public static void main(String[] args) {
     showDetails("Pune",'A',55248);
     showDetails("Mumbai",'B',48965);    
     showDetails("Delhi",'C',248337);
     System.out.println("Hi,I am Sonali");
	  System.out.println("hello everyone");
	  System.out.println("My contact no is 8390708408 ");
     
     
     
     
     
     
     
     
     }
}
