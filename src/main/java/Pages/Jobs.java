package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;



public class Jobs extends TestBase{
	
	  public Jobs() { 
		  PageFactory.initElements(driver, this);
	  
	  }
	 
	@FindBy(xpath="//span[contains(normalize-space(),'Add New Job')]")
	public WebElement addNewJob;
	
	@FindBy(xpath="//img[@src=\"assets/icons/SVG/edit.svg\"]")
	public WebElement editJob;
	
	@FindBy(xpath="//img[@src=\"assets/icons/SVG/delete.svg\"]")
	public WebElement deleteJob;
	
	@FindBy(xpath="//img[@src=\"assets/icons/SVG/duplicate.svg\"]")
    public WebElement duplicateJob;
	
	
}
