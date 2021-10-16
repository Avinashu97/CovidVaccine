package covidvaccination;
import java.util.*;
public class AdenoMenuIterator implements Iterator {
	List<AdenoVirus> adenoVaccines;
	int position = 0;
	public AdenoMenuIterator(List<AdenoVirus> adenoVaccines) {
		this.adenoVaccines = adenoVaccines;
	}

	@Override
	public boolean hasNext() {
		if(position > adenoVaccines.size()) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Vaccine next() {
		AdenoVirus adenoVirus = adenoVaccines.get(position);
		position = position + 1;

		return adenoVirus;

	}

}
