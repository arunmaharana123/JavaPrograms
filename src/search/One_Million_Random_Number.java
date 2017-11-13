package search;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class One_Million_Random_Number {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter(new File("E://MyProject/searchdata/1MillionRandomNumber.txt"));
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			fileWriter.write(new Random().nextInt(1000000) + "\n");
		}

		fileWriter.close();

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

}
