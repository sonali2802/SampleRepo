package Day9Assignment;

public class ConstructorsNonstaticVariable1 {
    int age=25;
	void display (int age) {
	  System.out.println("age:"+age);
	  ConstructorsNonstaticVariable1 m1=new ConstructorsNonstaticVariable1();
	  System.out.println("NSGV age:"+m1.age);
	  System.out.println("NSGV age:"+this.age);
	}
	public static void main(String[] args) {
		  ConstructorsNonstaticVariable1 n1=new ConstructorsNonstaticVariable1();
           n1.display(50);
	}

}
