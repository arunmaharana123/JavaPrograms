package string;

public class Basic_of_String {
	public static void main(String[] args) {

		// we can create ..
		String name = "Arun Maharana";
		String name2 = new String("Arun Maharana");

		// print string
		System.out.println(name);
		System.out.println(name2);

		// string is empty or not
		boolean checkEmpty = name.isEmpty();
		System.out.println(checkEmpty);// true for empty, false for non-empty

		// Length of String
		int lengthOfName = name.length();
		System.out.println("Length of Name : " + lengthOfName);

		// Substring of String
		String subName = name.substring(0, 4);
		System.out.println(subName);

		// Total words
		String[] wordsOfName = name.split(" ");
		System.out.println("Total words of Name : " + wordsOfName.length);

	}
}
