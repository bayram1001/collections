package warmup;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		
		SortedSet<Integer> sSET = new TreeSet<>();
		
		sSET.add(123);
		sSET.add(1212);
		sSET.add(12);
		sSET.add(1233);
		sSET.add(124);
		
//		System.out.println(sSET);
//		System.out.println(sSET.first()+" First");
//		System.out.println(sSET.last()+" LAST");
//		
//		System.out.println(sSET.tailSet(125));
//		System.out.println(sSET.subSet(122,125));
//		System.out.println(sSET.headSet(124));
		
		System.out.println(sSET);// sorting the numbers
		System.out.println("first = " + sSET.first());
		System.out.println("last = " + sSET.last());
		
		System.out.println("tail set = " + sSET.tailSet(125));
		System.out.println("tail set = " + sSET.tailSet(125)); // NUMBERS AFTER THIS NUMBERS
		
		System.out.println("sub set = " + sSET.subSet(122, 125));//IT TAKES THE NUMBERS BETWEEN 122(included) AND 125
		
		System.out.println("head set = " + sSET.headSet(1243)); // WHICH NUMBERS ARE LESS THAN THIS NUMBER


//		sSET.add(123);
//		sSET.add(1212);
//		sSET.add(12);
//		sSET.add(1233);
//		sSET.add(124);
//		//12-123-124-1212-1233
//		
//		System.out.println(sSET);//[12, 123, 124, 1212, 1233]
//		System.out.println(sSET.first());//12
//		System.out.println(sSET.last());//1233
//		
//		System.out.println(sSET.tailSet(120));//[123, 124, 1212, 1233]
//		System.out.println(sSET.subSet(123,125));//[123, 124]
//		System.out.println(sSET.headSet(124));//[12, 123]


		
		
		
		
		
		
		
	}

}