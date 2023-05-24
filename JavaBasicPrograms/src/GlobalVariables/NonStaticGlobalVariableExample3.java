package GlobalVariables;

public class NonStaticGlobalVariableExample3 {

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
	
	  System.out.println("Upadating non-static varibles");
	  ref1 .age=25;
      ref1. res=true;
      ref1 .grade='B';
      ref1. roi=7.5f;
  	System.out.println("Updated,Non-static variable age: "+ref1.age);	
	System.out.println("Updated,Non-static variable res: "+ref1.res);	
    System.out.println("Updated,Non-static variable grade: "+ref1.grade);
    System.out.println("Updated,Non-static variable roi: "+ref1.roi);
         System.out.println("Program end");
	
	
	
	
	
	
	
	
	
	}

}
