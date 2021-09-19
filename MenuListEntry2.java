package lockedMe.com;

import java.io.IOException;
public class MenuListEntry2 {
	MenuList ml = new MenuList();
	public void menuEntry2() throws IOException {
		ml.secondaryMenu();
		int y = ml.option2;
		switch (y) {
		case 1:
			Filecreation fc = new Filecreation();
			fc.newFileCreate();
			menuEntry2();
		case 2:
			FileDeletion fd = new FileDeletion();
			fd.filedelete();
			menuEntry2();
		case 3:
			FileSearch fs = new FileSearch();
			fs.filesearch1();
			menuEntry2();
		case 4:
			MenuListEntry1 me1 = new MenuListEntry1();
			me1.menuEntry1();

		default:
			System.out.println(" Please choose a valid option");
			System.out.println("------------------------------\n");
			menuEntry2();
		}
	}
}
