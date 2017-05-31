package exception;

public class Index_Of_Bound_Exception {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		System.out.println(intArray[4]);// o/p - 5
		System.out.println(intArray[5]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5 
		 *		 at exception.Array_Index_Exception.main(Array_Index_Exception.java:9)
		 */
		
		String string = "ABCD";
		System.out.println(string.charAt(3));// o/p - 5
		System.out.println(string.charAt(4));
		/*
		 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
			at java.lang.String.charAt(String.java:658)
			at exception.Index_Of_Bound_Exception.main(Index_Of_Bound_Exception.java:17)
		 */

	}

}
