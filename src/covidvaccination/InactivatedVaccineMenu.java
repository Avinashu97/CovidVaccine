package covidvaccination;

import java.util.ArrayList;
import java.util.List;

public class InactivatedVaccineMenu {

	List<InactivatedVaccine> inactivatedMenu;
	public InactivatedVaccineMenu() {
		inactivatedMenu = new ArrayList<InactivatedVaccine>();
		inactivatedMenu.add(new CoronaVac());
		inactivatedMenu.add(new Covaxin());
		inactivatedMenu.add(new BBIBPCorv());



	}
	public Iterator createIterator() {
		return new InactivatedVaccineIterator(inactivatedMenu);
	}
}
