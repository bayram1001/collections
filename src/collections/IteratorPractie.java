package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorPractie {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) {

		
		 List<Integer> items= new ArrayList<>();  
		    
		   // System.out.println(items.isEmpty() );
		    	items.add(10);
		        items.add(23);
		        items.add(344);
		        items.add(475);
		        items.add(36);
              
		        //		ITERATOR is the safest way to remove element from collection        
		        Iterator<Integer> iter = items.iterator();
		        System.out.println("iterRRRRRR "+iter);
		        while (iter.hasNext()) {
		        	int a =iter.next();
		        	
		        	//System.out.println(iter.next());
		        	if (a>100)
		        System.out.print(a+" ");
		        		//iter.remove();
		        	System.out.println(iter.hasNext()+" checkKKKKKKK");   	
		        }
		        System.out.println(iter.hasNext()+" checkKKKKKKK");
		        System.out.println();		       
		        System.out.println(items);
		        
//		        for (int i = 0; i < items.size(); i++) {
//		        	
//					if (items.get(i)>100) {
//						items.remove(items.get(i));
//					}
//				}
//		        
//		        System.out.println("items less than 100 : "+items);
	
		        
		        // YOU CAN NOT REMOVE ITEMS FROM COLLECTION WHILE ITERATING OVER USING FOR EAC LO
//		        for(Integer item: items) {
//		        	if (item>100) {
//		        		items.remove(item);
//		        	}
//		        }
//		      System.out.println(items);    ///---> each loop does not remove an item from collection
		        
		 //       System.out.println(iter.hasNext()+" HASnext");// checks if there is next items or not
//		        System.out.println(iter.next()); // it will give us the first element
//		        System.out.println(iter.next());// then it will give us the next element
//		       
//		        iter.remove();
//		        System.out.println(items);
		        
		   //     System.out.println(iter.next());
//		        System.out.println(iter.next());
//		        System.out.println(iter.next());
	
	}

}
