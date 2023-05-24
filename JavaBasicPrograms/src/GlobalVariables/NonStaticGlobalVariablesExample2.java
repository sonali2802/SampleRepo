package GlobalVariables;

public class NonStaticGlobalVariablesExample2 {
	  int age;
      boolean res;
      char grade;
      float roi;
	public static void main(String[] args) {
    System.out.println("Program start");
   
    NonStaticGlobalVariablesExample2 ref;
    NonStaticGlobalVariablesExample2 ref1 = new NonStaticGlobalVariablesExample2();
    	System.out.println("default,Non-static variable age: "+ref1.age);	
    	System.out.println("default,Non-static variable res: "+ref1.res);	
        System.out.println("default,Non-static variable grade: "+ref1.grade);
        System.out.println("default,Non-static variable roi: "+ref1.roi);
	
	System.out.println("Program end");
	
	
	}

}
