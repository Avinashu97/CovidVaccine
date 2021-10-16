package covidvaccination;
import java.util.*;
public class RNAVaccineMenu {
	List<RNAVaccine> rnaVaccineMenu;
	public RNAVaccineMenu() {
		rnaVaccineMenu = new ArrayList<RNAVaccine>();
		rnaVaccineMenu.add(new Pfizer());
		rnaVaccineMenu.add(new Moderna());


	}
	public Iterator createIterator() {
		return new RNAMenuIterator(rnaVaccineMenu);
	}

}
