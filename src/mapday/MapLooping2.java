package mapday;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLooping2 {

  public static void main(String[] args) {

    Map<String, String> jobMap = new HashMap<>();

    jobMap.put("SDET", "Vienna");
    jobMap.put("MannualTester", "Fairfax");
    jobMap.put("DBA", "Herndon");
    jobMap.put("ScrumMaster", "Reston");
    jobMap.put("ProductOwner", "Fairfax");
    jobMap.put("ScrumMaster", "DC");
    System.out.println("jobMap :"+jobMap);
    Set<Entry<String, String>> entries = jobMap.entrySet();

    System.out.println("---------------------------------------------");
    System.out.println( "Printing each Key and each Value: ");
    for (Entry<String, String> each : entries) {
      
      System.out.print("Key: "+each.getKey() + " and " );
      System.out.println("Value: "+each.getValue()  );
      
      if(each.getKey().equals("ProductOwner"))
            each.setValue("Tyson");
      
    }
    System.out.println("---------------------------------------------");
    System.out.println("Setting the key value to Tysen if the value is ProductOwner :");
    System.out.println(jobMap);

  }

}