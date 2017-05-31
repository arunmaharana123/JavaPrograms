package exception;

public class Illegal_Argument_Exception {
	public static void main(String[] args) {
		Percentage percentage = new Percentage(121);
		System.out.println(percentage.getValue());
		/*
		 * Exception in thread "main" java.lang.IllegalArgumentException: 121 at
		 * exception.Percentage.<init>(Illegal_Argument_Exception.java:24) at
		 * exception
		 * .Illegal_Argument_Exception.main(Illegal_Argument_Exception.java:7)
		 */

	}
}

final class Percentage {
	private final int value;

	public Percentage(int value) {
		if (value < 0 || value > 100) {
			throw new IllegalArgumentException(Integer.toString(value));
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
