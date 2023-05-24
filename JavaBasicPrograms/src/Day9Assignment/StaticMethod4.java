package Day9Assignment;

public class StaticMethod4 {
	  int addNumber() {
	int num1=20,num2=30,res;
      res=num1+num2;
      System.out.println("Number 1 is "+num1);
      System.out.println("number 1 is "+num2);
      return res;
}
	   int addNumber(int num1,int num2) {
		     int res;
		   res=num1+num2;
		   System.out.println("Number 1 is "+num1);
			System.out.println("number 1 is "+num2);
			return res;
		  }   
	
    public static void main(String[] args) {
         StaticMethod4 e1=new StaticMethod4(); 
    	System.out.println("");
	System.out.println("Result1:"+e1.addNumber());
	System.out.println("Result2:"+e1.addNumber(25,55));
       int res=e1.addNumber(33,77);
	System.out.println(+res);	
       int finalValue=res+100;	
	System.out.println("Final Value: "+finalValue);
	
	
	
	
	
	
	}

}
