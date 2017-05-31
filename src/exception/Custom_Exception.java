package exception;

class NameNotFoundCheckedException extends RuntimeException {

	public NameNotFoundCheckedException(String message) {
		super(message);
	}

}

class NameNotFoundUnCheckedException extends RuntimeException {

	public NameNotFoundUnCheckedException(String message) {
		super(message);
	}

}

public class Custom_Exception {

	public static void main(String[] args) throws NameNotFoundCheckedException {
		String name = "";
		try {
			if (name == "") {
				throw new NameNotFoundCheckedException(
						"Name Not Found... Please Specify a name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * Exception in thread "main" exception.NameNotFoundException: Name Not
		 * Found... Please Specify a name at
		 * exception.Custom_Exception.main(Custom_Exception.java:16)
		 */
		if (name == "") {
			throw new NameNotFoundUnCheckedException(
					"Name Not Found... Please Specify a name");
		}

		/*
		 * Exception in thread "main" exception.NameNotFoundExceptionUnChecked:
		 * Name Not Found... Please Specify a name at
		 * exception.Custom_Exception.main(Custom_Exception.java:37)
		 */

	}
}
