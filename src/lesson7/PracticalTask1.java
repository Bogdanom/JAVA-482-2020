package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PracticalTask1 {

	public static void main(String[] args) {
		
		Integer[] arr = { 11, 21, 13, 14, 51, 61, 17, 18, 19, new Integer(91) };
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Original list is "+list);
		
		List<Integer> list2 = new ArrayList<>();
		for (int i = 5; i < list.size(); i++) {
			list2.add(list.get(i));
		}
		System.out.println("New list2 is "+list2);
		
		List<Integer> list3 = new ArrayList<>(list);
		System.out.println("Original list3 is "+list3);
		Iterator<Integer> iterator = list3.iterator();
		while(iterator.hasNext()) {
			Integer element = iterator.next();
			if(element>20) {
				iterator.remove();
			} 
		}
		System.out.println("Updated list3 is "+list3);
	}

}