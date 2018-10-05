package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;
import net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import net.sourceforge.jwebunit.junit.WebTester;

@Tag("integration")
class SimpleJWebUnit {
	private WebTester tester;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		BrowserVersion myBrowserVersion = BrowserVersion.BEST_SUPPORTED;
        tester = new WebTester()  ;
        tester.setBaseUrl("http://localhost:9000/fpn");

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIndexJSP() {
        tester.beginAt("/");
        //clickLink("login");
        tester.assertTitleEquals("Fahrplan");
        //setTextField("username", "test");
        //setTextField("password", "test123");
        //submit();
        //assertTitleEquals("Welcome, test!");	
    }

}
