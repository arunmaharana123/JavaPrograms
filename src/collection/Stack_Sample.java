package collection;

import java.util.Stack;

public class Stack_Sample {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		System.out.println(stack);// o/p : []

		stack.add("Arun");
		stack.add(0, "Badal");
		stack.add("Karun");
		System.out.println(stack);// o/p : [Badal, Arun, Karun]

		stack.addElement("Bapu");
		System.out.println(stack);// o/p : [Badal, Arun, Karun, Bapu]

		System.out.println(stack.capacity());// o/p : 10
		System.out.println(stack.size());// o/p : 4
		System.out.println(stack.isEmpty());// o/p : false
		System.out.println(stack.contains("Arun"));// o/p : true
		System.out.println(stack.firstElement());// o/p : Badal
		System.out.println(stack.lastElement());// o/p : Karun
		System.out.println(stack.get(2));// o/p : Arun
		stack.clear();
		System.out.println(stack);// o/p :[]
	}

}
