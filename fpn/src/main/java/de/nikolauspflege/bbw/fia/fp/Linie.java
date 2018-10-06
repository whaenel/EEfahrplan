package de.nikolauspflege.bbw.fia.fp;

public class Linie {
	private final String name;
	
	Linie(String name ){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
