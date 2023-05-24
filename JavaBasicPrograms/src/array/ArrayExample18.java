package array;

public class ArrayExample18 {

	public static void main(String[] args) {
		int []number= {3,9,5,6,4,7,8,4,3,8};
		System.out.println("Original Value");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		int max =number[0];
	 for(int i=1;i<number.length;i++) {
	    if(max<number[i]) {
	   max = number[i];
	    }
	 }
	System.out.println("largest number in array is: "+max);
	
	}

}
