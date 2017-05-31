package exception;

public class Number_Format_Exception {
	public static void main(String[] args) {
		String string = "123";
		int i = Integer.parseInt(string);
		System.out.println(i);//123
		
		string = "XYZ";
		i = Integer.parseInt(string);
		/*
		 Exception in thread "main" java.lang.NumberFormatException: For input string: "XYZ"
				at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
				at java.lang.Integer.parseInt(Integer.java:492)
				at java.lang.Integer.parseInt(Integer.java:527)
				at exception.Number_Format_Exception.main(Number_Format_Exception.java:10)
		 */
		
	}
}
