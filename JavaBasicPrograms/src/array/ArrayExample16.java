package array;

import java.util.Arrays;

public class ArrayExample16 {
	
	
	public static void main(String[] args) {
		int[]array=new int[] {90,23,5,109,12,22,67,34};
		for(int i=0;i<array.length;i++) {
			   
			System.out.println(array[i]);	
				
			}
		//invoke sort()method of the Array class
		    Arrays.sort(array);

		
		System.out.println("thrid largest number in array: "+ array[array.length-3]);

	}

}
