package com.Epsondoms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[id='name']")
	private WebElement namefield;

	@FindBy(css = "input[id='email']")
	private WebElement emailtextfield;

	@FindBy(css = "input[id='password']")
	private WebElement passwordtextfield;

	@FindBy(css = "input[id='mobile']")
	private WebElement mobileno;

	@FindBy(linkText = "Contact Us")
	private WebElement contactuslink; 

	@FindBy(xpath = "//input[@name='dob']")
	WebElement dateofbirth;

	@FindBy(css = "tbody tr:nth-child(6) td:nth-child(2) [id='male']")
	WebElement gendermale;

	@FindBy(css = "tbody tr:nth-child(6) td:nth-child(2) [id='female']")
	WebElement genderfemale;

	@FindBy(xpath = "//input[@id='goa']")
	WebElement stategoa;

	@FindBy(xpath = "//input[@id='bangalore']")
	WebElement statebengalore;

	@FindBy(xpath = "//input[@id='kerala']")
	WebElement statekerala;

	@FindBy(xpath = "//input[@id='manali']")
	WebElement statemanali;

	@FindBy(xpath = "//select[@name='country1']")
	WebElement firstcountry;

	@FindBy(xpath = "//select[@name='country2']")
	WebElement seccountry;

	@FindBy(xpath = "//label[@for='feedback']")
	WebElement feedbacktextfield;

	@FindBy(xpath = "//input[@name='photo']")
	WebElement photo;

	public void setNamefield(WebElement namefield) {
		this.namefield = namefield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getGendermale() {
		return gendermale;
	}

	public void setGendermale(WebElement gendermale) {
		this.gendermale = gendermale;
	}

	public WebElement getGenderfemale() {
		return genderfemale;
	}

	public WebElement getFirstcountry() {
		Select sel = new Select(firstcountry);

		System.out.println("pass the value as ind to select India");
		sel.selectByValue("ind");
		return firstcountry;

	}

	public void setFirstcountry(WebElement firstcountry) {
		this.firstcountry = firstcountry;
	}

	public WebElement getFeedbacktextfield() {
		return feedbacktextfield;
	}

	public void setFeedbacktextfield(WebElement feedbacktextfield) {
		this.feedbacktextfield = feedbacktextfield;
	}

	public WebElement getPhoto() {
		return photo;
	}

	public void setPhoto(WebElement photo) {
		this.photo = photo;
	}

	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getContactuslink() {
		return contactuslink;
	}

	public WebElement getStategoa() {
		return stategoa;
	}

	public void setStategoa(WebElement stategoa) {
		this.stategoa = stategoa;
	}

	public WebElement getStatebengalore() {
		return statebengalore;
	}

	public void setStatebengalore(WebElement statebengalore) {
		this.statebengalore = statebengalore;
	}

	public WebElement getStatekerala() {
		return statekerala;
	}

	public void setStatekerala(WebElement statekerala) {
		this.statekerala = statekerala;
	}

	public WebElement getStatemanali() {
		return statemanali;
	}

	public void setStatemanali(WebElement statemanali) {
		this.statemanali = statemanali;
	}

	public WebElement getDateOfBirth() {
		return dateofbirth;

	}

}
