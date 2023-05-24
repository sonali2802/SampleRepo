package allinoneprogramjava;

class Demo2
{
	 //global variable
	 static  int a=20;//static global variable
	 double b=10;     //non static global variable
	    //global variable
	 
	 //block static,non-static
	 {
			System.out.println("non-static block Demo2 class");
			System.out.println("global non static variableDemo2 class : "+this.b);
			
	}
		static {	
			System.out.println("static block Demo2 class");		
			System.out.println("global static variableDemo2 class : "+a);
		}
	 //block static,non-static
	
		 //method or function
		 public static void show1() {    //static method
			 System.out.println("Hello,everyone");
			
			 
			 } 
			  public static void show2(double a,double d) {    //static method
					 System.out.println("parametrized static method");
					 double result=a+d;
					 System.out.println("addition"+result);
			  
			  }	 
			 
			 public void show3() {
			 System.out.println("call show3");
		
			}
			 public void show4(double a,int b) {
				 System.out.println(" parametrized non-static method");
			        double res=a%b;
				  System.out.println("Mod:"+res);
			
			 }
		
		 //method or function

  //method overloading
void show5(int num){
    System.out.println("Running parameter value");
}
void show5(int num1,double num2)  { 
	 System.out.println("Running parameter two value");
       System.out.println("running parameter value with sum:"+(num1+num2));
  }  

}


class Demo1 {
    //global variable
	 static  int age=20;//static global variable
	 double salary=90000;     //non static global variable
	    //global variable
	 
	 //block static,non-static
	 {
			System.out.println("non-static block");
			
	}
		static {	
			System.out.println("static block");		
		}
	 //block static,non-static
	
	 //method or function
	 public static void display1() {    //static method
	 System.out.println("Hello,everyone");
	 System.out.println("Good morning");
	 System.out.println("static global variable age:"+age);
	 
	 } 
	  public static void display10(double a,double d) {    //static method
			 System.out.println("parametrized static method");
			 double result=a*d;
			 System.out.println("multiplication:"+result);
	  
	  }	 
	 
	 public void display2() {
	 System.out.println("Hi,I am Java");
	 System.out.println("You are learn Java");
	 System.out.println("non static global variable salary:"+salary);
	}
	 public void display20(double a,int b) {
		 System.out.println(" parametrized non-static method");
	        double res=a/b;
		  System.out.println("division:"+res);
		  
		}
		
	 //method or function
	 
	 
	 //method overloading
	    void Example1(int num){
	        System.out.println("Running parameter value");
	       System.out.println("running parameter value with global variable:"+age);
	  }
	    void Example1(int num1,double num2)  { 
	    	 System.out.println("Running parameter two value");
		       System.out.println("running parameter value with sum:"+(num1+num2));
		  }  
	    	   //method overloading
	 
	 public static void main(String[] args) {     //non static method
      System.out.println("program start");   
	      //local variables
     int age=25;
	System.out.println("local variable age:"+age);
	Demo1 obj1=new Demo1();
    System.out.println("Static global variable age :"+age);
	System.out.println("Non-static global variable salary:"+obj1.salary);
	//method call
	System.out.println("Method call");
	 obj1.display2();
	  display1();
	 //with parameter
	  display10(35.15,40.5);
	  obj1.display20(25.18,50);
	 //with overloading
	  obj1.Example1(10);
	  obj1. Example1(15,20.5);
	  //////////////////////  //////////////////////////////
	  
	     System.out.println("Demo2 class start");  
	     Demo2 obj2=new Demo2();
          obj2.show1();
          obj2.show2(5.5,10.5);
          //with parameter
          obj2.show3();
	      obj2.show4(30.5,15);
	       //method overloading
	    obj2.show5(500);
	    obj2.show5(10,50.10);

	 }
	 

}
 
