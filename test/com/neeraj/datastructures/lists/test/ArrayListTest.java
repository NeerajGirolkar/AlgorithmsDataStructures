package com.neeraj.datastructures.lists.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.neeraj.datastructures.lists.ArrayList;

public class ArrayListTest {
	private ArrayList arrayList;
	
	@Before
	public void init(){
		arrayList = new ArrayList();
		arrayList.add(4);
		arrayList.add(8);
		arrayList.add(15);
		arrayList.add(16);
		arrayList.add(23);
		arrayList.add(42);
	}
	
	@Test
	public void testContains(){
		assertTrue(arrayList.contains(16));
	}
	
	@Test
	public void testSize(){
		assertEquals(6, arrayList.size());
	}
	
	@Test
	public void testAdd(){
		arrayList.add(50);
		arrayList.add(55);
		arrayList.add(63);
		arrayList.add(22);
		arrayList.add(43);
		arrayList.add(87);
		arrayList.add(8);
		arrayList.add(16);
		arrayList.add(7);
		assertEquals(13, arrayList.size());
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testAddWithIndexOne(){
		arrayList.add(10, 22);
	}
	
	@Test
	public void testAddWithIndexTwo(){
		arrayList.add(1, 22);
		arrayList.add(7, 32);
		arrayList.add(5, 34);
		assertEquals("[4, 22, 8, 15, 16, 34, 23, 42, 32, 0]", arrayList.print());
	}
	
	@After
	public void cleanup(){
		arrayList = null;
	}
}
