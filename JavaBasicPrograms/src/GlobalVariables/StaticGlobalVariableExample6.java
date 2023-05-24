package GlobalVariables;

public class StaticGlobalVariableExample6 {
    static int age;
    static boolean res;
    static char grade;
    static float roi;
	public static void main(String[] args) {

		 System.out.println("Program start");
		  System.out.println("default value of age is:"+age);
		  System.out.println("default value of res is:"+res);
		  System.out.println("default value of grade is:"+grade);
		  System.out.println("default value of roi is:"+roi);
		
		System.out.println("Updating value");  
		 age=25;
	     res=true;
	     grade='A';
	     roi=6.5f;
	     System.out.println("Updated value of age is:"+age);
		  System.out.println("Updated value of res is:"+res);
		  System.out.println("Updated value of grade is:"+grade);
		  System.out.println("Updated value of roi is:"+roi);
		
	 System.out.println("Program end");
		
	
	
	}

}
