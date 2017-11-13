package search;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class One_Million_Sort_Number {

	public static void main(String[] args) throws IOException {
		StringBuilder data = new StringBuilder("");
		for (int i = 0; i < 1000000; i++) {
			data.append(i + "\n");
		}
		new One_Million_Sort_Number().writeFileUsingFiles(data);

		/*
		 * FileWriter fileWriter = new FileWriter(new
		 * File("E://MyProject/searchdata/1MillionSortNumber.txt")); long
		 * startTime = System.currentTimeMillis();
		 * 
		 * for (int i = 0; i < 1000000; i++) { fileWriter.write(i + "\n"); }
		 * 
		 * fileWriter.close();
		 * 
		 * long endTime = System.currentTimeMillis(); long totalTime = endTime -
		 * startTime; System.out.println(totalTime);
		 */

	}

	private void writeFileUsingFiles(StringBuilder datas) {
		String data = datas.toString();
		try {
			Files.write(Paths.get("E://MyProject/searchdata/1MillionSortNumber2.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
