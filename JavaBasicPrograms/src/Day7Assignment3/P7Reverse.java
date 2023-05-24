package Day7Assignment3;

public class P7Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  int num= 12345;
	  int reverse =0;
	
	  for( ;num != 0; num=num/10)   
	  {
		  int reminder=num%10;
		  reverse=reverse*10+reminder;
	  }
	
	System.out.println(reverse);
	
	
	
	}

}
