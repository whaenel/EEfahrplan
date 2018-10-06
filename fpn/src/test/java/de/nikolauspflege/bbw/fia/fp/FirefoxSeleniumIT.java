package de.nikolauspflege.bbw.fia.fp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.SeleniumExtension;
import io.github.bonigarcia.SeleniumJupiter;

@ExtendWith(SeleniumExtension.class)
class FirefoxSeleniumIT {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		SeleniumJupiter.config().enableScreenshotAtTheEndOfTests();
		SeleniumJupiter.config().takeScreenshotAsPng();
		SeleniumJupiter.config().setOutputFolder("target/failsafe-reports/images/FireFoxSeleniumIT");
		SeleniumJupiter.config().setRecordingVideoScreenSize("800x640");
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
	    public void testWithOneFirefox(FirefoxDriver driver) {
	        driver.get("http://localhost:9000/fpn");
	        assertTrue(driver.getTitle().contains("Fahrplan"));
		      Select stationSelect  =   new Select(driver.findElementById("myselect"));
		      stationSelect.selectByValue("nikolauspflege");
	       driver.findElementById("submitButton").click();
	      assertTrue(driver.findElementById("optionNikolauspflege").isSelected());
	    }

}
