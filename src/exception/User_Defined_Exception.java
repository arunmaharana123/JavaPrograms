package exception;

public class User_Defined_Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = null;

		// Here we can catch exception by If_Else statement
		if (string != null) {
			System.out.println(string.length());
		} else {
			System.out.println("Value of String can't be null.");
		}

		// we are calling exception with own argument
		try {
			int length = string.length();
		} catch (NullPointerException e) {
			throw new NullPointerException("Value of String can't be null.");
		}

		// just print our own message
		try {
			int length = string.length();
		} catch (NullPointerException e) {
			System.err.println("Value of String can't be null.");
		}

	}

}
