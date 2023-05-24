package collectionpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateElement {

	public static <T> void main(String[] args) {
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
  
        Map<String, Long> resultMap = new HashMap<>();
        for (String element : ArrList) {
            if (resultMap.containsKey(element)) {
                resultMap.put(element, resultMap.get(element) + 1L);
            } else {
                resultMap.put(element, 1L);
            }
        }
	
	
        System.out.println("Element Count : " + resultMap);
	
	
	}

}
