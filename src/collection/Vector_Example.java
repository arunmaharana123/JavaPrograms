package collection;

import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		System.out.println(vector);// o/p : []

		vector.add("XXX");
		vector.add("WWW");
		vector.add(0, "YYY");
		vector.add("ZZZ");
		System.out.println(vector);// o/p : [YYY, XXX, WWW, ZZZ]

		System.out.println(vector.capacity());// o/p : 10
		System.out.println(vector.contains("WWW"));// o/p : true
		System.out.println(vector.elementAt(0));// o/p : YYY
		System.out.println(vector.firstElement());// o/p : YYY
		System.out.println(vector.get(1));// o/p : XXX
		System.out.println(vector.indexOf("ZZZ"));// o/p : 3
		System.out.println(vector.isEmpty());// o/p : false
		System.out.println(vector.lastElement());// o/p : ZZZ
		System.out.println(vector.size());// o/p : 4

		vector.clear();
		System.out.println(vector);// o/p : []

	}

}
