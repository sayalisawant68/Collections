/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
	
	/*
	 * to create a new Hash Set containing student names, add some student
	 * (string) and print out the collection.
	 */
	public HashSet<String> createHashSet() {
		HashSet<String> studentNames = new HashSet<String>();
		studentNames.add("John");
		studentNames.add("Jay");
		studentNames.add("Carol");
		studentNames.add("Kelvin");  
		studentNames.add("Kenny"); 
		
		//iterate through all elements in hash set
		Iterator<String> itr = studentNames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		return studentNames;
	}
	//append the specified element to the end of a hash set.
	public HashSet<String> addElement(HashSet<String> studentNames,String name) {
		studentNames.add(name);
		return studentNames;
		
	}
	//get the number of elements in a hash set.
	public int getSize(HashSet<String> studentNames) {
		return studentNames.size();
	}
    //to empty an hash set.
	public HashSet<String> clearSet(HashSet<String> studentNames) {
		studentNames.clear();
		return studentNames;
		
	}
	// convert a hash set to an array.
	public Object[] SetToArray(HashSet<String> studentNames) {
		Object[] arr = studentNames.toArray();
		return arr;
	}
	//convert a hash set to a List/ArrayList
	public ArrayList<String> SetToList(HashSet<String> studentNames){
		ArrayList<String> students = new ArrayList<String>(studentNames);
		return students;
		
	}
	//to compare two hash set.
	public boolean compareHashSet(HashSet<String> studentNames,HashSet<String> newSet) {
		return studentNames.equals(newSet);
		
	}
	
	//to compare two sets and retain elements which are same on both sets.
	public HashSet<String> getEqualElements(HashSet<String> studentNames,HashSet<String> newSet) {
		HashSet<String> commonSet = new HashSet<String>();
		for(String name : studentNames) {
			if(newSet.contains(name)) {
				commonSet.add(name);
			}
			
		} 
		return commonSet;
	}
}
