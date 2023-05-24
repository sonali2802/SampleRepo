package GlobalVariables;

public class AllinOneVariables {
       static int empID=10;
	   double salary;
	public static void main(String[] args) {
      System.out.println("Program start"); 
		int age=25;
	System.out.println("age: "+age);//25
	System.out.println("Accessing static members");//10
	System.out.println("initial static GV empID: "+AllinOneVariables.empID);//10
	System.out.println("Accessing non-static members");//0
	AllinOneVariables r2;
	r2=new AllinOneVariables();//object created
	AllinOneVariables r1=new AllinOneVariables();//object created
System.out.println("initial NSGV salary: "+r1.salary);//0.0
	r1.salary=95000;
System.out.println("updated NSGV salary: "+r1.salary);//95000.0	
	System.out.println("new  instance of the class");
	AllinOneVariables m2=new AllinOneVariables();//object created
	System.out.println("initial NSGV salary: "+r2.salary);//0.0
System.out.println("updated");//
AllinOneVariables.empID=1001;
System.out.println("updated static GV empID: "+empID);//1001	
System.out.println("Program end");
	
	}
         

}
