package com.Epsondoms.Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTest {
	@Test
	public void DemoTesting() {

		// create The SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing For the RegisterPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);

		// create the Extent Report
		ExtentReports report = new ExtentReports();

		// Attach the spark Report and ExtentReport
		report.attachReporter(spark);

		// configure the system information in Extent Report
		report.setSystemInfo("DeviceName", "Harry");
		report.setSystemInfo("OperatingSystem", "WINDOWS11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("BrowserVersion", "chrome-130.0.6723.92");

		// createthe the test information
		ExtentTest test = report.createTest("RegressiotestnTest");

		// steps information
		test.log(Status.INFO, "Step 1 : Launching The Browser Successfully");
		test.log(Status.INFO, "Step 2 :Navigating To Application via URL Successful");
		test.log(Status.INFO, "Step 3 :Verified The WebPage Successfully");

		if ("Harry".equals("Harry")) {
			test.log(Status.PASS, "Step 4:Verified The WebElements Displayed");
		} else {
			test.log(Status.FAIL, "Step 4:Verified the WebElements Not Displayed");
		}

		test.log(Status.SKIP, "Step 5:Element is Hidden");

		// Flush the Report Information
		report.flush();

		System.out.println("Execution Done");

	}

	@Test
	public void DemoTesting1() {

		// create The SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing For the RegisterPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);

		// create the Extent Report
		ExtentReports report = new ExtentReports();

		// Attach the spark Report and ExtentReport
		report.attachReporter(spark);

		// configure the system information in Extent Report
		report.setSystemInfo("DeviceName", "Harry");
		report.setSystemInfo("OperatingSystem", "WINDOWS11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("BrowserVersion", "chrome-130.0.6723.92");

		// createthe the test information
		ExtentTest test = report.createTest("RegressiotestnTest");

		// steps information
		test.log(Status.INFO, "Step 1 : Launching The Browser Successfully");
		test.log(Status.INFO, "Step 2 :Navigating To Application via URL Successful");
		test.log(Status.INFO, "Step 3 :Verified The WebPage Successfully");

		if ("Harry".equals("Harry")) {
			test.log(Status.PASS, "Step 4:Verified The WebElements Displayed");
		} else {
			test.log(Status.FAIL, "Step 4:Verified the WebElements Not Displayed");
		}

		// test.log(Status.SKIP, "Step 5:Element is Hidden");

		// Flush the Report Information
		report.flush();

		System.out.println("Execution Done");

	}

	@Test
	public void DemoTesting2() {

	}

	@Test
	public void DemoTesting3() {

	}

	@Test
	public void DemoTesting4() {

	}

	@Test
	public void DemoTesting5() {

	}
}
