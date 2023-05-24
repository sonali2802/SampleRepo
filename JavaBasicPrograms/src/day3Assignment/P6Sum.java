package day3Assignment;

public class P6Sum {
	
	P6Sum()
	{
		System.out.println("Default Constructor");
	}
	
	P6Sum(int msg)
	{
		System.out.println("Parameterized Constructor "+ msg);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6Sum objP6Sum=new P6Sum();
		P6Sum objP6Sum1=new P6Sum(50);

	System.out.println("Program start...");
	int num1;
	int num2;
	int sum;
    num1=10;
	num2=20;
	
	sum=num1+num2;
	
	System.out.println(sum);
    
     System.out.println("Program ends...");
	
	
	}

}
