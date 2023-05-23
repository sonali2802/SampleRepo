package array;


import java.lang.reflect.Array;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
public class ArrayExample15 {

	public static void main(String[] args) {
		//defining an array of integer type
		Integer[]array={90,23,5,109,12,22,67,34};
	//invoke sort()method of the Array class
	    Arrays.sort(array,Collections.reverseOrder());
	System.out.println("Elements of array sorted in assending order using inbuilt method");
	  //print array using the for loop
	
	for(int i=0;i<array.length;i++) {
	   
	System.out.println(array[i]);	
		
	}
	
	}
}
		
