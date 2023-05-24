package Day11Assignment;

class Test {
   void m() {
	  System.out.println("hello m");
   }
	 void n() {
	System.out.println("hello n");
	this.m();
	 }
}	
	class ThisKeyward5 {
	    void methodOne() {
	System.out.println("Inside Method ONE");
	    }
	    void methodTwo() {
	    	System.out.println("Inside Method TWO ");
               this.methodOne();
               }
	public static void main(String[] args) {
            ThisKeyward5 obj=new ThisKeyward5();  
	                 obj.methodTwo();
	     Test a =new Test();
	            a.n();
	
	
	
	
	}

}
