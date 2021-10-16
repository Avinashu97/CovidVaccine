package covidvaccination;

import java.util.ArrayList;
import java.util.List;

public class AdenoVirusMenu {

	List<AdenoVirus> adenoVirusMenu;
	public AdenoVirusMenu() {
		adenoVirusMenu = new ArrayList<AdenoVirus>();
		adenoVirusMenu.add(new AstraZeneca());
		adenoVirusMenu.add(new Sputnik());
		adenoVirusMenu.add(new Janssen());
		adenoVirusMenu.add(new Covidecia());


	}
	public Iterator createIterator() {
		return new AdenoMenuIterator(adenoVirusMenu);
	}

}
