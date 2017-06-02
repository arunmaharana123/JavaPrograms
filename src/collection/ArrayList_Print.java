package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 List extends Collection Interface
 List:- Implemented Classes
 1. ArrayList:
 2. LinkedList:
 3. Vector:
 4. Stack:
 */

public class ArrayList_Print {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();// using diamond
														// operator in java7
		// before java7 we can use ArrayList<String>
		arrayList.add("Arun");
		arrayList.add(0, "Badal");
		arrayList.add("Piku");
		arrayList.add(0, "Jash");
		System.out.println(arrayList);// o/p : [Jash, Badal, Arun, Piku]

		for (String string : arrayList) {
			System.out.println(string); // o/p : Jash Badal Arun Piku
		}

		// Collections.sort(arrayList, (s1,s2)->s1.compareToIgnoreCase(s2));//
		// using lambda expression in java8
		// before java 8
		/*
		 * Collections.sort(arrayList, new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) { return
		 * s1.compareToIgnoreCase(s2); } });
		 */
		System.out.println(arrayList);// o/p : [Arun, Badal, Jash, Piku]

		Collections.reverse(arrayList);
		System.out.println(arrayList);// o/p : [Piku, Jash, Badal, Arun]

		// in java8 using forEach()
		// arrayList.forEach(System.out::println);// o/p : Piku Jash Badal Arun

	}
}
