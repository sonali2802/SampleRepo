package Day7Assignment3;

public class P11FactorNegativeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int num=-20;
			for(int i=num;i<=Math.abs(num);++i)
			{
			  if(i==0)
			  {
		continue;
			  }
			  else
			  {
				  if(num%i==0)
				  {
					  System.out.println(i);
				  }
			  }
			
			} 
	
	}

}
