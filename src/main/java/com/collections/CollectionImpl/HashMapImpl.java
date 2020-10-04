/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl{
	
	/* create a HashMap of key as student id(Integer) and value as Student name 
	 * (String). Add some entries and print the hash map.
	 */
	public void createHashMap(){ 
		//create hash map
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		students.put(1, "John");
		students.put(2, "Jay"); 
		students.put(3, "Carol");  
		students.put(4, "Kelvin");  
		students.put(5, "Kenny");
		//print the hash map
		for(Map.Entry e:students.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	//iterate over all the entries in the HashMap. 
	public void iterateOverMap(HashMap<Integer,String> students) {
		//iterate using for loop
		for(Map.Entry e:students.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	//get the specified value with the specified key in a HashMap.
	public String getValue(HashMap<Integer,String> students,int key) {
		String val = students.get(key);
		return val;
	}
	//count the number of key-value (size) mappings in a map.
	public int getSize(HashMap<Integer,String> students) {
		return students.size();
	}
	//copy all of the mappings from the specified map to another map.
	public HashMap<Integer,String> createCopy(HashMap<Integer,String> students){
		HashMap<Integer,String> newMap = new HashMap<Integer,String>();
		newMap.putAll(students);
		return newMap;
	
	}
	//remove all of the mappings from a map
	public HashMap<Integer,String> removeAll(HashMap<Integer,String> students) {
		students.clear();
		return students;
	}
	//test if a map contains a mapping for the specified key.
	public boolean checkKeyMapping(HashMap<Integer,String> students,int key) {
		return students.containsKey(key);
	}
	//test if a map contains a mapping for the specified value.
	public boolean checkValueMapping(HashMap<Integer,String> students,String value) {
		return students.containsValue(value);
	}
	//get the value of a specified key in a map.
	public String getValueForKey(HashMap<Integer,String> students,int key) {
		return students.getOrDefault(key, "ABC");
	}
	//get a set view of the keys contained in this map.
	public Set<Integer> getSetView(HashMap<Integer,String> students){
		Set<Integer> keyset = students.keySet();
		return keyset;
		
	}
	//get a collection view of the values contained in this map.
	public Collection<String> getCollectionView(HashMap<Integer,String> students){
		return students.values();
	}
}
