package array;

public class ArrayExample13 {

	public static void main(String[] args) {
		//initialize array
		int []number= {1,2,3,4,5};
		System.out.println("Original Value");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		 
		int n=3;

	//rotate the given array by n times towards right
	 for(int i=0;i<n;i++) {
	  int j,last;
	 //stores the last element of the array
	   last =number[number.length-1];
	  for(j=number.length-1;j>0;j--) {
	 //first element of array of one by one
	   number[j]=number[j-1];
	  }
	 //first element of array added to the end  
	  number[j]=last;
	  } 
	 System.out.println();
	//display resulting array after rotation
	System.out.println("Array after right rotation :");
	for(int i=0;i<number.length;i++) {
	System.out.println(number[i]+" ");
	
	}
	
	} 

}

	


