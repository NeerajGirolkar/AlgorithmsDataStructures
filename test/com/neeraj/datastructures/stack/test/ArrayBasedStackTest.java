package com.neeraj.datastructures.stack.test;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.neeraj.datastructures.stack.ArrayBasedStack;
import com.neeraj.datastructures.stack.Stack;

public class ArrayBasedStackTest {
	private Stack stack;
	
	@Before
	public void init() {
		stack = new ArrayBasedStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
	}
	
	@Test
	public void testPush() {
		stack.push(50);
		assertEquals(50, stack.peek());
	}
	
	@Test
	public void testPop() {
		stack.push(50);
		assertEquals(50, stack.pop());
		assertEquals(40, stack.pop());
		assertEquals(30, stack.pop());
	}
	
	@Test
	public void testPeek() {
		stack.push(50);
		assertEquals(50, stack.peek());
		stack.pop();
		assertEquals(40, stack.peek());
	}
	
	@Test(expected = IllegalStateException.class)
	public void testStackOverflow(){
		stack.push(50);
		stack.push(60);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testStackUnderflow(){
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
	
	@After
	public void cleanup() {
		stack = null;
	}
}
