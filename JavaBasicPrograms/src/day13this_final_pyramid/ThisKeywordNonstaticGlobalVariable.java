package day13this_final_pyramid;

public class ThisKeywordNonstaticGlobalVariable {

		int age=35;
		void display() {
			System.out.println("Age from display() "+age);
		}
		void calling(int age) {
			System.out.println("Age from calling() "+age);
//			NonStaticGlobalVariableExample1 n2=new NonStaticGlobalVariableExample1();
//			System.out.println("Age global variable is: "+n2.age);
					//or
			System.out.println("Age global variable is: "+this.age);
		}	
		public static void main(String[] args) {
			ThisKeywordNonstaticGlobalVariable n1=new ThisKeywordNonstaticGlobalVariable();
			n1.calling(25);
			n1.display();
		}
	}
