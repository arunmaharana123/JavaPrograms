package exception;

public class NullPointerExamples {

	public static void main(String[] args) {

		String string = new String();
		int i = string.length();
		System.out.println(i);// 0

		// Any object contains null value and trying to call methods or instance
		// Throws NullPointerException
		String name = null;
		int length = name.length();
		/*
		 * Exception in thread "main" java.lang.NullPointerException at
		 * exception.NullPointerExamples.main(NullPointerExamples.java:14)
		 */

	}

}
