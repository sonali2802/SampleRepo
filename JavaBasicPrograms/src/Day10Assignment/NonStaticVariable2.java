package Day10Assignment;

public class NonStaticVariable2 {

	
         int age=25;
	     void display(int age) {
	    	NonStaticVariable2 x1=new NonStaticVariable2();
	System.out.println("NSGV age: "+x1.age);
	System.out.println("NSGV age: "+this. age);
	     }
	public static void main(String[] args) {
	
	  NonStaticVariable2 n1=new  NonStaticVariable2();
	  n1.display(50);
	
	
	}
	

}


