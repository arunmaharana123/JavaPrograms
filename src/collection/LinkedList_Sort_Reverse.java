package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Sort_Reverse {

	public static void main(String[] args) {
		// create a linked list
		LinkedList<String> linkedList = new LinkedList<>();

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

		for (String string : linkedList) {
			System.out.println(string); // o/p : A A2 F B D E C Z
		}

		// Collections.sort(linkedList, (s1, s2) ->
		// s1.compareToIgnoreCase(s2));// using lambda expression in java8
		// before java 8
		/*
		 * Collections.sort(linkedList, new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) { return
		 * s1.compareToIgnoreCase(s2); } });
		 */

		System.out.println(linkedList);// o/p : [A, A2, B, C, D, E, F, Z]

		Collections.reverse(linkedList);
		System.out.println(linkedList);// o/p : [Z, F, E, D, C, B, A2, A]

		// in java8 using forEach()
		// linkedList.forEach(System.out::println);// o/p : Z F E D C B A2 A

	}
}