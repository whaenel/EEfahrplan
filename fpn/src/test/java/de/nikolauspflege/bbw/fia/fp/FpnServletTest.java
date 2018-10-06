package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FpnServletTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetSimpleParameterMap() {
		String[] linien = {"s1","s2"};
		Map <String,String[]> inMap = new HashMap <String,String[]> ();
		inMap.put("key", linien);
		Map <String,String> outMap = FpnServlet.getSimpleParameterMap(inMap);
		assertEquals("s2", outMap.get("key"));
	}

}
