package collection;

import java.util.LinkedList;

/*
 List extends Collection Interface
 List:- Implemented Classes
 1. ArrayList:
 2. LinkedList:
 3. Vector:
 4. Stack:
 */

public class LinkedList_Add_Remove_Print {

	public static void main(String[] args) {
		// create a linked list
		LinkedList linkedList = new LinkedList();

		// add elements to the linked list
		linkedList.add("F");
		linkedList.add("B");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("C");
		linkedList.addLast("Z");
		linkedList.addFirst("A");
		linkedList.add(1, "A2");
		System.out.println(linkedList);// o/p : [A, A2, F, B, D, E, C, Z]

		// remove elements from the linked list
		linkedList.remove("F");
		linkedList.remove(2);
		System.out.println(linkedList);// o/p : [A, A2, D, E, C, Z]

		// remove first and last elements
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);// o/p : [A2, D, E, C]

		// get and set a value
		Object val = linkedList.get(2);
		linkedList.set(2, (String) val + " Changed");
		System.out.println(linkedList);// o/p : [A2, D, E Changed, C]

		// add content in first index
		linkedList.offerFirst("V");
		System.out.println(linkedList);// o/p : [V, A2, D, E Changed, C]

		// add content in last index
		linkedList.offerLast("V");
		System.out.println(linkedList);// o/p : [V, A2, D, E Changed, C, V]

		// clear all contents of LinkedList
		linkedList.clear();
		System.out.println(linkedList);// o/p : []

	}

}
