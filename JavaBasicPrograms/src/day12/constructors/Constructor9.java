package day12.constructors;

public class Constructor9 {
        int age; 
	    double salary;
		private Object ref1;
	    Constructor9() {
	System.out.println(" user defined zero-param constructor start from here");
	     age=25;
	     salary=32506.56;
	 	System.out.println(" user defined zero-param constructor ends from here");
	    }
	public static void main(String[] args) {
	    Constructor9 ref = new Constructor9();
	  System.out.println("ref1.age");
	 System.out.println("ref1.salary");
	          ref.age=55;
	System.out.println("updated age with ref1:"+ref.age);
	System.out.println("cc");
	  Constructor9 ref2=new Constructor9();
	System.out.println(ref2.age);
	System.out.println(ref2.salary);
	
	}

}
