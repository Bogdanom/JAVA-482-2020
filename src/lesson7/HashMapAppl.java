package lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAppl {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("key1", "one");
		map.put("key2", "two");
		
		System.out.println("one way Map print");
		System.out.println("Map : " + map);
		
		System.out.println("second way Map print");
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println("key = "+entry.getKey() + " value = " + entry.getValue());
		}
		System.out.println("third way Map print");
		for (Iterator<Entry<String, String>> i = map.entrySet().iterator(); i.hasNext();){
	  //for (Iterator i = map.entrySet().iterator(); i.hasNext();){ //this way work too
			   Map.Entry<String, String> entry = i.next();
			 //Map.Entry entry = (Map.Entry) i.next(); //this way work too
			   System.out.println("key = "+entry.getKey() + " value =  " + entry.getValue());
			}

	}

}
