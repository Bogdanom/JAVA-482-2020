package lesson7;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HW2HashMapAppl {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Petrenko", "Andrij");
		map.put("Ivanenko", "Ganna");
		map.put("Shevchenko", "Petro");
		map.put("Andrienko", "Irina");
		map.put("Bohdan", "Oleh");
		map.put("Kovtun", "Maxim");
		map.put("Maximenko", "Olena");
		map.put("Gordienko", "Orest");
		map.put("Tkachenko", "Andrij");
		map.put("Kuchuk", "Alla");

//		Collection<String> names = new HashSet<String>(map.values());
//		System.out.println(names);
//		names = (Set<String>) map.values();
//		System.out.println(map.size() == names.size());
		System.out.println("Original map");
		for (Iterator<Entry<String, String>> i = map.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			System.out.println("Last name = " + entry.getKey() + "   First name = " + entry.getValue());
		}
		for (Iterator<Map.Entry<String, String>> i = map.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			if (entry.getValue().equals("Orest")) {
				i.remove();
			}
		}
		System.out.println("Processed map");
		for (Iterator<Entry<String, String>> i = map.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			System.out.println("Last name = " + entry.getKey() + "    First name = " + entry.getValue());
		}
	}

}
