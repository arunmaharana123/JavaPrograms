package keywords;

public class Total_50_Keywords {
	// Enumeration : enum
	enum DayOfWeek {
		MON, TUE, WED, THU, FRI, SAT, SUN
	};

	public static void main(String[] args) {

		// primitives 8 keywords
		// boolean, byte, short, int,float, long, double, char
		int i = 0;
		System.out.println(i);

		// Flow control 12 keywords: break, case, continue, default, do, else,
		// for, if,
		// instanceof, return, switch, while
		for (int j = 0; j < 5; j++) {
			System.out.println(i);
			if (i == 5)
				break;
			else
				continue;
		}

		// Class, method, variable modifiers ( 13 keywords): - abstract, class,
		// extends,
		// final, implements, interface, native, new,
		// static, strictfp, synchronized, transient, volatile
		final int constant = 10;
		System.out.println("can't change value of contant");

		// Package control (2 keywords) : - import, package
		System.out.println("import class of other package");

		// Error handling( 6 keywords): - assert, catch, finally, throw, throws,
		// try
		try {
			System.out.println("if any exception arries");
		} catch (Exception e) {
		} finally {

		}

		// Others : super, this, void
		// Unused : const, goto

	}

}
