package collectionpractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Queue {

	public static void main(String[] args) {
		LinkedList queue=new LinkedList();
      
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("two");
		queue.add("one");
		queue.add("four");
		System.out.println("Size: " + queue.size());
		System.out.println("Eleements of Queue: " + queue);
	
	    
	}

}
