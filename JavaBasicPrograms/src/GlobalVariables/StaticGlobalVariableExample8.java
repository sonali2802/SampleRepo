package GlobalVariables;

public class StaticGlobalVariableExample8 {
	static int age=25;
    static boolean res;
    static char grade='B';
    static float roi;
    public static void main(String[] args) {
    	System.out.println("Program start");
		  System.out.println(" value of age is:"+StaticGlobalVariableExample8.age);
		  System.out.println("default value of res is:"+ StaticGlobalVariableExample8.res);
		  System.out.println(" value of grade is:"+StaticGlobalVariableExample8.grade);
		  System.out.println("default value of roi is:"+StaticGlobalVariableExample8.roi);

			System.out.println("Initialization of static Global variable");
			age=35;
			res=true;
		    grade='B';
			roi=6.5f;
			 System.out.println("Updated value of age is:"+StaticGlobalVariableExample8.age);
			  System.out.println("Updated value of res is:"+ StaticGlobalVariableExample8.res);
			  System.out.println("Updated value of grade is:"+StaticGlobalVariableExample8.grade);
			  System.out.println("Updated value of roi is:"+StaticGlobalVariableExample8.roi);

			  System.out.println("Program end");
			
			
	}

}
