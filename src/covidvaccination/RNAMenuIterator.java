package covidvaccination;
import java.util.*;
public class RNAMenuIterator implements Iterator {
	List<RNAVaccine> rnaVaccines;
	int position = 0;
	public RNAMenuIterator(List<RNAVaccine> rnaVaccines) {
		this.rnaVaccines = rnaVaccines;
	}

	@Override
	public boolean hasNext() {
		if(position >= rnaVaccines.size()) {
			return false;
		}
		else {
			return true;
		}

	}

	@Override
	public Vaccine next() {
		RNAVaccine rnaVaccine = rnaVaccines.get(position);
		position = position + 1;
		return rnaVaccine;

	}

}
