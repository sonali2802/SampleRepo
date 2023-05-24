package GlobalVariables;

public class StaticGlobalVariableExample9 {
         static int num1,num2=25,res;
	public static void main(String[] args) {
     System.out.println("Program starts");
	System.out.println("Number1 is: "+num1);
	System.out.println("Number2 is: "+num2);
     res=num1+num2;
	System.out.println("Result is:"+res);
	System.out.println("Updated number");
	   num1=75;
	   System.out.println("Updated Number1 is: "+num1);
		System.out.println("Updated Number2 is: "+num2);
	     res=num1+num2;
System.out.println("Updated Result is:"+res);
	   System.out.println("Updated number");
	   num1=85;
	   num2=65;
	   System.out.println("Updated Number1 is: "+num1);
	 		System.out.println("Updated Number2 is: "+num2);
	 		 res=num1-num2;
	 		System.out.println("Updated Result is:"+res);
	System.out.println("Program ends");
	
	}

}
