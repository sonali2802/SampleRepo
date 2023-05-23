package array;

public class ArrayExample3 {

	public static void main(String[] args) {
		int []number= {1,2,3,4,5};
		System.out.println("Original Value");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		 
		int n=3;

	//rotate the given array by n times towards left
	 for(int i=0;i<n;i++) {
	  int j,first;
	 //stores the first element of the array
	   first =number[0];
	  for(j=0;j<number.length-1;j++) {
	 //first element of array of one by one
	   number[j]=number[j+1];
	  }
	 //first element of array added to the end  
	  number[j]=first;
	  } 
	 System.out.println();
	//display resulting array after rotation
	System.out.println("Array after left rotation :");
	for(int i=0;i<number.length;i++) {
	System.out.println(number[i]+" ");
	
	}
	
	} 

}
