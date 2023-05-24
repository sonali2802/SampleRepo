package Day7Assignment4;

public class P4Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		int i=2;
		int count=0;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
	}

}
