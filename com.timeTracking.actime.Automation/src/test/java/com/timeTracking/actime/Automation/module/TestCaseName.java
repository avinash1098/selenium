package com.timeTracking.actime.Automation.module;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseName {
	@Test
	
	public void testCaseName() {
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
	}
	

}
