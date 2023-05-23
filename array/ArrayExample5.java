package array;
 
class ArrayExample5 {
				//Java program to print the elements of an array
		public static void main(String[] args) {
		int []number= {3,9,5,6,4};
	  //for-each loop
		System.out.println("Using Foreach"); 
	for(int n:number) {
		System.out.println(n); 
		 
	        }
	System.out.println("Using ForLoop"); 
	//or for-loop	
	int num[]= {3,9,5,6,4};
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
		
		
		// Using index
	System.out.println("Using index"); 
		System.out.println(number[0]); 
		System.out.println(number[1]); 
		System.out.println(number[2]); 
		System.out.println(number[3]); 
		System.out.println(number[4]); 
		
		// Array length
	System.out.println("Array total element count: "+number.length); 
		}	
}		
