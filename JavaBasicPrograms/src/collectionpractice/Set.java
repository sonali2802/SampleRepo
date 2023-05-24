package collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set {

	public static void main(String[] args) {

	List<String>list=new ArrayList<String>(); 
	
		list.add("Selenium");
		list.add("Testing");
		list.add("Java");
		list.add("Selenium");

		System.out.println("This is the value from the list:"+list);

  	HashSet<String> set=new HashSet<String>(list) ;
    
    System.out.println("This is the value from the set:"+set);

	
		
		
		
		
		
		
		
		
		
	}

}
