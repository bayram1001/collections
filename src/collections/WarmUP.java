package collections;

import java.util.Arrays;

public class WarmUP {
	
	  public static int[] addElement( int[] originalArr, int newItem) {
			
			int[] newArr = new int[originalArr.length+1];
			
			for (int i = 0; i < originalArr.length; i++) {
				
				newArr[i] = originalArr[i];
				
			}
			
			newArr[newArr.length -1] = newItem;
			return newArr;
			   
		  }
	  
	  public static void main(String[] args) {
		
		  
		  int [] myArr = {1,2,3,4,5};
		 myArr =  addElement(myArr,100);
		  
		  System.out.println(Arrays.toString(myArr));
		  
	}
	// Create an array of Integer 
	// add 5 Items 

	// call your AddElement method and add 2 more items 
	// print out all the elements to the console 


	/*
	 * Create a method called AddElement , 
	 *  take 2 parameters  
	 *    first : Integer array object 
	 *    second : Integer
	 *    
	 *    Logic 
	 *    return new Array with the new element added 
	 * 
	 */
	

	 

}
