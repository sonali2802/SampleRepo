package GlobalVariables;

public class StaticGlobalVariableExample7 {
	 static int age;
	    static boolean res;
	    static char grade;
	    static float roi;
	public static void main(String[] args) {
		System.out.println("Program start");
		  System.out.println("default value of age is:"+StaticGlobalVariableExample7.age);
		  System.out.println("default value of res is:"+ StaticGlobalVariableExample7.res);
		  System.out.println("default value of grade is:"+StaticGlobalVariableExample7.grade);
		  System.out.println("default value of roi is:"+StaticGlobalVariableExample7.roi);

	System.out.println("Initialization of static Global variable");
	StaticGlobalVariableExample7.age=25;
	StaticGlobalVariableExample7.res=true;
	StaticGlobalVariableExample7.grade='A';
	StaticGlobalVariableExample7.roi=6.5f;
	 System.out.println("Updated value of age is:"+StaticGlobalVariableExample7.age);
	  System.out.println("Updated value of res is:"+ StaticGlobalVariableExample7.res);
	  System.out.println("Updated value of grade is:"+StaticGlobalVariableExample7.grade);
	  System.out.println("Updated value of roi is:"+StaticGlobalVariableExample7.roi);

	  System.out.println("Program end");
	
	
	
	
	
	
	
	
	
	
	}

}
