/*
  Author:    Sayali sawant
  Created:   04-10-2020
 */
package com.collections.CollectionImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeSetImplTest {
	
	private TreeSet<Integer> numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new TreeSet<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44); 
		 
	}
	@Test
	void removeElementTest(){
		TreeSetImpl treeSetImpl = new TreeSetImpl();
		
		assertEquals(true, treeSetImpl.removeElement(numbers, 44));
		assertEquals(false, treeSetImpl.removeElement(numbers, 78));
	}
    @Test
    void retriveLastTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	
    	assertEquals(44, treeSetImpl.retriveLast(numbers));
    }
    @Test
    void retriveFirstTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	assertEquals(11, treeSetImpl.retriveFirst(numbers));
    }
    @Test
    void getClosestGreaterTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	int dummy = treeSetImpl.getClosestGreater(numbers, 30);
    	assertEquals(33, dummy);
    }
    @Test
    void getNumberLessThanSpecifiedTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	assertTrue(treeSetImpl.getNumberLessThanSpecified(numbers).isEmpty());
    }
    @Test
    void getSizeTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	assertEquals(4, treeSetImpl.getSize(numbers));
    }
    @Test
    void getLastElementTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	assertEquals(44, treeSetImpl.getLastElement(numbers));
    }
    @Test
    void getFirstElementTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	assertEquals(11, treeSetImpl.getFirstElement(numbers));
    }
    @Test
    void addToAnotherTest() {
    	TreeSetImpl treeSetImpl = new TreeSetImpl();
    	assertArrayEquals(numbers.toArray(), treeSetImpl.addToAnother(numbers).toArray());
    }
}
