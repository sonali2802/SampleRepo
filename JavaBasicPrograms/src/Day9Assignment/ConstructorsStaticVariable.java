package Day9Assignment;

public class ConstructorsStaticVariable {
       static int age=25,salary;
	 public static void main(String[] args) {
        System.out.println("Static global Age: "+age);
	   int age =10;
	 System.out.println("Age:"+age);
	 System.out.println("Static global Variable:"+ConstructorsStaticVariable .age);
	 display() ;
	 }
	 static void display() {
	 System.out.println("Salary:"+salary);
	 int salary=25000;
	 System.out.println("Salary:"+salary);
	 System.out.println("Static global Salary:"+ConstructorsStaticVariable .salary);

	 }
   
}
