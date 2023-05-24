package collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;

public class SortedOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count=0;
		Integer count1=0;
ArrayList<Integer> ArrList = new ArrayList<Integer>();
        
        // add values in ArrayList
        ArrList.add(4);
        ArrList.add(3);
        ArrList.add(5);
        ArrList.add(1);
     // display original ArrayList
        System.out.println("Original ArrayList is : " + ArrList);
        for (int i = 1; i < ArrList.size(); i++)
        { 
            // Unsorted pair found
            if (ArrList.get(i - 1) > ArrList.get(i))
            {
            	count+=1;
            	break;
            }
            }
        
        for (int i = ArrList.size(); i < 1; i++)
        { 
            // Unsorted pair found
            if (ArrList.get(i-1) > ArrList.get(i))
            {
            	
            	count1+=1;
            	break;
            }
            }
        if(count==1 && count1==1)
        System.out.println("Not Sorted");
        else
        System.out.println("Sorted");
        }
        
	}

