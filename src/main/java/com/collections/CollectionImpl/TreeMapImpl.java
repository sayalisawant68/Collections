/*
  Author:    Sayali Sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	/*
	 * create a TreeMap of <studentId(Integer), studentName(String)>. Add some
	 * student reocrds with random student ids.
	 */
	public TreeMap<Integer, String> createTreeMap() {
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(23, "John");
		students.put(24, "Jay");
		students.put(25, "Carol");
		students.put(26, "Kelvin"); 
		students.put(27, "Kenny");
		return students;
	} 

	// get all keys from the given a Tree Map.
	public Set<Integer> getAllKeys(TreeMap<Integer, String> students) {
		return students.keySet();

	}

	// delete all elements from a given Tree Map.
	public TreeMap<Integer, String> deleteAllElements(TreeMap<Integer, String> students) {
		students.clear();
		return students;

	}

	// sort keys in Tree Map by using comparator.
	public Set<Integer> sortKeys(TreeMap<Integer, String> students) {
		TreeMap<Integer, String> dummyMap = new TreeMap<Integer, String>(new sort_key());
		dummyMap.putAll(students);
		return dummyMap.keySet();
	}

	// get the first (lowest) key and the last (highest) key currently in a map.
	public int getFirstKey(TreeMap<Integer, String> students) {
		return students.firstKey();
	}

	public int getLastKey(TreeMap<Integer, String> students) {
		return students.lastKey();
	}

	// get a reverse order view of the keys contained in a given map.
	public Set<Integer> reverseOrderKeyView(TreeMap<Integer, String> students) {
		Set<Integer> keySet = new HashSet<Integer>(students.descendingKeySet());
		return keySet;
	}
}

class sort_key implements Comparator<Integer> {
	@Override
	public int compare(Integer key1, Integer key2) {
		return key1.compareTo(key2);
	}
}
