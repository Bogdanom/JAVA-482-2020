package lesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HW1HashSetInteger {
	
	 <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> result = new HashSet<>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
	}
	public static void main(String[] args) {
		
		Integer[] arr1 = {1,3,7,1,7,3,8,3,2,7};
		Integer[] arr2 = {3,1,7,4,8,1,7,4,3,7};
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
		System.out.println("objects of set1 are " + set1);
		System.out.println("objects of set2 are " + set2);
		HW1HashSetInteger hw = new HW1HashSetInteger();
		System.out.println("union of set1 and set2 are " + hw.union(set1, set2));
	
	}

}

