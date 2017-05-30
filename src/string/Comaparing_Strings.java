package string;

public class Comaparing_Strings {

	public static void main(String[] args) {

		String myName = "Arun";// creates in String pool
		String yourName = "Arun";// creates in String pool
		String hisName = new String("Arun");// creates in heap
		String herName = new String("Jyotsna");// creates in heap

		System.out.println(myName.hashCode()); // 2049706
		System.out.println(yourName.hashCode());// 2049706
		System.out.println(hisName.hashCode());// 2049706
		System.out.println(herName.hashCode());// 526003538

		if (myName == yourName) {
			System.out.println("We've same name!!!");// We've same name!!!
		} else {
			System.out.println("not.");
		}

		if (myName == hisName) {
			System.out.println("We've same name!!!");
		} else {
			System.out.println("not.");// not.
		}

		if (myName == herName) {
			System.out.println("We've same name!!!");
		} else {
			System.out.println("not.");// not.
		}

		if (myName.equalsIgnoreCase(yourName)) {
			System.out.println("We've same name!!!"); // We've same name!!!
		} else {
			System.out.println("not.");
		}

		if (myName.equalsIgnoreCase(hisName)) {
			System.out.println("We've same name!!!"); // We've same name!!!
		} else {
			System.out.println("not.");
		}

		if (myName.equalsIgnoreCase(herName)) {
			System.out.println("We've same name!!!");
		} else {
			System.out.println("not.");// not.
		}

	}
}
