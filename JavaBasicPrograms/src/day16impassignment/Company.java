package day16impassignment;

//parent class

  class A {
	  //global variable
     int age=10;
  //method overloading
   
     void display() {
  System.out.println("i am class A default method");
    System.out.println("i am class A default method age: "+this.age); 
     }
    void display(int a) {
    System.out.println("i am class A parameter method");	
    int sum=a+this.age;
   System.out.println("i am class A parameter method addition of two number:"+sum);
    }
  //constructor overloading
    A()
    {
    	
        System.out.println("i am class A default constructor");	

    }
  A(int b){
	  this();
	  System.out.println("i am class A paramt constructor b: "+b);	

  
  }  
  }

  // child class
 class B extends A {
	 //global variable
     int num=20;
  //method overloading
     void show() {
  System.out.println("i am class B default method");
    System.out.println("i am class B default method age: "+this.num); 
     }
    void show(int a) {
    System.out.println("i am class B parameter method");	
    int multi=a*this.age;
   System.out.println("i am class B parameter method addition of two number:"+multi);
    }
    //constructor overloading
    B()
    {   	
    	
    	super();
    	super.display();
        System.out.println("i am class B default constructor");	

    }
    B(int a)
    {   	
    	super(20);
        System.out.println("i am class B parameter constructor a :"+a);	

    }
 }

 // main class

class Company {	
	public static void main(String[] args) {
		B e1=new B();
	    e1.display();
	    e1.show();
	   e1.display(25);
	   e1.show(30);
	   B e2=new B(10);
	}

}
