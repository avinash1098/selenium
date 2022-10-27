package com.timeTracking.actime.Automation.genriccUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database connection has been established");
	}
	@BeforeClass
	public void bcConfig() {
		System.out.println("browser launched");
		System.out.println("navigate to url");
	}
	@BeforeMethod
	public void baConfig() {
		System.out.println("login");
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("logout");
	}
	@AfterClass
	public void acConfig() {
		System.out.println("close browser");
	}
	@AfterSuite
	public void abConfig() {
		System.out.println("database connection has been closed");
	}

}
