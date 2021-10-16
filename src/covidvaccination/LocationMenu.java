package covidvaccination;

import java.util.*;

public class LocationMenu {
	List<Location> locations;
	public LocationMenu() {
		// TODO Auto-generated constructor stub


	locations = new ArrayList<Location>();
	locations.add(new Location("Chicago"));
	locations.add(new Location("Austin"));
	locations.add(new Location("New York"));
	locations.add(new Location("MaryLand"));
	locations.add(new Location("Texas"));
}

	public StringIterator createIterator() {
		return new LocationsIterator(locations);
	}

}
