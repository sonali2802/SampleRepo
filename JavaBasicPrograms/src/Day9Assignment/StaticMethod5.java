package Day9Assignment;

public class StaticMethod5 {

		public static void display() {
			
		      System.out.println("Hi,I am Sonali");
			  System.out.println("hello everyone");
			  System.out.println("My contact no is 8390708408 ");
			}
		      static void showDetails(String name,String string,int num) {
			  System.out.println("Hi,I am "+name);
			  System.out.println("Your grade is"+string);
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
		 		StaticMethod5 e1=new StaticMethod5();
		       e1.display();
		       e1.showDetails("Sona","Net",42680);
		       e1.addNumber();
		       e1.addNumber(25,30);
		
		
		 	
		
	}
		
				
}
				
			
			
		

