package Day7Assignment4;

public class P3Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		int sum=0;
		int temp;
		int num=171;
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(" Palindrome Number");
		}
		else
		{
			System.out.println(" Not Palindrome Number");
		}

	}

}
