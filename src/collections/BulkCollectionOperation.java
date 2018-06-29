package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BulkCollectionOperation {
	
	public static void main(String[] args) {
		
		// Create 2 list of String with Reference Type Collection
        /// merge 2 lists 
        /// create 3rd list and remove all the items in merged lst if 3rd lst have them
        /// creare 4th list and retain whatever is common
		
		  Collection<String> ls = new ArrayList<>();
		     ls.add("Hello");
		     ls.add("Bye");
		   System.out.println("Elements in ls :"+ls);  
		     
	       ArrayList<String> ls1 = new ArrayList<>();
	      ls1.add("heyheloo");
	       ls.addAll(ls1);
	       System.out.println("Elements in ls :"+ls);
	       
	       ls.removeAll(ls1);
	       System.out.println(ls);
	       
	       List<String> ls2 = Arrays.asList("aaa","Hello","bbb");
	       System.out.println(ls);
	       ls.retainAll(ls2);
	        System.out.println(ls);
	}

}
