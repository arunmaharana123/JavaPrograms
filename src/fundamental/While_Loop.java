package fundamental;

public class While_Loop {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + ", "); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
			i++;
		}
		System.out.println("\n===============================");

		i = 1;
		while (i <= 5) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);// 12345 12345 12345 12345 12345
			}
			System.out.println();
			i++;
		}
		System.out.println("\n===============================");

		i = 1;
		while (i <= 5) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);// 12345 2345 345 45 5
			}
			i++;
			System.out.println();
		}

		System.out.println("\n===============================");

		i = 1;
		while (i <= 5) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);// 1 12 123 1234 12345
			}
			i++;
			System.out.println();
		}
	}
}
