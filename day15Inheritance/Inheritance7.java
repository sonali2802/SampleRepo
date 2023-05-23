package day15Inheritance;

//parent
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);//5
		taste();//calling orange class taste method		
//		fruits f1=new fruits();
//		System.out.println("Fruits class fruitAge variable: "+f1.fruitAge );
//		f1.taste();
		System.out.println("Fruits fruitAge: "+super.fruitAge);//7
		super.taste();//parent class fruit taste method
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************************************");
	}
}

