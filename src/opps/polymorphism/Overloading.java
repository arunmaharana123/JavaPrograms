package opps.polymorphism;

public class Overloading {
	private void getDetails() {
		System.out.println("Default Detail");
	}

	private void getDetails(String name) {
		System.out.println(name + " Detail");
	}
	
	private void getDetails(int id) {
		System.out.println("ID" + id + " Detail");
	}

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.getDetails();// Default Detail
		overloading.getDetails("Arun");// Arun Detail
		overloading.getDetails(1);// ID1 Detail
	}

}
