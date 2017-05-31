package exception;

public class Arithmatic_Exception {

	public static void main(String[] args) {

		int i = 10;
		int j = i / 0;
		System.out.println(j);
		/*
		 Exception in thread "main" java.lang.ArithmeticException: / by zero
				at exception.Arithmatic_Exception.main(Arithmatic_Exception.java:8)
		 */

	}

}
