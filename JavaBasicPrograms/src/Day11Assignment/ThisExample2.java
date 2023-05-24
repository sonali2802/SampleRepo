package Day11Assignment;

public class ThisExample2 {

	int x=25,y=55;
	void calling(int x)
	{
	  System.out.println("local variable x: "+x);
      System.out.println("non static global variable "+y);
	//ThisExample e1=new ThisExample();	
	System.out.println("non static global x: "+this.x);	
	//this.display();
	}
	void display() {
	System.out.println("I am display method");
	System.out.println("Display ends here");
	}
	public static void main(String[] args) {
     ThisExample2 t1=new ThisExample2();
	       t1.calling(10);
	}
	static void testing() {
	System.out.println(" Hello,I am testing");
	
	
	
	
	
	}

}
