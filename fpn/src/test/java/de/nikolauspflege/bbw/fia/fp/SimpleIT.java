package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("integration")
class SimpleIT {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		setBaseUrl("http://localhost:9000/fpn");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIndexJSP() {
        beginAt("/");
        //clickLink("login");
        assertTitleEquals("Fahrplan");
        //setTextField("username", "test");
        //setTextField("password", "test123");
        //submit();
        //assertTitleEquals("Welcome, test!");	
    }

}
