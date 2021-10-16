package covidvaccination;
import java.util.*;
public class SubUnitMenuIterator implements Iterator {
	List<SubunitVaccine> subunitVaccines;
	int position = 0;
	public SubUnitMenuIterator(List<SubunitVaccine> subunitVaccines) {
		// TODO Auto-generated constructor stub
		this.subunitVaccines = subunitVaccines;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position > subunitVaccines.size()) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Vaccine next() {
		// TODO Auto-generated method stub
		SubunitVaccine subunitVaccine = subunitVaccines.get(position);
		position = position + 1;
		return subunitVaccine;
	}

}
