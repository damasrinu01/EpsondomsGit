package com.Epsondoms.WebDriverLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

	public static WebDriver driver;
	public static WebDriver driver_static;
	public static Select selectobj;
	public static Actions actionsobj;
	public static Robot robotobj;
	public static WebDriverWait wait;
	

	public static void LaunchtheBrowsere(String browser) {
		switch (browser) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static=driver;
			break;
		case "edge":
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
			driver_static=driver;
			break;
		case "firefox":
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			driver_static=driver;
			break;

		default:
			System.out.println("browser is not found");
			break;
		}
	}

	public static void naviganeToapplication(String url) {
		driver.get(url);
	}

	public static void maxmize() {
		driver.manage().window().maximize();
	}

	public static void CloseTheBrowser() {
		driver.close();
	}

	public static void End() {
		driver.quit();
	}

	public static void waitImplicitly(long duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	public static void waitExpitily(long duration,WebElement element) {
		wait = new WebDriverWait(driver,duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void SelectOptionInDropdown(WebElement element, int index) {
		selectobj.selectByIndex(index);
	}

	public void SelectOptionInDropdown(String visible, WebElement element) {
		selectobj.selectByVisibleText(visible);
	}

	public void SelectOptionInDropdown(WebElement element, String value) {
		selectobj.deselectByValue(value);
	}

	public void mouseHandling(WebElement element) {
		actionsobj.moveToElement(element);
	}

	public void keypress(WebElement element) {
		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

	public void keyrelese(WebElement element) {
		robotobj.keyPress(KeyEvent.VK_PAGE_UP);
	}

	public void Acceptalertpopup() {
		driver.switchTo().alert().accept();
	}

	public void Dismisalertpopup() {
		driver.switchTo().alert().dismiss();
	}

	public void FrameSwitchControle(int index) {
		driver.switchTo().frame(index);
	}

	public void FrameSwitchControle(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void FrameSwitchControle(String str) {
		driver.switchTo().frame(str);
	}

	public void SwitchBackTomain() {
		driver.switchTo().defaultContent();
	}

	public void SwitchControleToWindow(String windowadress) {

		driver.switchTo().window(windowadress);
	}

}
