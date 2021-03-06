package de.nikolauspflege.bbw.fia.fp;

public class Fahrt {
	public static String attributName = "fahrten";
	
	public Linie linie;
	public Ziel ziel;
	public Zeit zeit;
	
	public Fahrt(String linie , String endhaltestelle, String stunden, String minuten){
		this.linie = new Linie ( linie);
		this.ziel = new Ziel (endhaltestelle);
		this.zeit = new Zeit( Integer.parseInt(stunden),Integer.parseInt(minuten));
	}
	public Linie getLinie() {
		return linie;
	}

	public void setLinie(Linie linie) {
		this.linie = linie;
	}

	public Ziel getZiel() {
		return ziel;
	}

	public void setZiel(Ziel ziel) {
		this.ziel = ziel;
	}

	public Zeit getZeit() {
		return zeit;
	}

	public void setZeit(Zeit zeit) {
		this.zeit = zeit;
	}

}
