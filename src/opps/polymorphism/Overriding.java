package opps.polymorphism;

class Parent {
	public void display() {
		System.out.println("Test Displaying");
	}
}

public class Overriding extends Parent{

	public void display() {
		System.out.println("Overriding Displaying");
	}

	public static void main(String[] args) {
		Overriding overriding = new Overriding();
		overriding.display();
	}

}
