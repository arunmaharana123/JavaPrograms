package string;

public class String_to_Char_Array {

	public static void main(String[] args) {
		String name = "Sachin Tendulkar";
		System.out.println(name);

		// string traverse 1
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		// string traverse 2
		char[] charsOfString = name.toCharArray();
		for (int i = 0; i < charsOfString.length; i++) {
			System.out.println(charsOfString[i]);
		}

	}

}
