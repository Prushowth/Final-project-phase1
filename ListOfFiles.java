package lockedMe.com;

import java.io.File;

public class ListOfFiles {

	public void fileList() {

		File list11 = new File("C:\\Users\\Prushowth\\Desktop\\Simplilearn\\final project phase1\\LockedMe");
		String list2[] = list11.list();
		System.out.println("List of files available:");
		System.out.println("========================");
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
	}
}
