package Day5Assignment;

public class UnaryOp3 {

	private static String res;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a =-1, b;
	b=a++ + ++a + ++a +a;
	//initial: -1    1    2    2  <--b
	// final:  0    1    2    2  <-- a =-1+3=2
	System.out.println("a: "+a);//2
	System.out.println("b; "+b);//4
	System.out.println(" res: "+res);
	a = 7;
	b=a-- + --a + --a +a;
	System.out.println("a1: "+a);
	System.out.println("b: "+b);
	
	a = -21;
	b = --a + --a + --a + a + ++a + a++;
	System.out.println(a);
	System.out.println(b);
	
	a=-5;
	b= a-- + a + ++a + a++ + ++a + a++ + a;
	System.out.println(a);
	System.out.println(b);
	
	}

}
