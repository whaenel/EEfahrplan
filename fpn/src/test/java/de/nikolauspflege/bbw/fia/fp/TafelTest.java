package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TafelTest {


	@Test
	void testTafel() {
		Tafel tafel = new Tafel("stadtmitte");
		//System.out.println(tafel.toString());
		assertTrue(tafel.toString().contains("S1"));
		assertEquals("stadtmitte", tafel.getHaltestelle());
		assertTrue(tafel.getZeitAsString().contains(":"));
		assertEquals(tafel.getZeit().toString(), tafel.getZeitAsString());
		
		tafel =new Tafel(null);
		assertEquals("stadtmitte", tafel.getHaltestelle());
	}

	@Test
	void testGetFahrtenString() {
		Tafel tafel = new Tafel("nikolauspflege");
		Fahrt[] fahrten = tafel.getFahrten();
		assertEquals(3,fahrten.length);
		tafel = new Tafel("carre");
		fahrten = tafel.getFahrten();
		assertEquals(4,fahrten.length);

	}

}
