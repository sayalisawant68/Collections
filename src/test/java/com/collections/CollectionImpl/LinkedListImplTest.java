/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
public class LinkedListImplTest {
	private LinkedList<String> studentNames;

	@BeforeEach
	void setUp() {
		studentNames = new LinkedList<String>();
		studentNames.add("John");
		studentNames.add("Jay");
		studentNames.add("Carol");
		studentNames.add("Kelvin");
		studentNames.add("Kenny"); 
		}
	
	@Test
	void appendAtLastTest() {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		LinkedList<String> dummyList = linkedListImpl.appendAtLast(studentNames, "Shiyang");
		assertEquals("Shiyang", dummyList.getLast());
	}
	@Test
	void clearLinkedListTest() {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertTrue(linkedListImpl.clearLinkedList(studentNames).isEmpty());
	}
	@Test
	void existCheckTest() {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertEquals(true,linkedListImpl.existCheck(studentNames, "Jay"));
		assertFalse(linkedListImpl.existCheck(studentNames, "Shiyang"));
	}
	@Test
	void retriveFirstTest() {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertEquals("John", linkedListImpl.retriveFirst(studentNames));
	}
	@Test
	void removeFirstTest() {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertFalse(linkedListImpl.removeFirst(studentNames).contains("John"));
	}
	@Test
	void cloneLinkedListTest() {
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertArrayEquals(studentNames.toArray(), linkedListImpl.cloneLinkedList(studentNames).toArray());
		
	}
	@Test
	void joinLinkedListTest() {
		LinkedList<String> dummyList = new LinkedList<String>();
		dummyList.add("shiyang");
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertTrue(linkedListImpl.joinLinkedList(studentNames, dummyList).contains("shiyang"));
	}
	@Test
	void removeLastElementTest(){
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertEquals("Kenny", linkedListImpl.removeLastElement(studentNames));
	}
	@Test
	void removeFirstElementTest(){
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertEquals("John", linkedListImpl.removeFirstElement(studentNames));
	}
	@Test
	void insertAtEndTest(){
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertEquals("shiyang", linkedListImpl.insertAtEnd(studentNames, "shiyang").getLast());
	}
	@Test
	void insertAtFrontTest(){
		LinkedListImpl linkedListImpl = new LinkedListImpl();
		assertEquals("shiyang", linkedListImpl.insertAtFront(studentNames, "shiyang").getFirst());
	}
}
