package collection;

import java.util.ArrayList;

public class Collection_List_Basic {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Arun");
		list.add("Kumar");
		list.add("Maharana");
		list.add(1, "Sachin");

		System.out.println("Element at 1st position: " + list.get(0));

		System.out.println("Size of List " + list.size());

		System.out.println("Check list is Empty or Not : " + list.isEmpty());
	}
}
