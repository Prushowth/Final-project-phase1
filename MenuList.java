package lockedMe.com;

import java.io.IOException;
import java.util.Scanner;

public class MenuList {

	Scanner sc = new Scanner(System.in);
	public int option1;
	public int option2;

	public void mainMenu() throws IOException {
		System.out.println("*****************LOCKEDME APPLICATION*******************");
		System.out.println("*======================================================*"
				+ "\n*      Enter the value to choose the below option      *");
		System.out.println("*======================MAIN MENU=======================*");
		System.out.println("*  1. List of available files                          *"
				+ "\n*  2. Business-level operations                        *"
				+ "\n*  3. Exit the Application                             *");
		System.out.println("*======================================================*");
		System.out.println("*--------------------------Developed by Prushowthaman--*");
		System.out.println("********************************************************");

		if (sc.hasNextInt()) {
			option1 = sc.nextInt();
		} else {
			System.out.println(" Please enter the valid input");
			System.out.println("-------------------------------\n");
			MenuListEntry1 me = new MenuListEntry1();
			me.menuEntry1();
		}
	}

	public void secondaryMenu() throws IOException {

		System.out.println();
		System.out.println("********************************************************"
				+ "\n*      Enter the value to choose the below option      *");
		System.out.println("*=============BUISINESS LEVEL OPERATIONS===============*");
		System.out.println("* 1. Add file to the application                       *"
				+ "\n* 2. Delete a file from the application                *"
				+ "\n* 3. Search a file from the application                *"
				+ "\n* 4. Exit to the main menu                             *");
		System.out.println("*======================================================*");
		System.out.println("*--------------------------Developed by Prushowthaman--*");
		System.out.println("********************************************************");

		if (sc.hasNextInt()) {
			option2 = sc.nextInt();
		} else {
			System.out.println(" Please enter the valid input");
			System.out.println("-------------------------------\n");
			MenuListEntry2 me = new MenuListEntry2();
			me.menuEntry2();
		}
	}
}
