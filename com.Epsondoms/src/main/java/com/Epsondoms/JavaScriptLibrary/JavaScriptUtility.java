package com.Epsondoms.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Epsondoms.WebDriverLibrary.WebDriverUtility;


public class JavaScriptUtility {

	public static JavascriptExecutor javascriptobj;

	public static void enteDataDisabledElement(WebElement element, String data) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver;
		javascriptobj.executeScript("argument[0].value='" + data + "'", element);
	}

	public static void ClickDisabledElement(WebElement element) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver;
		javascriptobj.executeScript("argument[0].click", element);
	}

	public static void defaultVerticalScrollBy() {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}

	public static void defaultVerticalScrollTo() {

		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}

	public static void scrollUsingView(WebElement element, boolean value) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver;

		javascriptobj.executeScript("arguments[0].scrollIntoView(" + value + ")", element);
	}

}
