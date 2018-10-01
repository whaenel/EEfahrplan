package de.nikolauspflege.bbw.fia.fp;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zeit {
	LocalTime zeit;
	
	Zeit(){
		zeit=LocalTime.now();
	}
	Zeit(int hour, int minute ){
		zeit = LocalTime.of(hour, minute,0);
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return zeit.format(formatter);
	}

}
