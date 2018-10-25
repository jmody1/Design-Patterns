

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

	/**
	 * method to read line from the input file
	 * @return
	 */
	public String[] readLine() {
		int a = 0;
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("jmody_assign1/Input.txt"));

			while (scanner.hasNextLine()) {
				a++;
			}
			String[] input = new String[a];

			Scanner sc1 = new Scanner(new File("jmody_assign1/Input.txt"));

			for (int i = 0; i < input.length; i++) {
				input[i] = sc1.nextLine();
				return input;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

