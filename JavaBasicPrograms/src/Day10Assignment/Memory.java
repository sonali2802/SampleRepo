package Day10Assignment;

public class Memory {
 
	private static final String Mamory = null;
	static int salary=25000;
	static int empID=205;
	void display() {
	System.out.println("I am display()...");
	}
	static void print() {
		
		System.out.println("I am print()....");
	}
	
	public static void main(String[] args) {
	//static variable and method	
		System.out.println("static varible salary: "+Memory .salary );
		    Memory m1=new Memory();
		    System.out.println("non-static variable empID: "+m1.empID);

		//Memory print();
	//non-static variable and method
	   // memory m1=new memory();
	    System.out.println("non-static variable empID: "+m1.empID);
	     m1.display();
	//updated static member
	  Memory.salary=25000;
	 System.out.println("updated static variable salary:"+Memory.salary);
	       m1.empID=205;
	System.out.println("updated non-static variable empID: "+m1.empID);
	  Memory m2=new Memory();
	System.out.println("2nd instance non-static variable empID: "+m2.empID);
	m2.display();
	}
	}