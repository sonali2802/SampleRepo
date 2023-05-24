package day12.constructors;

public class Constructor2 {
         Constructor2(){
	       System.out.println("this is a zero para constructor");
         }
	        Constructor2(char c) {
		       System.out.println("this is a single para constructor");

	     }
	         Constructor2(int num1,int num2) {
		       System.out.println("this is a int int parameterized constructor");
	       }
	          Constructor2(double num1,int num2) {
		       System.out.println("this is a double int parameterized constructor");
	       }
	         Constructor2(int num1,double num2) {
		       System.out.println("this is a  int double parameterized constructor");
	       }
	public static void main(String[] args) {
		Constructor2 c1 = new Constructor2();
		Constructor2 c2 = new Constructor2(10,20);
		Constructor2 c3 = new Constructor2('d');
		Constructor2 c4 = new Constructor2(10d,20);
		Constructor2 c5 = new Constructor2(10,20.45);
	}   

}
