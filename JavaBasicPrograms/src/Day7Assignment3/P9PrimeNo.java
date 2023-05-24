package Day7Assignment3;

public class P9PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num  =5;
	int count =0;
	 
	for( int i=1; i<=num; i++) 
	{
	if(num%i==0);
	{
	  count++;
	}
	
	}
	if(count==2)
	{
	System.out.println("no is prime");
	}
	else
	{
     System.out.println("Number is not prime");
  }
	}
	}