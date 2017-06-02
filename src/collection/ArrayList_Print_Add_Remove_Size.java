package collection;

import java.util.ArrayList;

/*
 List extends Collection Interface
 List:- Implemented Classes
 1. ArrayList:
 2. LinkedList:
 3. Vector:
 4. Stack:
 */

/*
 Class ArrayList

 java.lang.Object
 java.util.AbstractCollection
 java.util.AbstractList
 java.util.ArrayList
 All Implemented Interfaces:
 Serializable, Cloneable, Iterable, Collection, List, RandomAccess

 Direct Known Subclasses:
 AttributeList, RoleList, RoleUnresolvedList

 */
public class ArrayList_Print_Add_Remove_Size {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList<>();
		arrayList.add("Arun");
		arrayList.add(123);
		arrayList.add('c');
		arrayList.add(3.4);
		arrayList.add(1010101);
		System.out.println(arrayList);// o/p : [Arun, 123, c, 3.4, 1010101]

		ArrayList arrayList2 = new ArrayList<>(arrayList);
		System.out.println(arrayList2);// o/p : [Arun, 123, c, 3.4, 1010101]

		arrayList.clear();
		System.out.println(arrayList);// o/p : []

		arrayList.addAll(arrayList2);
		System.out.println(arrayList);// o/p : [Arun, 123, c, 3.4, 1010101]

		// data contains or not
		boolean contains = arrayList.contains(123);
		System.out.println(contains);// o/p : true

		// get value of index
		System.out.println(arrayList.get(0));// o/p : Arun
		/*
		 * Note: System.out.println(arrayList.get(8));// o/p : Exception in
		 * thread "main" java.lang.IndexOutOfBoundsException: Index: 12, Size: 5
		 * at java.util.ArrayList.rangeCheck(Unknown Source) at
		 * java.util.ArrayList.get(Unknown Source) at
		 * com.arun.list.ArrayListDemo3.main(ArrayListDemo3.java:41)
		 */

		// get index of value // if presents return index otherwise return -1
		System.out.println(arrayList.indexOf(123));// o/p : 1
		System.out.println(arrayList.indexOf(11211));// o/p : -1

		boolean isEmpty = arrayList.isEmpty();
		System.out.println(isEmpty);// o/p : false

		arrayList.remove(0);
		System.out.println(arrayList);// o/p : [123, c, 3.4, 1010101]

		arrayList.remove(new Character('c'));
		System.out.println(arrayList);// o/p : [123, 3.4, 1010101]

		arrayList.remove(new Integer(1010101));
		System.out.println(arrayList);// o/p : [123, 3.4]

		arrayList.remove(123);// o/p : Exception it will consider as index not
								// object
		/*
		 * Exception in thread "main" java.lang.IndexOutOfBoundsException:
		 * Index: 123, Size: 2 at java.util.ArrayList.rangeCheck(Unknown Source)
		 * at java.util.ArrayList.remove(Unknown Source) at
		 * com.arun.list.ArrayListDemo3.main(ArrayListDemo3.java:66)
		 */
	}
}
