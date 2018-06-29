package mapday;

import java.util.HashMap;
import java.util.Map;

public class CODINBATmapBully {

	public static void main(String[] args) {

		
		 Map<String, String> map= new HashMap<>();
		 
		 map.put("a", "candy");
		 map.put("b", "dirt");
		 
		 System.out.println("Items in Map: "+map);
		 
		 System.out.println("-----------------------------");
		
			  if (map.containsKey("a")){
			    map.put("b", map.get("a"));  // this code is assigning the value of a to key b
			    map.put("a", "");  // this code is assigning the value of a to NULL
			  } 
			  System.out.println(map);
			}
	}


