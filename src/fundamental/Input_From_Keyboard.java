package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input_From_Keyboard {

	public static void main(String[] args) throws IOException {

		// Process - 1 Command line
		// run your program with value like
		// java ClassName Args1 Args2...
		System.out.println(args.length);// 2(if you pass 2 words)

		// Process 2 Using Scanner class

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();// input an integer example 10
		System.out.println(i);// 10

		// Process 3 Using BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());// o/p will be your input
	}

}
