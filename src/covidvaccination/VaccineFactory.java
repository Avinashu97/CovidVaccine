package covidvaccination;
import java.util.Scanner;
public class VaccineFactory {

	public VaccineFactory() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n ---------------- Select location For Vaccination -----------------\n"
				+ "1) Places"
				+ "2) Home Screen");
		int inputChoice = input.nextInt();

		if(inputChoice == 1) {
			LocationMenu locationMenu = new LocationMenu();
			PrintLocations printLocation = new PrintLocations(locationMenu);
			printLocation.printMenu();
		}
	}

}
