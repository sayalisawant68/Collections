/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListImpl { 

	/*
	 * to create a new array list containing student names, add some student
	 * (string) and print out the collection.
	 */
	public ArrayList<String> createArrayList() {

		// create a generic arraylist of type string
		ArrayList<String> studentNames = new ArrayList<String>();

		// add student names to arraylist
		studentNames.add("John");
		studentNames.add("Jay"); 
		studentNames.add("Carol");
		studentNames.add("Kelvin");
		studentNames.add("Kenny");

		// print the students list
		for (String name : studentNames) {
			System.out.println(name);
		}
		return studentNames;

	}

	// iterate through all elements in a array list.
	public void iterateArrayList(ArrayList<String> studentNames) {

		// getting the iterator
		Iterator itr = studentNames.iterator();

		// iterate over the list
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	// insert an element into the array list at the first position.
	public ArrayList<String> insertElementAtFirst(ArrayList<String> studentNames, String name) {

		// insert element at first position in arrayList
		studentNames.add(0, name);
		return studentNames;

	}

	// retrieve an element (at a specified index) from a given array list.
	public String retriveElement(ArrayList<String> studentNames, int index) {

		// return element of given index from list
		return studentNames.get(index);
	}

	// update specific array element by given element.
	public ArrayList<String> updateElement(ArrayList<String> studentNames, int index, String name) {

		// update element at specified position
		studentNames.set(index, name);
		return studentNames;

	}

	// remove the third element from a array list.
	public ArrayList<String> removeElementFromThirdPosition(ArrayList<String> studentNames) {

		// remove third element from arraylist
		studentNames.remove(3);
		return studentNames;
	}

	// search an element in a array list.
	public boolean searchElement(ArrayList<String> studentNames, String name) {

		// search element is present or not
		return studentNames.contains(name);

	}

	// sort a given array list.
	public ArrayList<String> sortArrayList(ArrayList<String> studentNames) {
		// System.out.println(studentNames);
		// sort the array list in ascending order
		Collections.sort(studentNames);
		// System.out.println(studentNames);
		return studentNames;

	}

	// copy one array list into another.
	public ArrayList<String> copyArrayList(ArrayList<String> studentNames) {
		ArrayList<String> dummyList = new ArrayList<String>();
		for (int i = 0; i < studentNames.size(); i++) {
			dummyList.add(studentNames.get(i));
		}
		// Collections.copy(dummyList, studentNames);
		return dummyList;

	}

	// reverse elements in a array list.
	public ArrayList<String> reverseArrayList(ArrayList<String> studentNames) {

		// array list to store reverse elements
		ArrayList<String> revArrayList = new ArrayList();
		for (int i = studentNames.size() - 1; i >= 0; i--) {
			revArrayList.add(studentNames.get(i));
		}
		return revArrayList;

	}

	// join two array lists.
	public ArrayList<String> joinArrayLists(ArrayList<String> studentNames, ArrayList<String> studentSurnames) {

		// join two ArrayList.
		studentNames.addAll(studentSurnames);
		return studentNames;

	}

	// clone an array list to another array list.
	public ArrayList<String> cloneArrayList(ArrayList<String> studentNames) {

		ArrayList<String> students = (ArrayList<String>) studentNames.clone();
		return students;

	}

	// to empty an array list.
	public ArrayList<String> emptyArrayList(ArrayList<String> studentNames) {

		studentNames.clear();
		return studentNames;

	}

	// to test an array list is empty or not.
	public boolean emptyCheck(ArrayList<String> studentNames) {
		return studentNames.isEmpty();

	}
}
