package collection;

import java.io.*;
import java.util.*;

public class Linked_List_Sample {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();

		linkedList.addFirst("Item1");
		linkedList.addLast("Item2");
		PrintLinkedList(linkedList);

		linkedList.add(1, "Item1.5");
		linkedList.add(2, "Item1.8");
		PrintLinkedList(linkedList);

		linkedList.removeLast();
		PrintLinkedList(linkedList);
	}

	private static void PrintLinkedList(LinkedList linkedList) {
		System.out.println(linkedList);
	}
}
