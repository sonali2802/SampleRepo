package abstration;
interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}
class Interface3 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		Interface3 obj = new Interface3();
		obj.print();
		Showable1 obj1 = new Interface3();
		obj1.print();
		Printable1 obj2 = new Interface3();
		obj2.print();
	}
}

