package fundamental;

public class For_Loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", "); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		}
		System.out.println("\n===============================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);// 12345 12345 12345 12345 12345
			}
			System.out.println();
		}
		System.out.println("\n===============================");

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);// 12345 2345 345 45 5
			}
			System.out.println();
		}

		System.out.println("\n===============================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);// 1 12 123 1234 12345
			}
			System.out.println();
		}
	}
}
