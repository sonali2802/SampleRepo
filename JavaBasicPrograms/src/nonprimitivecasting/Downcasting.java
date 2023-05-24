package nonprimitivecasting;

class SuperParent{
	void calling() {
		System.out.println("I am calling method");
	}
}
public class Downcasting extends SuperParent {
	
	void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		
		SuperParent p1=new Downcasting();//up casting
		p1.calling();
		
		Downcasting d2=(Downcasting)p1;//down casting
		d2.calling();
		d2.display();
	}

}
