package com.Epsondoms.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Epsondoms.ExcelFileLibrary.ReadExcelFile;
import com.Epsondoms.WebDriverLibrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	// public static WebDriver driver;
	public PageManagement pageManagementobj;
	public WebDriverUtility webdriverobj;
	public ReadExcelFile excelUtilityobj;
	public static String username;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void suiteSetup() {
		//create the spark report
		spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//configure the sparkReport information
		spark.config().setDocumentTitle("")
		spark.config().setDocumentTitle(""))
		
		
		test = report.createTest("Regressiontest");
		test.log(Status.INFO, "Ste1: Launching the browser sucessful");

		String name = ReadExcelFile.readSingleData("RegesterData", 1, 1);
		// step to launch the browser by
		/*
		 * Execute the Precondintion 1. Launch the Browser 2. Navigate to URl
		 */

		// Call the
		// BaseTest.browserSetup("chrome");

		// wait statement
		WebDriverUtility.waitImplicitly(20);

	}

	@AfterSuite
	public void terminateSuite() {
		report.flush();
	}

	@Parameters({ "browsername", "weburl" })
	@BeforeClass
	public static void browserSetup(String browser, String url) {
		//craete object for all the repository/utility
		createObjects();
		
		//Fetch THe USername from Excel FIle
		username = excelUtilityobj.readSingleData("RegesterData", 1, 1);

		WebDriverUtility.LaunchtheBrowsere(browser);

		// Maximize the browser
		WebDriverUtility.maxmize();

		// step wit
		WebDriverUtility.waitImplicitly(20);

		// step to navigate
		// driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Selenium_M9/selenium/com.Epsondoms/src/main/resources/Softwares/webpage.html");
		// String url=ReadPropertyFile.readData("weburl");
		// String
		// url="file:///C:/Users/DELL/OneDrive/Desktop/Selenium_M9/selenium/com.Epsondoms/src/main/resources/Softwares/webpage.html";
		WebDriverUtility.naviganeToapplication(url);
		Reporter.log("Navigated to application");

	}

	// closing the browser using this method
	public static void terminateBrowser() {
		//STep 10
		
	WebDriverUtility.CloseTheBrowser();
	}

}
