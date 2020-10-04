/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */

package com.collections.CollectionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeMapImplTest {

	private TreeMap<Integer, String> students;

	@BeforeEach
	void setUp() {
		students = new TreeMap<Integer, String>();
		students.put(23, "John");
		students.put(24, "Jay");
		students.put(25, "Carol");
		students.put(26, "Kelvin");
		students.put(27, "Kenny");

	}
    //test to check TreeMap gets created.
	@Test
	void createTreeMapTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		assertFalse(treeMapImpl.createTreeMap().isEmpty());
	}

	@Test
	void getAllKeysTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		Set<Integer> keySet = treeMapImpl.getAllKeys(students);
		assertEquals(5, keySet.size());

	}
     
	@Test
	void deleteAllElementsTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		assertTrue(treeMapImpl.deleteAllElements(students).isEmpty());
	}
	
	//test first key from TreeMap
	@Test
	void getFirstKeyTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		assertEquals(23, treeMapImpl.getFirstKey(students));
	}
	
    //test last key from TreeMap
	@Test
	void getLastKeyTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		assertEquals(27, treeMapImpl.getLastKey(students));
	}
	
	// test to get a reverse order view of the keys contained in a given map.
	@Test
	void reverseOrderKeyViewTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		Set<Integer> sortedKeys = new HashSet<Integer>();
		sortedKeys.add(27);
		sortedKeys.add(26); 
		sortedKeys.add(25);
		sortedKeys.add(24);
		sortedKeys.add(23);
		assertTrue(sortedKeys.equals(treeMapImpl.reverseOrderKeyView(students)));
	}
	// test to sort keys in Tree Map by using comparator.
	@Test
	void sortKeysTest() {
		TreeMapImpl treeMapImpl = new TreeMapImpl();
		Set<Integer> sortedKeys = new HashSet<Integer>();
		sortedKeys.add(23);
		sortedKeys.add(24);
		sortedKeys.add(25);
		sortedKeys.add(26);
		sortedKeys.add(27);
		assertTrue(sortedKeys.equals(treeMapImpl.sortKeys(students)));
	}
}
