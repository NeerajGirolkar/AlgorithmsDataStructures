package com.neeraj.datastructures.stack;

/**
 * @author Neeraj
 * 
 * 1) Stack ADT is a Last-In-First-Out (LIFO) data structure.
 * 2) It supports 2 principle operations - push() and pop().
 * 3) push() - Inserts an element at the top of stack (TOS).
 * 4) pop() - Removes (and/or return) the last added element.
 * 5) peek() - Returns, but not removes, element at TOS.
 * 6) Stack can be bounded or unbounded.
 * 7) Stacks can be implemented using:
 * 		- Fixed size array 	(Bounded Stack)
 * 		- Dynamic array		(Unbounded Stack)
 * 		- Linked Lists 		(Unbounded Stack)
 * 8) Complexity of stack implemented using fixed size array:
 * 		- push()	O(1)
 * 		- pop()		O(1)
 * 		- peek()	O(1)
 * 		- search()	O(n)
 * 9) Complexity of stack implemented using dynamic array:
 * 		- push()	O(n) - Since the elements needs to be copied to 
 * 						   the new dynamic array.
 * 		- pop()		O(1)
 * 		- peek()	O(1)
 * 		- search()	O(n)
 * 10) Complexity of stack implemented using Linked Lists:
 * 		- push()	O(1)
 * 		- pop()		O(1)
 * 		- peek()	O(1)
 * 		- search()	O(n)
 * 11) Nature of the pop and push operations also means that stack elements have a natural order.
 * 12) Elements are removed from the stack in the reverse order to the order of their addition. 
 * 13) So, the lower elements are those that have been on the stack the longest.
 *
 */
public interface Stack {

	public void push(Object item);
	
	public Object pop();
	
	public Object peek();
	
	public int size();
	
	public boolean isEmpty();
	
}