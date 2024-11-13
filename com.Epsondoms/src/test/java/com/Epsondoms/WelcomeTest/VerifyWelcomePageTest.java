package com.Epsondoms.WelcomeTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Epsondoms.ExcelFileLibrary.ReadExcelFile;
import com.Epsondoms.GenericLibrary.BaseTest;
import com.Epsondoms.JavaLibrary.JavaUtility;
import com.Epsondoms.PageRepository.WelcomePage;
import com.Epsondoms.WebDriverLibrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class VerifyWelcomePageTest extends BaseTest {

//	ExtentSparkReporter spark;
//	ExtentReports report;
//	ExtentTest test;

	@Test(priority = 1)
	public void verifyWelcomepageWithValidinput() {
		
		//create the Test Information
		test = report.createTest("verifyWelcomepageWithValidinput");
		
		//steps Information
		test.log(Status.INFO, "<<--Execution Started Successfully-->>");
		
		//Execute the precondition-->>1.Launch The Browser 2.Navigate to URL
		test.log(Status.INFO, "Step1: Launching the browser sucessful");
		
		//implicit wait
		WebDriverUtility.waitImplicitly(20);
		
		//Verify The welcome Page Using Title
//		String exptitle = "Learning Selenium";
//		String acttitle = webdriverobj.driver.getTitle();
		
		Assert.assertEquals(WebDriverUtility.driver.getTitle(), "Learning Selenium");
		test.log(Status.PASS, "Title Verified");
		
		//create an object for PageManager
		pageManagementobj =

//		if(exptitle.equals(actualtitle)) {
//			Reporter.log("Title is " + actualtitle);
//		}
//		else {
//			Reporter.log("fail to get title");
//		}


		// create an object for pagemanager
		

		// closing the browser

		// create object for the class

		  WelcomePage welcome = new WelcomePage(WebDriverUtility.driver);

		// verify the text field
		boolean result = welcome.getNamefield().isDisplayed();
//		if(result) {
//			Reporter.log("Name field is verified");
//		}
//		else {
//			Reporter.log("Name field is not verified");
//		}

		Assert.assertTrue(result);

		// perform action clear
		welcome.getNamefield().clear();
		test.log(Status.PASS, "name field is cleared");

		// perform send keys
		welcome.getNamefield().sendKeys("name");
		Reporter.log("entered the name");

		// Enter email address
		welcome.getEmailtextfield().sendKeys("dilleswararaomodalavalasa@gmail.com");

		// Enter Password
		welcome.getPasswordtextfield().sendKeys("pasword");

		// Enter mobileNo
		welcome.getMobileno().sendKeys("8977392305");

		// Enter dateofbirth
		welcome.getDateOfBirth().sendKeys("01-01-2020 17:10");
		// welcome.getDateOfBirth().click();

		// Select Gender
		welcome.getGendermale().click();
		test.log(Status.PASS, "Gender is selected");

		// Select place
		welcome.getStatebengalore().click();
		test.log(Status.PASS, "place is selected");

		// select country
		welcome.getFirstcountry();

		JavaUtility.pause(5000);

		// Soft Assert Statement
		SoftAssert softassertobj = new SoftAssert();

		// verify the name field

		// softassertobj.assertEquals("contact",
		// initWelcomepage().getContactus().getText());
		test.log(Status.PASS, "Step4: verifyied text successfully contact us hyperlink");
		softassertobj.assertAll();

		// terminate the browser
		BaseTest.terminateBrowser();
		test.log(Status.PASS, "Browser is terminated");

	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "verifyWelcomepageWithValidinput")
	public void verifyWelcomePagewithinValidInput() {
		test = report.createTest("verifyWelcomePagewithinValidInput");

		test.log(Status.PASS, "Execution started sucessfully Test 2");
		WebDriverUtility.waitImplicitly(20);

		String exptitle = "Learning Selenium";
		String actualtitle = WebDriverUtility.driver.getTitle();

		Assert.assertEquals(actualtitle, exptitle);
		test.log(Status.PASS, "title verified");

		// to make the exlicit test script fail
		Assert.fail();

		test.log(Status.PASS, "Execution is completed");
	}

}
