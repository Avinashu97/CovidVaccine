package covidvaccination;

import java.util.ArrayList;
import java.util.List;

public class SubunitMenu {
	List<SubunitVaccine> subunitMenu;
	public SubunitMenu() {
		subunitMenu = new ArrayList<SubunitVaccine>();
		subunitMenu.add(new EpiVacCorona());
		subunitMenu.add(new Novavax());
		subunitMenu.add(new Soberena());


	}
	public Iterator createIterator() {
		return new SubUnitMenuIterator(subunitMenu);
	}

}
