package mapday;

import java.util.HashMap;
import java.util.Map;

public class CODINGBATmapAB {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		//mapAB({"a": "Hi", "b": "There"}
		map.put("a", "Hi");
		map.put("b", "There");
		
		
		if ((map.containsKey("a")) && (map.containsKey("b"))){
		      map.put("ab", map.get("a") + map.get("b"));
	}
	System.out.println(map);
}
			
	}


