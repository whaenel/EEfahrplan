package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FpnServletTest {


	@Test
	void testGetSimpleParameterMap() {
		String[] linien = {"s1","s2"};
		Map <String,String[]> inMap = new HashMap <String,String[]> ();
		inMap.put("key", linien);
		Map <String,String> outMap = FpnServlet.getSimpleParameterMap(inMap);
		assertEquals("s2", outMap.get("key"));
	}

}
