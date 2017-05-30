package string;

public class Index_Of_String {

	public static void main(String[] args) {
		String name = "My name is Arun Maharana";
		System.out.println(name);

		// indexOf a character - give first index
		int indexOfM = name.indexOf('M');
		System.out.println(indexOfM);// 0

		// last index of a character
		int lastIndexOfM = name.lastIndexOf('M');
		System.out.println(lastIndexOfM);// 16

		// first character of string
		char firstCharacter = name.charAt(0);
		System.out.println(firstCharacter);

		// last character of string
		char lastCharacter = name.charAt(name.length() - 1);
		System.out.println(lastCharacter);

	}

}
