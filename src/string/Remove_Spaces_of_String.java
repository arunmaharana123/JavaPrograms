package string;

public class Remove_Spaces_of_String {

	public static void main(String[] args) {
		String name = "   My name  is  Arun   Maharana  ";
		System.out.println(name);//    My name is Arun Maharana   (with spaces)

		String removeSpace = name.trim();
		System.out.println(removeSpace);//My name  is  Arun   Maharana

	}

}
