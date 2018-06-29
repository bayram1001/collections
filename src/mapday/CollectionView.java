package mapday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionView {
	
public static void main(String[] args) {
	
	
	
	
	List <Long> prices = new ArrayList<>(); 
	
	prices.add(1088L);
	prices.add(100L);
	prices.add(102L);
	prices.add(100L);
	prices.add(103L);
	prices.add(103L);
	prices.add(104L);
	prices.add(105L);
	prices.add(100L);
	
	System.out.println("Prices are: "+prices);
	
	ArrayList<Long>abc = new ArrayList<>();
	
	abc.addAll(prices);
	Collections.sort(abc);
	System.out.println("Sorted prices :"+abc);
	
	
	Set<Long> longSET = new HashSet<>(prices);
	
	for(Long each : longSET) {
		longSET.add(each);
	}
	System.out.println("Prices are in the Set :"+longSET);  // Set DOES NOT repeat the same items
	// Prices are: [1088, 100, 102, 100, 103, 103, 104, 105, 100]
	
	SortedSet<Long> sSET = new TreeSet<>(longSET);
	
	System.out.println("SortedSet :"+sSET);
	// Sorted prices :[100, 100, 100, 102, 103, 103, 104, 105, 1088]
	
	System.out.println("NUmbers between 102(included) and 105 (not included) "+sSET.subSet(102L, 105L));
	// NUmbers between 102(included) and 105 (not included) [102, 103, 104]
			 
     System.out.println("NUmbers after 104(included) are :"+sSET.tailSet(104L));
     // NUmbers after 104(included) are :[104, 105, 1088]
     
	System.out.println("NUmbers before 103 (not included) are :"+sSET.headSet(103L));
	// NUmbers before 103 (not included) are :[100, 102]
	
	
	SortedSet<Long> tail = sSET.tailSet(104L);
	System.out.println("Sorted numbers after 104 (included) "+tail);
	//Sorted numbers after 104 (included) [104, 105, 1088]
	
	System.out.println("Checking if 105 is in the list. If so returns true and removes 105 from the list  :"+tail.remove(105L)); // true
	System.out.println("New list after 105 was removed by tail.remove(105L)  :"+tail);
	
	System.out.println("sSet List after eveything :"+sSET);
	
}

}
