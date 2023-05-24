package GlobalVariables;

public class NonStaticVariableExample4 {
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
		System.out.println("New instance created");        
	    NonStaticVariableExample4 ref2 = new NonStaticVariableExample4();
	    System.out.println("default with ref2,Non-static variable age: "+ref2.age);	
    	System.out.println("default with ref2,Non-static variable res: "+ref2.res);	
        System.out.println("default with ref2,Non-static variable grade: "+ref2.grade);
        System.out.println("default with ref2,Non-static variable roi: "+ref2.roi);
		    
		    
		    
		    System.out.println("Program end");
			
	
	
	
	
	
	
	
	
	
	
	}

}
