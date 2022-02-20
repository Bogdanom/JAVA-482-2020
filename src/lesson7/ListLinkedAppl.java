package lesson7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListLinkedAppl {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("11");
		list.add("15");
		list.add("18");
		System.out.println("first array");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i = " + i + " Element of list = " + list.get(i));
		}
		
		list.add(0,"20");
		list.add(1,"13");
		System.out.println("second array");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i = " + i + " Element of list = " + list.get(i));
		}
			
//		String str = list.get(2) + list.get(3);
//		System.out.println(str);
		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			System.out.print(element+" ");
//		}
		/*-
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			if(element.equals("18")) {
				iterator.remove();
			} else {
			System.out.print(element+" ");
			}
		}
		System.out.println("\nlist = " + list);
		*/
	}

}
