package day12.constructors;

public class ConsOverloading2 {
       int age;
	   double salary;
	   ConsOverloading2(){
     	System.out.println("zero parameterized constructors started");

     	System.out.println("having no parameter");
     }
     ConsOverloading2(int a) {
     	System.out.println(" int parameterized constructors");

     	System.out.println("having int parameter");
     }
     ConsOverloading2(double b) {
     	System.out.println(" double parameterized constructors started");

     	System.out.println("having double parameter constructors");
           
     }
     
     ConsOverloading2(int a,double b) {
     	System.out.println("parameterized constructors");

     	System.out.println("int-double parameter constructors");
     }
	public static void main(String[] args) {
		ConsOverloading2 pc1=new ConsOverloading2();
	  System.out.println("After zero para contructor,Age=pc1.age");
	  System.out.println("After zero para contructor,Salary=pc1.salary");

	  ConsOverloading2 pc2=new ConsOverloading2(33);
	  System.out.println("After int para contructor,Age=pc2.age");
	  System.out.println("After int para contructor,Salary=pc2.salary");

	  ConsOverloading2 pc3=new ConsOverloading2(34000.34);
	  System.out.println("After double para contructor,Age=pc3.age");
	  System.out.println("After  double para contructor,Salary=pc3.salary");


	  ConsOverloading2 pc4=new ConsOverloading2(30,95000.34);
	  System.out.println("After int double para contructor,Age=pc4.age");
	  System.out.println("After int double contructor,Salary=pc4.salary");

		
	
	
	
	
	
	
	
	
	
	
	}

	
	
}


