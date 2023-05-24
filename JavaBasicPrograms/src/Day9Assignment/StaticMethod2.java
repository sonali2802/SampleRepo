package Day9Assignment;

public class StaticMethod2 {

	public static void main() {
	System.out.println("zero param main");     
	}
	public static void main(int i) {
		System.out.println("int-param main");     
		}
	public static void main1(double d,int a) {
		System.out.println("double int param main");     
	}
		public static void main(String[] args) {
				
		System.out.println("main method started");
		
		       main();
	          main(10);
	          main();
	     System.out.println("main method ends");
	
	
	
	     class StaticMethod {
	         void display() {
	 	  System.out.println("I am display method");
	         }
	 	static void print(char c1) {
	     System.out.println("I am print method and printing char is: "+c1);
	 	}
	     private void call(long num) {
	     System.out.println("I am call method and calling number is:"+num);
	     }
	     
	     }

	
	}

}
