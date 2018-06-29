package mapday;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoggingMap {

	public static void main(String[] args) {
		  Map<String,String> jobMap = new HashMap<>();
		    
		    jobMap.put("SDET", "Vienna");
		    jobMap.put("MannualTester", "Fairfax");    
		    jobMap.put("DBA", "Herndon");
		    jobMap.put("ScrumMaster", "Reston");
		    jobMap.put("ProductOwner", "Fairfax");
		    jobMap.put("ScrumMaster", "DC");
		    
		    System.out.println("Jobs and cities are: "+jobMap);
		    
		    Set<String> keys = jobMap.keySet();  // Set DOES NOT REPEAT the same items. Set does not sort either
		    System.out.println("Jobs in Set :"+keys); //Jobs in Set :[ProductOwner, DBA, ScrumMaster, SDET, MannualTester]
		    
		    System.out.println("-------------------------------------------");
		    
		    Iterator<String> it = keys.iterator();
		    System.out.println("Printing with iterator:");
		    while (it.hasNext()) {
			System.out.println(it.next() + "  ");
			}
		    System.out.println("--------------------------------------------");
		    keys.remove("ProductOwner");
		    System.out.println("Removing the ProductOwner from list in Map: "+jobMap);
		    
		    System.out.println("--------------------------------------------");
		    
		    Collection<String> allValues = jobMap.values(); 
		    Iterator<String> it2 = allValues.iterator();
		    System.out.println("Corresponding values for jobs: ");
		    while(it2.hasNext()) {
		    	System.out.println(it2.next()+"    "); // Herndon  DC Vienna Fairfox  

		    }
		    System.out.println("--------------------------------------------");
		    
		    allValues.remove("Fairfax");
		    System.out.println("Removing Fairfax from the values list :"+jobMap);
		
	
		
	
	}

}