package covidvaccination;
import java.util.*;
public class PrintLocations implements DisplayPrinter {
	LocationMenu locationMenu;

	public PrintLocations(LocationMenu locationMenu) {
		this.locationMenu = locationMenu;
		// TODO Auto-generated constructor stub
	}
	public void printMenu() {
		StringIterator iter = locationMenu.createIterator();
		printMenu(iter);
	}
	public void printMenu(StringIterator iterator) {
		System.out.println("\n\n-------------Location to get vaccinated------------------\n\n");
		while(iterator.hasNext()) {
			System.out.println("Error here");
			Location location = iterator.next();
			System.out.print(location);
		}
	}
}
