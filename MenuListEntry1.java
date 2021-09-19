package lockedMe.com;

import java.io.IOException;

public class MenuListEntry1 {
	MenuList ml = new MenuList();
	public void menuEntry1() throws IOException {
	ml.mainMenu();
	int x = ml.option1;
	
	switch (x){
	case 1:
		ListOfFiles lf = new ListOfFiles();
		lf.fileList();
		menuEntry1();
	case 2:
		MenuListEntry2 me2 = new MenuListEntry2();
		me2.menuEntry2();
	case 3:
		System.out.println("Thanks for choosing the application. Exiting now...");
		System.exit(0);
		break;
		
	default:
		System.out.println(" Please choose a valid option");
		System.out.println("------------------------------\n");
		menuEntry1();
	 }
   }	
}
