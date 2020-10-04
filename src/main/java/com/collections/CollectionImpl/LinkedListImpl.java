/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
 
public class LinkedListImpl { 

	/*
	 * to create a new Linked list containing student names, add some student
	 * (string) and print out the collection.
	 */
	public LinkedList<String> createLinkedList() {
		LinkedList<String> studentNames = new LinkedList<String>();

		// add student names to linkedlist
		studentNames.add("John");
		studentNames.add("Jay");
		studentNames.add("Carol");
		studentNames.add("Kelvin"); 
		studentNames.add("Kenny"); 

		return studentNames;
		}
	
	// iterate through all elements in a linked list.
	public void iterateLinkedList(LinkedList<String> studentNames) {

		// getting the iterator
		Iterator<String> itr = studentNames.iterator();

		// iterate over the list
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	// append the specified element to the end of a linked list.
	public LinkedList<String> appendAtLast(LinkedList<String> studentNames, String newStudent) {

		studentNames.addLast(newStudent);
		return studentNames;
		}
 
	// iterate through all elements in a linked list starting at the specified
	// position.
	public void iterateAtSpecifiedPosition(LinkedList<String> studentNames, int index) {

		// get list iterator
		ListIterator listItr = studentNames.listIterator(index);

		// print the elements
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
	}

	// iterate a linked list in reverse order.
	public void iterateInReverseOrder(LinkedList<String> studentNames) { 

		// get descending iterator
		Iterator<String> listItr = studentNames.descendingIterator();
		// print the elements
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
	}

	
	// insert the specified element at the specified position in the linked list.
	public void insertAtSpecifiedPosition(LinkedList<String> studentNames, int index, String name) {
		studentNames.add(2, name);
	}

	// insert the specified element at the front of a linked list.
	public LinkedList<String> insertAtFront(LinkedList<String> studentNames, String name) {

		studentNames.offerFirst(name);
		return studentNames;
	}

	// insert the specified element at the end of a linked list.
	public LinkedList<String> insertAtEnd(LinkedList<String> studentNames, String name) {
		studentNames.offerLast(name);
		return studentNames;
	}

	// remove first element from a linked list.
	public String removeFirstElement(LinkedList<String> studentNames) {
		return studentNames.removeFirst();
	}

	// remove Last element from a linked list.
	public String removeLastElement(LinkedList<String> studentNames) {
		return studentNames.removeLast();
	}

	// join two linked lists.
	public LinkedList<String> joinLinkedList(LinkedList<String> studentNames, LinkedList<String> studentSurnames) {
		studentNames.addAll(studentSurnames);
		return studentNames;

	}

	// clone an linked list to another linked list.
	public LinkedList<String> cloneLinkedList(LinkedList<String> studentNames) {
		LinkedList<String> students = (LinkedList<String>) studentNames.clone();
		return students;
	}

	// remove and return the first element of a linked list.
	public LinkedList<String> removeFirst(LinkedList<String> studentNames) {
		studentNames.remove();
		return studentNames;

	}

	// retrieve but does not remove, the first element of a linked list.
	public String retriveFirst(LinkedList<String> studentNames) {
		return studentNames.getFirst();

	}

	// check if a particular element exists in a linked list.
	public boolean existCheck(LinkedList<String> studentNames, String name) {
		return studentNames.contains(name);
	}

	// convert a linked list to array list.
	public ArrayList<String> linkedListToArrayList(LinkedList<String> studentNames) {
		ArrayList<String> students = new ArrayList<String>(studentNames);
		return students;
	}

	// remove all the elements from a linked list.
	public LinkedList<String> clearLinkedList(LinkedList<String> studentNames) {
		studentNames.clear();
		return studentNames;
	}

}
