package Day7Assignment4;

public class P5Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp;
		int result=0;
		int reminder;
		temp=num;
		
		while(temp!=0)
		{
			reminder=temp%10;
			result+=(int) Math.pow(reminder, 3);
			temp/=10;
		}
		if(result==num)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is Not Armstrong");
		}
		
		}
	

	}


