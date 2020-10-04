/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

public class HashSetImplTest {
	private HashSet<String> studentNames;

	@BeforeEach
	void setUp() {
		studentNames = new HashSet<String>();
		studentNames.add("John");
		studentNames.add("Jay");
		studentNames.add("Carol");
		studentNames.add("Kelvin");
		studentNames.add("Kenny");

	}

	@AfterEach
	void tearDown() {
		studentNames.clear();
	}

	// test to append the specified element to the end of a hash set.
	@Test
	void addElementTest() {
		HashSetImpl hashSetImpl = new HashSetImpl();
		String name = "Shiyang";
		HashSet<String> newSet = hashSetImpl.addElement(studentNames, name);
		assertTrue(newSet.contains("Shiyang"));
	}

	// test to get the number of elements in a hash set.
	@Test
	void getSizeTest() {
		HashSetImpl hashSetImpl = new HashSetImpl();
		int size = hashSetImpl.getSize(studentNames);
		assertEquals(5, size);
	}

	// test to empty an hash set.
	@Test
	void clearSetTest() {
		HashSetImpl hashSetImpl = new HashSetImpl();
		HashSet<String> newSet = hashSetImpl.clearSet(studentNames);
		assertTrue(newSet.isEmpty());
	}

	// test to convert a hash set to an array.
	@Test
	void SetToArrayTest() {
		HashSetImpl hashSetImpl = new HashSetImpl();
		Object[] arr = hashSetImpl.SetToArray(studentNames);
		assertArrayEquals(studentNames.toArray(), arr);
	}

	// test to compare two hash set.
	@Test
	void compareHashSetTest() {
		HashSetImpl hashSetImpl = new HashSetImpl();
		HashSet<String> dummySet = new HashSet<String>();
		assertFalse(hashSetImpl.compareHashSet(studentNames, dummySet));

	}

	// test to compare two sets and retain elements which are same on both sets.
	@Test
	void getEqualElementsTest() {
		HashSetImpl hashSetImpl = new HashSetImpl();
		HashSet<String> newSet = new HashSet<String>();
		newSet.add("John");
		newSet.add("Jay");
		HashSet<String> commanSet = hashSetImpl.getEqualElements(studentNames, newSet);
		assertEquals(2, commanSet.size());
		assertTrue(commanSet.contains("John"));
		assertTrue(commanSet.contains("Jay"));

	}
}
