package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListImplementation {

  public static void main(String[] args) {
    
    // create an ArrrayList 
    // add 5 items 
    // remove 2 itmes 
    // iterate over all of them 
    
    //WedDriver driver = new ChromeDriver() ; 
    
    //List<Integer> items= new ArrayList<Integer>();  
    
    Collection<Integer> items= new ArrayList<>();  
    
    System.out.println("isEmpty :"+items.isEmpty()); 
    items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        System.out.println("items :"+items);
        
       List<Integer> ls1 = Arrays.asList(66,44,32,33) ; 
       System.out.println("ls1 :"+ls1);
        
        items.addAll(ls1) ; 
        System.out.println(  items ); // LIST INterface has overridden method to print
        items.removeAll(ls1) ; 
        System.out.println(  items );
        
        List<Integer> ls2 = Arrays.asList(1,33,34) ;  // Will generate a unmodifiable list
        System.out.println("ls2 "+ls2);
        items.retainAll(ls2);
        System.out.println(items);
        
        /// Create 2 list of String with Reference Type Collection
        /// merge 2 lists 
        /// create 3rd list and remove all the items in merged lst if 3rd lst have them
        /// creare 4th list and retain whatever is common
      
        
        
//        items.remove(1);
//        items.remove(1);
//        
//        items.remove( new Integer(1) ) ; 
        
//        System.out.println(items);    
//        
//         for (int i = 0; i < items.size(); i++) {
//      System.out.println("");
//     }
         
         
    

  }

}