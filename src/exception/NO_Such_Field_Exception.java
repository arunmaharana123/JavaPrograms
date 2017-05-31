package exception;

import java.lang.reflect.*;

public class NO_Such_Field_Exception {

	public String string1 = "MyName";

	public static void main(String[] args) {

		NO_Such_Field_Exception c = new NO_Such_Field_Exception();
		Class cls = c.getClass();

		System.out.println("Field =");

		try {
			Field sField = cls.getField("MyName");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
			/*java.lang.NoSuchFieldException: MyName
				at java.lang.Class.getField(Class.java:1592)
				at exception.NO_Such_Field_Exception.main(NO_Such_Field_Exception.java:17)*/
			System.out.println("NO_Such_Field_Exception");
		}

	}

	public NO_Such_Field_Exception() {
		// no argument constructor
	}

	public NO_Such_Field_Exception(String string1) {
		this.string1 = string1;
	}

}
