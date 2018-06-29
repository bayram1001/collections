package mapday;

import java.util.*;

public class MapPractice {

  public static void main(String[] args) {
	  

    
    /*
     * storing single values : 
     *    [soccer, basketball, pingpong]
     * 
     * storing key-value pair
     *    [ {1: soccer}, {2: basketbal}]
     * */
    
     //HashMap<Integer,String> myMap = new HashMap<>();
     Map<Integer,String> map = new HashMap<>();
     
     // adding items to a map
     map.put(1, "soccer");
     map.put(2, "basketball");
     map.put(3, "pingpong");
     
     System.out.println("Mapping the items : "+map);
    // Mapping the items : {1=soccer, 2=basketbal, 3=pingpong}
    
    //// getting items by key 
     System.out.println( "Element 2 is : "+map.get(2)); // Element 2 is : basketball
     System.out.println("Element 17 is : "+ map.get(17) ); // null because we do not have it
     
    /// checking a key exists in a map 
    
     System.out.println("Checking if Element 17 is in the map : "+ map.containsKey(17) ); // returns FALSE because Element 17 is not in the map
     
    /// checking a value exists in a map 
     System.out.println("Checking MAP has an element of pingpong : "+ map.containsValue("pingpong") );
     // // returns true because pingpong is in our map
        
    
     /// counting the items in a map object
     System.out.println(  "counting map items : " + map.size()  );
    
     //  checking is empty or not 
     System.out.println("checking if map is empty or not :"+map.isEmpty());
     
     /// remove items
     System.out.println( "removing the element 1 : "+map.remove(1) );
   
     System.out.println( "REMOVING elemn"+map.remove(2, "basketbala"));
     // returns false because element 2 is basketball not basketbala
     
     System.out.println("Removing an element that is not in the map :"+map.remove(1278362) ); // nul
     
     /// replace a map value using key 
     System.out.println("replacing a map value using key "+map.replace(3, "golf"));
     // originall 3 was mapping with pingpong BUT now  {2=basketball, 3=golf, 4=watermelon}
     
     /// replace a map value using both key and value 
    System.out.println( "replacing a map value using both key and value :"+map.replace(2, "basketball","volleyball"));
    // returns true. Because 2 was basketball and we can change it to volleyball
     
     System.out.println("Element and its value. Origianlly they are not in the map: "+map.replace(17,"abc"));
     // returns null
     
     /// get an item and if the key does not exists return default value
     String def = map.getOrDefault(17, "Baseball") ; 
     System.out.println("def :"+def);  // def :Baseball  ---> Neither 17 or Baseball in the map. So it gets the default which is Baseball
     
     String def2 = map.getOrDefault(3, "Baseball444") ; 
     System.out.println("def2 :"+def2); 
     //def2 :golf. Since 3 was in the map, it is getting the 3's value from line 56. 
     //At the beginning 3 was mapping with pingpong but we replaced it at line 56
     
    
    ////  adding an item while checking the key exists or not
    if(!map.containsKey(3))
      map.put(3,"something else") ; 
    
    map.putIfAbsent(4, "watermelon");
    
    System.out.println("putIfAbsent  "+map); // putIfAbsent  {2=volleyball, 3=golf, 4=watermelon}
    // If there was not key 3, then code were going to put 3 and map it with "something else"
    // since there was key 3 we used map.putIfAbsent(4, "watermelon");. 
    // Since key 4 was absent, our code added key 4 and its value -watermelon- to our map
    
    ////  adding an item while checking the key exists or not
    if(!map.containsKey(3))
      map.put(3,"something else") ; 
    
    map.putIfAbsent(2, "watermelon");
    
    System.out.println("LAST  "+map);// LAST  {2=volleyball, 3=golf, 4=watermelon}
    // there was key 3, so code were not able to put "something else" instead of 3's value
    // key 2 was not absent that is why watermelon was not added.
    
    

  }

}
// Create a map of Double as key , String as Value
// add few items  including duplicate key 
// print out and see what you get 

//
//Map<Double,String> map1 = new HashMap<>();
//  map1.put(1.5, "ab");
//  map1.put(2.5, "cd");
//  map1.put(3.5, "ef");
//  map1.put(4.5, "hg");
//  map1.put(4.5, "duplicate");
// 