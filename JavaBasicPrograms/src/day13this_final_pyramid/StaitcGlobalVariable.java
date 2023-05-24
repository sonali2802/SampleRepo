package day13this_final_pyramid;

public class StaitcGlobalVariable {
		static int age=35;
		public static void main(String[] args) {
			int age=25;
			System.out.println("I am local age: "+age);
			System.out.println("I am global age: "+StaitcGlobalVariable.age);
		}
	}
