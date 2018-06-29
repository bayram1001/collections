package collections;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtility {

  public static void main(String[] args) {
    
    /// Collections is a class from java.util package for common operation
    //  Collection is an interface which define common behavior 
    //  Map does not extend Collection interface because it's  key value pair 
    //  Java collection framework included All Collection interface sub classes and Map interface
    
    ArrayList<Integer> arr = new ArrayList<>(); 
    arr.add(2);
    arr.add(1);
    arr.add(3);
    arr.add(3);
    arr.add(3);
    arr.add(4);
    arr.add(-5);
    arr.add(6);
    arr.add(-1);

    //Collections.fill(arr, 5); ---> it makes them all 5
   // System.out.println(arr); all of them 5
    
    Collections.sort(arr);  // it is a class
    //System.out.println(arr);  ---> sorting them
    
    //Collections.shuffle(arr);  ----> mixing them 
   // System.out.println(); ---> mixing them
    
    
    int a = Collections.binarySearch(arr, 5) ; 
    System.out.println(a+" binary search");
    
    int freq = Collections.frequency(arr, 3 ) ; 
    System.out.println("We have this number "+freq+ " times.");
    //System.out.println(a);
    System.out.println(arr);
    
    
    
    

  }

}