package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetPractice {
	
	public static void main(String[] args) {
	
		
		
		Set<Integer> numSets = new HashSet<>();  // it can not order the list, and it does not use the same item
		// //OR   HasSet<Integer>numSets2 = new HashSet<>();
		numSets.add(123);
		numSets.add(121);
		numSets.add(12);
		numSets.add(123);
		numSets.add(124);
		System.out.println(numSets +" NumSets nubsrssdafafad");   //:((((
	
		
		for (Integer each : numSets) {   // We can not use FOR LOOP because there is no index
			//System.out.println(each);
	
      }		
		
		Iterator <Integer>setIter = numSets.iterator();
		// TASK: iterate over the set
		// remove an item with certain condition
		while (setIter.hasNext()) {
		
			int i = setIter.next();
			
			if (i>100){
				setIter.remove();
				System.out.println("Deleted "+i);
			}
		}
		
//	    System.out.println(setIter.hasNext());
//		System.out.println(numSets);
		
		Iterator<Integer> setIt2 = numSets.iterator();
		while (setIt2.hasNext()) {
			System.out.println("Round 2 "+setIt2.next());
		}

		
		
		
		// numSets.get(0); indexing does not work to reach an element
		
		// Set does not add the same items	more than once
				
		
	}
	
	
	
	

}
