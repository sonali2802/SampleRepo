package day13this_final_pyramid;

class A1{
	 A1(){
	this(25);
        System.out.println("hello zero");
	 }
	 A1(double d){
		 System.out.println("hello double"+d);
		 }
	 A1(int x){
	 
	    this(25.36);
	 System.out.println("hello int"+x);
	 }
} 
	 class ThiskewordStatement2{
	 public static void main(String[] args) {
	 
	 A1 a1=new A1();
	 }
	 }