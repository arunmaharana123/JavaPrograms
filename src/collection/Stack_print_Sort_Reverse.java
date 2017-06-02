package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/*
 List extends Collection Interface
 List:- Implemented Classes
 1. ArrayList:
 2. LinkedList:
 3. Vector:
 4. Stack:
 */

public class Stack_print_Sort_Reverse {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		System.out.println(stack);// o/p : []

		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");
		System.out.println(stack);// o/p : [AAA, BBB, CCC, DDD]

		// iterate through foreach loop
		for (String string : stack) {
			System.out.println(string); // o/p : AAA BBB CCC DDD
		}

		// iterate through ListIterator
		ListIterator<String> listIterator = stack.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string); // o/p : AAA BBB CCC DDD

		}

		// iterate through Iterator
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string); // o/p : AAA BBB CCC DDD

		}

		stack.add(0, "EEE");
		System.out.println(stack);// o/p : [EEE, AAA, BBB, CCC, DDD]

		// sort stack
		Collections.sort(stack);
		System.out.println(stack);// o/p : [AAA, BBB, CCC, DDD, EEE]

		// reverse stack
		Collections.reverse(stack);
		System.out.println(stack);// o/p : [EEE, DDD, CCC, BBB, AAA]
	}

}
