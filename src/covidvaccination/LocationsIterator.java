package covidvaccination;
import java.util.*;
public class LocationsIterator implements StringIterator {
	List<Location> locations;
	int position = 0;
	public LocationsIterator(List<Location> locations) {
		// TODO Auto-generated constructor stub
		this.locations = locations;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position > locations.size()) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Location next() {
		// TODO Auto-generated method stub
		Location location = locations.get(position);
		position = position + 1;
		return location;
	}

}
