package exception;

import java.lang.reflect.Method;

public class No_Such_Method_Exception {

	public No_Such_Method_Exception() {
		Class c;
		try {
			c = Class.forName("java.lang.String");
			try {
				Class[] paramTypes = new Class[5];
				Method m = c.getDeclaredMethod("fooMethod", paramTypes);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			/*java.lang.NoSuchMethodException: java.lang.String.fooMethod(null, null, null, null, null)
					at java.lang.Class.getDeclaredMethod(Class.java:2017)
					at exception.No_Such_Method_Exception.<init>(No_Such_Method_Exception.java:13)
					at exception.No_Such_Method_Exception.main(No_Such_Method_Exception.java:26)*/
		} catch (ClassNotFoundException e) {
			// deal with the exception here ...
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new No_Such_Method_Exception();
	}

}