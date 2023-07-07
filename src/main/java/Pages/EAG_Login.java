package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class EAG_Login extends TestBase {
	/*
	 * WebDriver driver;
	 */ 
	  public EAG_Login() {
		  PageFactory.initElements(driver, this);
	  
		  Jobs job= new Jobs();
	 }
	 

	@FindBy(xpath="//span[normalize-space(text())='Online Login']")
	public WebElement OnlineLogin;
	
	@FindBy(xpath="//input[@id='emailInput']")
	public WebElement enterEmailId;
	
	@FindBy(xpath="//input[@id='submitbutton']")
	public WebElement clickSubmitOnEnteringEmail;
	
	@FindBy(xpath="//input[@name='passwd']")
	public WebElement enterpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement confirmationDialogBoxToProceed;
	
	@FindBy(xpath="//span[normalize-space(text())='Close']")
	public WebElement closeexistingpopup;
}
