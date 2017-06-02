package collection;

import java.util.Stack;

/*
 List extends Collection Interface
 List:- Implemented Classes
 1. ArrayList:
 2. LinkedList:
 3. Vector:
 4. Stack:
 */

public class Stack_POP_PEEK_PUSH {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		System.out.println(stack);// o/p : []

		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");
		System.out.println(stack);// o/p : [AAA, BBB, CCC, DDD]

		// search an object if find return position else -1
		System.out.println(stack.search("AAA")); // o/p : 4
		System.out.println(stack.search("DDD")); // o/p : 1
		System.out.println(stack.search("FFF")); // o/p : -1

		// return top object of stack
		System.out.println(stack.peek());// o/p : DDD

		// add object into stack
		stack.pop();
		System.out.println(stack);// o/p : [AAA, BBB, CCC]

		stack.pop();
		System.out.println(stack);// o/p : [AAA, BBB]

		stack.pop();
		System.out.println(stack);// o/p : [AAA]

		stack.pop();
		System.out.println(stack);// o/p : []

		// check stack is empty or not
		System.out.println(stack.empty());// o/p : true

		// if stack is empty then it raise an Exception called
		// EmptyStackException
		stack.pop();// Exception raised
		/*
		 * Exception in thread "main" java.util.EmptyStackException at
		 * java.util.Stack.peek(Unknown Source) at java.util.Stack.pop(Unknown
		 * Source) at com.arun.list.StackDemo2.main(StackDemo2.java:54)
		 */
	}

}
