/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashMapImplTest {
	
	private HashMap<Integer,String> students;
	
	@BeforeEach
	void setUp() {
		students = new HashMap<Integer,String>();
		students.put(1, "John");
		students.put(2, "Jay"); 
		students.put(3, "Carol"); 
		students.put(4, "Kelvin"); 
		students.put(5, "Kenny"); 
		}
	//test to get the specified value with the specified key in a HashMap.
	@Test
	void getValueTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertEquals("Carol", hashMapImpl.getValue(students, 3));
	}
	//test to count the number of key-value (size) mappings in a map.
	@Test
	void getSizeTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertEquals(5, hashMapImpl.getSize(students));
	}
	//test to copy all of the mappings from the specified map to another map.
	@Test
	void createCopyTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertTrue(students.equals(hashMapImpl.createCopy(students)));
	}
	//test to remove all of the mappings from a map
	@Test
	void removeAllTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertTrue(hashMapImpl.removeAll(students).isEmpty());
	}
	//test if a map contains a mapping for the specified key.
	@Test
	void checkKeyMappingTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertTrue(hashMapImpl.checkKeyMapping(students, 4));
		assertFalse(hashMapImpl.checkKeyMapping(students, 7));
	}
	//test if a map contains a mapping for the specified value.
	@Test
	void checkValueMappingTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertTrue(hashMapImpl.checkValueMapping(students, "Kenny"));
		assertFalse(hashMapImpl.checkValueMapping(students, "Shiyang"));
	}
	//test to get the value of a specified key in a map.
	@Test
	void getValueForKey(){
		HashMapImpl hashMapImpl = new HashMapImpl();
		assertEquals("Kenny", hashMapImpl.getValueForKey(students, 5));
		assertEquals("ABC", hashMapImpl.getValueForKey(students, 8));
	}
	//test to get a set view of the keys contained in this map.
	@Test
	void getSetViewTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
		Set<Integer> keySet = new HashSet<Integer>();
		keySet.add(1);
		keySet.add(2);
		keySet.add(3);
		keySet.add(4);
		keySet.add(5);
		assertTrue(keySet.equals(hashMapImpl.getSetView(students)));
	}
	//test to get a collection view of the values contained in this map.
	@Test
	void getCollectionViewTest() {
		HashMapImpl hashMapImpl = new HashMapImpl();
        List<String> values = new ArrayList<String>();
		values.add("John");
		values.add("Jay");
		values.add("Carol");
		values.add("Kelvin");
		values.add("Kenny");
        assertArrayEquals(values.toArray(), hashMapImpl.getCollectionView(students).toArray()); 
	}
	

}
