package exception;

public class Catching_Exception {

	// throwing with throws keyword
	public static void main(String[] args) throws NullPointerException {

		// catching with try catch block
		String string = null;
		try {
			System.out.println("Length of String : " + string.length());
		} catch (Exception e) {
			System.err.println("String contains null value.");
		}

		// catching with try catch block with own message
		String string2 = null;
		try {
			System.out.println("Length of String : " + string2.length());
		} catch (Exception e) {
			throw new NullPointerException("My own Message");
		}
		/*
		 * Exception in thread "main" java.lang.NullPointerException: My own Message at
		 * exception.Catching_Exception.main(Catching_Exception.java:21)
		 */

	}

}
