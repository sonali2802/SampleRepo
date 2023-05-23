package array;

public class Practice {

	public static void main(String[] args) {
		
				int []number= {3,9,5,6,4};
				
				System.out.println("Using Foreach");
				for(int n:number) {
				System.out.println(n);
				}
				System.out.println("Using For");
			for(int i=0;i<number.length;i++){
			  System.out.println(number[i]);				
				
			}
	
			System.out.println("Reverse the value");
			for(int i=number.length-1;i>=0;i--) {
				System.out.println(number[i]);
			}
	
			System.out.println("Sum the value using foreach");
	           int sum=0;
	           for(int n:number) {	        	          	   
	        	   sum=sum+n;	
					}
	           
	           System.out.println("Sum="+sum);	
	           sum=0;
	           System.out.println("Sum the value using foreach");
                 
	           System.out.println("Sum the value using for");
	           for(int i=0;i<number.length;i++)
                  {
                	sum=sum+number[i];
                  }
	           System.out.println("sum:"+sum);  
   
            int multi=1;
            
            System.out.println("Multiplication the value using foreach");
            
             for(int n:number) {	        	          	   
	          multi=multi*n;	
		}
   
            System.out.println("multi"+multi);
            
            int multi1=1;
            System.out.println("Multiplication the value using for");
	           for(int i=0;i<number.length;i++)
               {
             	multi1=multi1*number[i];
               }
	           System.out.println("Multiplication:"+multi1);  
            
            
            
}

}
