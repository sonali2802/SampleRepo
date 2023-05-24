package Day11Assignment;


       class A  {      	   
       
	  void m() {
	  System.out.println("Hello,m");
	  }
	  void n() {
	  System.out.println("hello,n");
	  m();
	  }
       }

	  class ThisKeywords { 
       void methodOne () { 
    	   System.out.println("Inside method One");   
       }
    void methodTwo() {	   
    	System.out.println("Inside method Two");   
      methodOne();
    }   
    public static void main(String args[]) {
    	ThisKeywords	obj= new ThisKeywords();
    	 obj.methodTwo() ; 
    	 A a=new A();  
    	  a. n(); 
      
    }
	  }


	  