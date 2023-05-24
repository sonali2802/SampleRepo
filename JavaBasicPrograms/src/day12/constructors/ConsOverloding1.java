package day12.constructors;

public class ConsOverloding1 {
        ConsOverloding1() {
        	System.out.println("zero parameterized constructors");

        	System.out.println("having no parameter");
        }
        ConsOverloding1(int a) {
        	System.out.println("parameterized constructors");

        	System.out.println("having int parameter");
        }
        ConsOverloding1(double b) {
        	System.out.println("parameterized constructors");

        	System.out.println("having double parameter");
        }
        ConsOverloding1(int a,double b,int c) {
        	System.out.println("parameterized constructors");

        	System.out.println("having double,int,int parameter");
        }
	public static void main(String[] args) {
		ConsOverloding1 pc5=new ConsOverloding1();
		ConsOverloding1 pc1=new ConsOverloding1(12);
		ConsOverloding1 pc2=new ConsOverloding1(13.34);
		ConsOverloding1 pc3=new ConsOverloding1(10,13.34,45);


	
	
	
	
	
	
	
	
	
	}

}
