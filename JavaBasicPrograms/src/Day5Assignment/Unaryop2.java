package Day5Assignment;

public class Unaryop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=  -95, b;
	b = a++;//b=-95,a=-94;
	int x = a,y;//a=-94, x=-94;	
	System.out.println("x");// -94;
	y=++x;// y=-95,x=-93
	System.out.println("a"+ a);//-94
	System.out.println("b"+b);//-95
	System.out.println("x"+x);//-93
	System.out.println("y"+y);//-93
	
	int p = 15, q = 30,res;
	res =p++ + --q;//res =
	
	System.out.println("res: " +res);//
	System.out.println("p: "+p);//
	System.out.println("q: "+q);//
	
	int res1 =++p + ++q;
	System.out.println(res1);
	System.out.println("p: "+p);
	System.out.println("q: "+q);
	
	}

}
