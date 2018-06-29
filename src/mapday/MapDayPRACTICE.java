package mapday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapDayPRACTICE {

	public static void main(String[] args) {

		List<String> ListNames = new ArrayList<>();
		// List REPEATS the same items when it is printing

		ListNames.add("haydar");
		ListNames.add("sinan");
		ListNames.add("jack");
		ListNames.add("liliana");
		ListNames.add("thomas");
		ListNames.add("sinan");
		ListNames.add("mario");
		ListNames.add("stephenia");

		System.out.println("Names in the 'List' are :" + ListNames);

		// Set<String> SetNames = new HashSet<>(); OR
		Set<String> SetNames = new HashSet<>(ListNames);
		// Set DOES NOT repeat the same items when it is printing

		for (String NewSetNames : ListNames) {
			SetNames.add(NewSetNames);
		}
		System.out.println("Names in the 'Set' are :" + SetNames);

	
		SortedSet<String> sortedSet = new TreeSet<>(SetNames);
		System.out.println("Sorted names in the SortedSet are :"+ SetNames); 
		// [sinan, haydar, mario, liliana, thomas, jack, stephenia]
		
		System.out.println("names between jack (included) and mario (not icluded) are -->>  "+sortedSet.subSet("jack", "mario"));
		// [mario, liliana]
		
		System.out.println("Names after liliana (included)  are :"+sortedSet.tailSet("liliana"));
		// [liliana, mario, sinan, stephenia, thomas]
		
		System.out.println("Names before liliana (not included)  are :"+sortedSet.headSet("liliana"));
		// [haydar, jack]
		
		SortedSet<String> newTail = sortedSet.tailSet("mario");
		System.out.println("Names after mario (included) in newTail are: "+newTail);
		//[mario, sinan, stephenia, thomas]
		
		System.out.println("Checking if stephenia is in the list or not. "
				+ "If so, it will retun 'true' and remove stephenia from the list :"+newTail.remove("stephenia"));
	
	    System.out.println(sortedSet);  // stephenia was removed because of previous Sysout.
	    // [haydar, jack, liliana, mario, sinan, thomas]
	    
	    System.out.println("Names after jack(included) are :"+sortedSet.tailSet("jack"));
	}
	   
		

}
