package lockedMe.com;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
	static Scanner sc = new Scanner(System.in);

	public void filesearch1(){
		StringBuffer sb = new StringBuffer();
		File list1 = new File("C:\\Users\\Prushowth\\Desktop\\Simplilearn\\final project phase1\\LockedMe");
		String list2[] = list1.list();
		System.out.println("Enter the file name to be searched");
		sb.delete(0, sb.length());
		sb.append(sc.next());
		sb.append(".txt");

		LinearSearch ls = new LinearSearch();
		int result = ls.search(list2, sb);

		if (!(result == -1)) {
			System.out.print("File is present at the location");
		} else {
			System.out.print("File not found");
		}
	}
}
