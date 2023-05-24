package Day7Assignment4;

public class P1CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=12345;
		while(num!=0)
		{
			num/=10;
			++count;
		}	
		System.out.println("Number of digits: "+count);	
		
	}

}
