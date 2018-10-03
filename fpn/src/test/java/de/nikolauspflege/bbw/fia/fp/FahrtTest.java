package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("development")
class FahrtTest {
	Fahrt testFahrt = new Fahrt("S1", "Herrenberg", "11","34");

	@Test
	void testSetLinie() {
		String lineString = "S2";
		Linie line = new Linie(lineString);
		testFahrt.setLinie(line);
		assertTrue (line == testFahrt.getLinie());
	}

	@Test
	void testSetZiel() {
		Ziel ziel = new Ziel("Böblingen");
		testFahrt.setZiel(ziel);
		assertEquals("Böblingen", testFahrt.getZiel().toString());
	}

	@Test
	void testSetZeit() {
		Zeit zeit = new Zeit();
		testFahrt.setZeit(zeit);
		assertEquals( zeit.toString(), testFahrt.getZeit().toString(), "time not as expected");
	}

}
