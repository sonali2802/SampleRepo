package Day9Assignment;

public class StaticMethod1 {

	static int addNumber() {
	      int num1=10,num2=15,res;
	        res=num1+num2;
	System.out.println("Number 1 is "+num1);
	System.out.println("number 1 is "+num2);
	return res;
	 }
  static int addNumber(int num1,int num2) {
     int res;
   res=num1+num2;
   System.out.println("Number 1 is "+num1);
	System.out.println("number 1 is "+num2);
	return res;
  }   
	public static void main(String[] args) {
    System.out.println("1");
     addNumber(10,15);
     System.out.println("2");
  System.out.println("Result is:"+addNumber(20,40));
   System.out.println("3");  
 int res=StaticMethod1.addNumber(20,40);
   System.out.println("Result of two number:"+res);
 int finalResult=res*10;
	System.out.println("Updated values is "+finalResult);
	int x=finalResult+100;
	System.out.println(x);
	
	
	}

}
