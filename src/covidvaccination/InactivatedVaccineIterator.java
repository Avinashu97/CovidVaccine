package covidvaccination;
import java.util.*;
public class InactivatedVaccineIterator implements Iterator {
	List<InactivatedVaccine> inactivedVaccines;
	int position = 0;

	public InactivatedVaccineIterator(List<InactivatedVaccine> inactivedVaccines) {
		this.inactivedVaccines = inactivedVaccines;
	}
	@Override
	public boolean hasNext() {
		if(position > inactivedVaccines.size()) {
			return false;
		}
		else {
			return true;
		}

	}

	@Override
	public Vaccine next() {
		InactivatedVaccine inactivatedVaccine = inactivedVaccines.get(position);
		position = position + 1;
		return inactivatedVaccine;
	}

}