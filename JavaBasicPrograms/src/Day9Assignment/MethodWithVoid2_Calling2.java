package Day9Assignment;

public class MethodWithVoid2_Calling2 {

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
		System.out.println("program start ");
		MethodWithVoid2_Calling2.display();
		MethodWithVoid2_Calling2.print('A');
		MethodWithVoid2_Calling2.call(123);
		System.out.println("passing parameters using variables");
		   int x=123;
		   char c='A';
			MethodWithVoid2_Calling2. print(c);
			MethodWithVoid2_Calling2.call(x);
		System.out.println("program ends");
		
		
	
	
	}
	
	
	
	
	}