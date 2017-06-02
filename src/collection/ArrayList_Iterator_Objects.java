package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iterator_Objects {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		// using diamond operator in java7
		// before java7 we can use ArrayList<String>
		arrayList.add("Arun");
		arrayList.add("Badal");
		arrayList.add("Piku");
		arrayList.add("Jash");
		System.out.println(arrayList);// o/p : [Jash, Badal, Arun, Piku]

		ListIterator<String> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);// o/p : Arun Badal Piku Jash
		}

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);// o/p : Arun Badal Piku Jash
		}

		for (String string : arrayList) {
			System.out.println(string);// o/p : Arun Badal Piku Jash
		}

		// arrayList.forEach(System.out::println);//java8 // o/p : Arun Badal
		// Piku Jash
	}
}
