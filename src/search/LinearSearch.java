package search;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to search :\n");
		int search_number = scanner.nextInt();
		scanner.close();

		LinearSearch linearSearch = new LinearSearch();

		linearSearch.randomNumberListSearch(search_number);
		
		linearSearch.randomNumberSearch(search_number);

		linearSearch.sortNumberSearch(search_number);

	}

	private void randomNumberListSearch(int search_number) throws NumberFormatException, IOException {
		long startTime = System.currentTimeMillis();

		FileReader fileReader = new FileReader("E://MyProject/searchdata/1MillionRandomNumber.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String sCurrentLine;

		ArrayList<Integer> arrayList = new ArrayList<>();

		while ((sCurrentLine = bufferedReader.readLine()) != null) {
			arrayList.add(Integer.parseInt(sCurrentLine.trim()));
		}
		System.out.println(arrayList.contains(new Integer(search_number)));
		bufferedReader.close();
		fileReader.close();

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	private void randomNumberSearch(int search_number) throws NumberFormatException, IOException {
		long startTime = System.currentTimeMillis();

		FileReader fileReader = new FileReader("E://MyProject/searchdata/1MillionRandomNumber.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String sCurrentLine;

		while ((sCurrentLine = bufferedReader.readLine()) != null) {
			if (search_number == Integer.parseInt(sCurrentLine.trim())) {
				System.out.println("Found It : " + search_number);
				break;
			}
			// Highest 80 millis
		}

		bufferedReader.close();
		fileReader.close();

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	private void sortNumberSearch(int search_number) throws NumberFormatException, IOException {
		long startTime = System.currentTimeMillis();

		FileReader fileReader = new FileReader("E://MyProject/searchdata/1MillionSortNumber.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String sCurrentLine;

		while ((sCurrentLine = bufferedReader.readLine()) != null) {
			if (search_number == Integer.parseInt(sCurrentLine.trim())) {
				System.out.println("Found It : " + search_number);
				break;
			}
			// Highest 80 millis
		}

		bufferedReader.close();
		fileReader.close();

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
