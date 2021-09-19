package lockedMe.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filecreation {

	Scanner sc = new Scanner(System.in);

	public void newFileCreate() throws IOException {
		System.out.println("Enter the Filename to be created");
		String newFileName = sc.next();
		File newFile = new File(
				"C:\\Users\\Prushowth\\Desktop\\Simplilearn\\final project phase1\\LockedMe\\" + newFileName + ".txt");
		if (newFile.createNewFile()) {
			System.out.println("New file created");
		} else {
			System.out.println("file Already Exist");
		}
		FileWriter writer = new FileWriter(newFile);
		System.out.println("Enter the data");
		String data1 = sc.next();
		writer.write(data1);
		System.out.println("Data added to the file " + data1);
		writer.close();
	}

}
