package Day9Assignment;

public class MethodWithVoid1_Calling {
     static void display() {
	System.out.println("I am display method");
     }
	static void print(char c1){
	System.out.println("I am print method and printing char as:"+c1);
	}
	private static void call(long num) {
	System.out.println("I am call method and calling number is "+num);
	}
	
	public static void main(String[] args) {
	System.out.println("program start");
    display();
	print('A');
	call(123);
	System.out.println("passing parameters using variables");
	   int x=123;
	   char c='A';
	   print(c);
	    call(x);
	System.out.println("program ends");
	
	
	}

}
