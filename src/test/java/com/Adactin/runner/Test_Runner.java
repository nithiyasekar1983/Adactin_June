package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Adactin.BaseClass;
import com.Adactinsite.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Adactin//feature",
glue="com.Adactin.definition",
monochrome = true, dryRun = false,
strict = false,
tags = ("@SmokeTest,@SanityTest"),
plugin = 
{"html:Report/HTML_Report",
"pretty",
"json:Report/CucumberJSON_Report.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"}
)

public class Test_Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getbrowser();
		
		driver=BaseClass.browserLaunch(browser);

	}
	
	@AfterClass
	public static void tearDown() {
		
					
		driver.close();

	}
}
