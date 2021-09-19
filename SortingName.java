package lockedMe.com;

import java.io.File;

public class SortingName {
	public String[] sort1() {
		File list1 = new File("C:\\Users\\Prushowth\\Desktop\\Simplilearn\\final project phase1\\LockedMe");
		String list3[] = list1.list();
		int n = list3.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list3[j].length() > list3[j + 1].length()) {
					String temp = list3[j];
					list3[j] = list3[j + 1];
					list3[j + 1] = temp;
				}
			}
		}
		return list3;
	}

}
