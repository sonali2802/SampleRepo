package Day10Assignment;

public class StaticVariable {

	   static int age=25,salary;
	public static void main(String[] args) {
		
   System.out.println("static global age: "+age);
	int age=10;
	System.out.println("static global variable:"+StaticVariable. age);
	display();
	}
    static void display() {
  System.out.println("Salary: "+salary);	
	int salary=25000;
   System.out.println("Salary:"+salary);    
    System.out.println("static global salary:"+StaticVariable.salary);
    
    
    
    
    }
    
    
    }
