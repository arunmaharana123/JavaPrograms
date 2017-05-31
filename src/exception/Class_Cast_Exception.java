package exception;

public class Class_Cast_Exception {

	public static void main(String[] args) {
		Object string = new String();
		Integer integer = (Integer) string;
		System.out.println(integer);
		/*Exception in thread "main" java.lang.ClassCastException: 
		 	java.lang.String cannot be cast to java.lang.Integer
			at exception.Class_Cast_Exception.main(Class_Cast_Exception.java:7)*/

	}

}
