package Day7Assignment;

public class P5Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // swap two numbers using temporary value
	int num1=22;	
	int num2=34;
    int temp;	
	System.out.println("before swap");
	System.out.println("num1= "+num1);
	System.out.println("num2= "+num2);
	temp = num2;
	num2=num1;
	num1=temp;
	System.out.println("after swap");
	System.out.println("num1= "+num1);
	System.out.println("num2= "+num2);
	
	
	
	
	
	}

}
