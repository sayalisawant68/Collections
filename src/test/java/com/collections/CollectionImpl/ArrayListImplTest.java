/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayListImplTest {

	private ArrayList<String> studentNames;

	@BeforeEach
	void setUp() {
		studentNames = new ArrayList<String>();
		studentNames.add("John");
		studentNames.add("Jay");
		studentNames.add("Carol");
		studentNames.add("Kelvin"); 
		studentNames.add("Kenny");
		}
	
	// test to insert an element into the array list at the first position.
	@Test
	void insertElementAtFirstTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		String name = "shiyang";
		ArrayList<String> dummyList = studentArrayList.insertElementAtFirst(studentNames, name);
		assertEquals(name, dummyList.get(0));
		}
	
	// test to retrieve an element (at a specified index) from a given array list.
	@Test
	void retriveElementTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		String name = studentArrayList.retriveElement(studentNames, 2);
		assertEquals("Carol", name);
		}
	
	// test to update specific array element by given element.
	@Test
	void updateElementTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.updateElement(studentNames, 3, "Lubo");
		assertEquals("Lubo", dummyList.get(3));
		assertNotEquals("Kelvin", dummyList.get(3));
		}
	
	//test to remove the third element from a array list.
	@Test
	void removeElementFromThirdPositionTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.removeElementFromThirdPosition(studentNames);
		assertNotEquals("kelvin", dummyList.get(3));
		assertEquals("Kenny", dummyList.get(3));
		}
	
	//test to search an element in a array list.
	@Test
	void searchElementTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		assertEquals(true, studentArrayList.searchElement(studentNames, "Carol"));
		assertNotEquals(true, studentArrayList.searchElement(studentNames, "Jerry"));
		}
	
	//test to sort a given array list.
    @Test
	void sortArrayListTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.sortArrayList(studentNames);
		assertEquals("Carol", dummyList.get(0));
		assertEquals("Jay", dummyList.get(1));
		assertEquals("John", dummyList.get(2));
		}
    
    // to test an array list is empty or not.
	@Test
	void emptyCheckTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		assertEquals(false, studentArrayList.emptyCheck(studentNames));
		assertNotEquals(true, studentArrayList.emptyCheck(studentNames));
		}
	
	// to empty an array list.
    @Test
	void emptyArrayListTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		assertTrue(studentArrayList.emptyArrayList(studentNames).isEmpty());
		}
    
    // test to clone an array list to another array list.
	@Test
	void cloneArrayListTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		assertArrayEquals(studentNames.toArray(), studentArrayList.cloneArrayList(studentNames).toArray());
		}
	
	// test to join two array lists.
	@Test
	void joinArrayListsTest() {
		ArrayList<String> studentSurnames = new ArrayList();
		studentSurnames.add("Farnandis");
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.joinArrayLists(studentNames, studentSurnames);
		assertEquals("Farnandis", dummyList.get(5));
		}
	
	//test to reverse elements in a array list.
	@Test
	void reverseArrayListTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.reverseArrayList(studentNames);
		assertEquals("Kenny", dummyList.get(0));
		assertEquals("Kelvin", dummyList.get(1));
		assertEquals("Carol", dummyList.get(2));
		assertEquals("Jay", dummyList.get(3));
		assertEquals("John", dummyList.get(4));
		}
	
	// test to copy one array list into another.
	@Test
	void copyArrayListTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.copyArrayList(studentNames);
		assertArrayEquals(studentNames.toArray(), dummyList.toArray());
		}

	@Test
	void createArrayListTest() {
		ArrayListImpl studentArrayList = new ArrayListImpl();
		ArrayList<String> dummyList = studentArrayList.createArrayList();
		assertArrayEquals(studentNames.toArray(), dummyList.toArray());
		}

}
