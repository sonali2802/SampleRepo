package collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;

public class UniquValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ArrList = new ArrayList<String>();
        
        // add values in ArrayList
        ArrList.add("a");
        ArrList.add("d");
        ArrList.add("c");
        ArrList.add("d");
        ArrList.add("b");
        ArrList.add("e");
        ArrList.add("a");
        ArrList.add("b");
	
     // display original ArrayList
        System.out.println("Original ArrayList is : " + ArrList);

        // convert ArrayList to HastSet.
        HashSet<String> hset = new HashSet<String>(ArrList);
  
        // display HastSet
        System.out.println("ArrayList Unique Values is : "
                           + hset);
        
	}

}
