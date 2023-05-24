package day17overriding;


class Animal7 {
	void eat() {
		System.out.println("eat() of Animal7 class...");
	}
	Animal7()
	{
		System.out.println("Animal7 Constructor...");
	}
}
class Dog7 extends Animal7 {
	void eat() {
		System.out.println("eat() of Dog7 class...");
	}
	void bark() {
		System.out.println("bark() of Dog7 class...");
	}
	void work() {
		
		super.eat();
		bark();
		eat();
		System.out.println("work() of dog7 class");
	}
}
class SuperKeyWord2 {
	public static void main(String args[]) {
		Dog7 d = new Dog7();
		d.work();
	}
}
