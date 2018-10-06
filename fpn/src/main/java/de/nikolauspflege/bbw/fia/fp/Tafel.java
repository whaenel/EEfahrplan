package de.nikolauspflege.bbw.fia.fp;

public class Tafel {


	private final Fahrt[] fahrten;
	private final Zeit zeit ;
	private final String haltestelle;

	
	Tafel(String haltestelle){
		if (haltestelle == null) {
			haltestelle = "stadtmitte";
		}

		fahrten = getFahrten(haltestelle);
		zeit = new Zeit();
		this.haltestelle = haltestelle;
	}

	public Zeit getZeit() {
		return zeit;
	}
	public String getZeitAsString() {
		return zeit.toString();
	}
	public String getHaltestelle() {
		return haltestelle;
	}
	public Fahrt[] getFahrten() {
		return fahrten;
	}
	public String toString() {
		String tString = "Haltestelle: " +haltestelle+"\n";
		for (int i = 0; i < fahrten.length; i++) {
			tString += fahrten[i].toString()+"\n";
		}
		return tString;
	}
	static Fahrt[] getFahrten(String haltestelle) {
		Fahrt[] fahrtenHaltestelle=null;
		switch (haltestelle) {
		case "stadtmitte":
			fahrtenHaltestelle = new Fahrt[3];
			fahrtenHaltestelle[0] = new Fahrt("S1", "Herrenberg", "11","34");
			fahrtenHaltestelle[1] = new Fahrt("S60", "Böblingen", "11","37");
			fahrtenHaltestelle[2] = new Fahrt("S1", "Kirchheim", "11","44");
			
			break;
		case "nikolauspflege":
			fahrtenHaltestelle = new Fahrt[3];
			fahrtenHaltestelle[0] = new Fahrt("40", "Vogelsang", "11","34");
			fahrtenHaltestelle[1] = new Fahrt("40", "Hauptbahnhof", "11","37");
			fahrtenHaltestelle[2] = new Fahrt("40", "Vogelsang", "11","44");

			break;
		case "carre":
			fahrtenHaltestelle = new Fahrt[4];
			fahrtenHaltestelle[0] = new Fahrt("S1", "Herrenberg", "11","34");
			fahrtenHaltestelle[1] = new Fahrt("S2", "Waiblingen", "11","37");
			fahrtenHaltestelle[2] = new Fahrt("S3", "Flughafen", "11","44");
			fahrtenHaltestelle[3] = new Fahrt("S1", "Kirchheim", "11","55");
			break;
		}
		return fahrtenHaltestelle;
		
	}
}
