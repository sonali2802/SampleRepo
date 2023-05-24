package allinoneprogramjava;

public class Example1 {

	// global variables
	int gvar=10;
	static int gstaticvar=5;	
	// global variables
	
	//static/ non-static block
	{
		System.out.println("non-static block");
		System.out.println("non-static block global nonstatic variable: "+gvar);
		System.out.println("non-static block global static variable: "+gstaticvar);

	}
	static {	
		System.out.println("static block");		
		System.out.println("static block global static variable: "+gstaticvar);
	}
	//static/ non-static block
	
	// methods or function static non-static
	   public void method1() {
			System.out.println("call nonstatic method");
           int num1=20;
	       int sum;
	       sum=num1+gstaticvar+this.gvar;
	       System.out.println("call nonstatic method sum: "+sum);
	   }
	   public void method11(int num1) {  
			System.out.println("call nonstatic parmerterized method");          
	       int sum;
	       sum=num1+gstaticvar+this.gvar;
	       System.out.println("call nonstatic method parameterized sum: "+sum);
	   }
	    public static void method2() {
	    	System.out.println("call static method");
	    	Example1 obj2=new  Example1();
 
	    	int num=60;
	    	int sub;
	    	sub=num-gstaticvar-obj2.gvar; 
	    	System.out.println("call static method sub: "+sub);
	    	}
	    public static void method22(int num) {
	    	System.out.println("call static method");
	    	Example1 obj2=new  Example1();
	    	int sub;
	    	sub=num-gstaticvar-obj2.gvar; 
	    	System.out.println("call static method sub: "+sub);
	    	}
	    // methods or function static non-static
	    
	    // method overloading
	    	public void print() {
	    		System.out.println("methoad overloading zero param");
	    		System.out.println("methoad overloading with golbal variable gvar: "+this.gvar);
	    	}
	    	
	    	public void print(char a,char b) {
	    		System.out.println("methoad overloading with param");
	    		System.out.println("methoad overloading with param sum :"+(a+b));
	    	}    	
	    	
	    // method overloading
	    	
	    	// constructor
	    	Example1()
	    	{
	    		System.out.println("default constructor");
	    		System.out.println("constructor with static golbal variable gstaticvar :"+gstaticvar);

	    	}
	    	Example1(int num1){
	    	  int num4=45;
	    	  int sum=num4+ num1;	    	  
	    	  System.out.println("constructor sum:"+sum); 	    	
	    	}	    	
	     // constructor
	    
	    // constructor overloading
	    	Example1(double num1,int num2)
	    	{
		    double sum=num1+ num2;	    	  
		    System.out.println("constructor overloading sum:"+sum); 	    	
		    }
	    	Example1(int num1,double num2)
	    	{
		    double multi=num1*num2;	    	  
		    System.out.println("constructor overloading multi:"+multi); 	    	
		    }    	
	    	
	   // constructor overloading	
	    	
	    public static void main(String[] args) {
	    	
	    	// local variable
	    	int a=10;
	    	int b=5;
	    	System.out.println("main method() local vraible a :"+a);
	    	System.out.println("main method() local vraible sum a+b :"+(a+b));
	    	// local varible 
	    	
			Example1 obj1=new  Example1();
	       //print global variables			
				System.out.println("main method() global nonstatic variable: "+obj1.gvar);
				System.out.println("main method() global static variable: "+gstaticvar);
				System.out.println("main method() global static variable with class name: "+Example1.gstaticvar);	
			//print global variables
			
			// print methods or function static non-static
			     obj1.method1();
			     method2();
			     obj1.method11(25);
			     method22(30);
		  // print methods or function static non-static
	        
			
		  // print method overloading
				obj1.print() ;   
				obj1.print('A','r');    
		 // print  method overloading
			
		 // print constructor
				Example1 obj2=new  Example1();
		        Example1 obj3=new Example1(40);
		// print constructor
		        
		// print constructor overloading
		        Example1 obj4=new Example1(25.36,10);
		        Example1 obj5=new Example1(5,10.5);
		    	
		// print constructor overloading	
		 
		// print this keyword & this() statement
		        A1 a1=new A1(); 
		        A1 a2=new A1(200);      
		 // print this keyword & this() statement
	 			
		}
	    	}  	

//this keyword & this() statement

class A1
{
	int age=20;
	A1()
	{
		this(100);
		System.out.println("this statement default statement");
		System.out.println("this statement default statement this.age :"+this.age);
	}
	A1(int a)
	{
		System.out.println("this statement A1 default statement with parameter a :"+a);
	}
}
//this keyword & this() statement




