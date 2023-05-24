package Day11Assignment;

public class ThisKeyword1 {
          int age;
          void call() {
	                System.out.println("I am call method");
          }
	     void m(int age) {
	   System.out.println("local age: "+age);
	   System.out.println("Global age: "+this .age);
      System.out.println("this keyword value is "+this);
	    	 
	     } 
	   public static void main(String[] args) {
	      ThisKeyword1 obj=new ThisKeyword1();
	System.out.println("object value is: "+obj);
	obj.m(25);
	
	
	
	
	
	
	}

}
