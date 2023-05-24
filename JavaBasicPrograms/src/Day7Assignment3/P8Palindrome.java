package Day7Assignment3;

public class P8Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1,num2=0;
	int num3;

	int rem=0;
	     num1 = 121;
	     num3 =num1;
	

	  for( ;num1!=0;num1/=10){
		  rem= num1 % 10;
		  num2 = (num2 * 10) + rem;
	    }
	


	 if(num2==num3)
	 {
	 System.out.println("palindrome number");
     }
     else
     {
	 System.out.println("Not palindrome number");
	 
	 }
	}
	
	} 