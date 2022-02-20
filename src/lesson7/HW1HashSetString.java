package lesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HW1HashSetString {
	public static void main(String[] args) {
		String[] arr1 = {"1","3","7","1","7","3","8","3","2","7"};
		String[] arr2 = {"3","1","7","4","8","1","7","4","3","7"};
		Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<String> set2 = new HashSet<>(Arrays.asList(arr2));
		System.out.println("objects of set1 are " + set1);
		System.out.println("objects of set2 are " + set2);
		/*-*/
		Set<String> set = new HashSet<>();
		set.addAll(set1);
		set.addAll(set2);
		System.out.println(" objects of union of set1 and set2 are " + set);
		
		//set1.retainAll(set2); // my solution
		//System.out.println(" objects of intersection of set1 and set2 are " + set1);
		//
		/*- yarsol */
		Set<String> set3 = new HashSet<>();
		Set<String> set4 = new HashSet<>();
		Set<String> set5 = new HashSet<>();
		
		set3.addAll(set1);
		System.out.println("objects of set3(set3.addAll(s1)) are " + set3);
		set3.addAll(set2);
		System.out.println("objects of set3(set3.addAll(s2)) are " + set3);
		set4.addAll(set1);
		System.out.println("objects of set4(set4.addAll(s1)) are " + set4);
		set4.removeAll(set2);
		System.out.println("objects of set4(set4.removeAll(s2)) are " + set4);
		set5.addAll(set2);
		System.out.println("objects of set5(set5.addAll(s2)) are " + set5);
		set5.removeAll(set1);
		System.out.println("objects of set5(set5.removeAll(s1)) are " + set5);
		Set<String> set6 = new HashSet<>(set3);
		System.out.println("objects of set6 are copy of s3 " + set6);
		set6.removeAll(set4);
		System.out.println("objects of set6(set6.removeAll(s4)) are " + set6);
		set6.removeAll(set5);
		System.out.println("objects of set6(set6.removeAll(s5)) are intersection of s1 and s2" + set6);
		
	}

}
