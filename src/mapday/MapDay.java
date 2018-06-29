package mapday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapDay {

	public static void main(String[] args) {

		/*
		 * Create a list of prices (Long) 
		 * with few duplicate elements 
		 * 
		 * Task 1.1
		 * Generate only unique prices by taking out duplicate
		 * 1,2,3,3,22,1, ---- > 1,2,3,22
		 * 
		 * Task 1.2 
		 * Generate ordered collection out of the list 
		 * 1,4,3,2,22,100, ---- > 1,2,3,4,22,100
		 * 
		 * Task 1.3 
		 * retrieve the items from 5 - 9 
		 * assuming you have 5 and 9 in the list 
		 *  1,2,5,8,6,9, 22,100 ---> 5,6,8,9
		 *  
		 *  
		 *  1, ArrayList
		 *  2, Use one of the collection type to remove duplicate
		 *  3, use one of the collection type to sort it
		 *  4, use one of the collection method to get part of it
		 *  
		 * 
		 * */

		List<Long> longList = new ArrayList<>();
		
	   longList.add(102L);
	   longList.add(10087L);
	   longList.add(103L);
	   longList.add(10098L);
	   longList.add(104L);
	   longList.add(10018L);
	   longList.add(105L);
	   longList.add(100L);
	   
		System.out.println("Items are in the  longList --->: "+longList);
		//Set<Long> longSet = new HashSet<>(longList); OR
		  Set<Long> longSet = new HashSet<>();
		   for (Long each: longList) {
			   longSet.add(each);
		   }
		   
		   System.out.println("Items in longSet are: "+longSet);
		   
		   SortedSet<Long> sSet = new TreeSet<>(longSet);
		   System.out.println("Items are in sSet<sortedSet> : "+sSet);
		   
		   System.out.println("items between 102 (included) and 105 (not icluded) are -->>  "+sSet.subSet(102L, 105L)); // [102, 103, 104]
		   System.out.println("items after 104 (included)  are -->>  "+sSet.tailSet(104L)); // [104, 105, 10018, 10087, 10098]
		   System.out.println("items before 103 are -->>  "+sSet.headSet(103L)); // [100, 102]
		
		   
		   SortedSet<Long> tail = sSet.tailSet(104L);
		   System.out.println("sSet.tailSet(104L)----->>> "+sSet.tailSet(104L)); // [104, 105, 10018, 10087, 10098]
		   
		   System.out.println( " tail.remove(105L)---->> "+tail.remove(105L)); // return true 
		   // it is checking if 105 is in the "tail" set or not. If so, it returns true and removes 105 from the "tail" set
		   
		   System.out.println("sSet.tailSet(104L)----->>> "+sSet.tailSet(104L));
		   // previous sysout removed 105 from the list. So the new list is [104, 10018, 10087, 10098]
		 
		   
	}

}
