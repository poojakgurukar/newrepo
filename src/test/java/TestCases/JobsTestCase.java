package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.EAG_Login;
import Pages.Jobs;

public class JobsTestCase extends TestBase {
	EAG_Login eag_login;
	Jobs job;

	public JobsTestCase() {
		super();
	}

	@BeforeSuite
	public void setUp() {
		initialization();
		eag_login = new EAG_Login();
		job = new Jobs();
	}

	@Test(priority = 1)
	public void eagLogin() throws InterruptedException, MalformedURLException {
		Actions action = new Actions(driver);
		// code goes in

		Thread.sleep(2000);

		action.sendKeys(Keys.ENTER).perform();
		// action.sendKeys(Keys.ENTER).build().perform();
		// eag_login.confirmationDialogBoxToProceed.sendKeys(Keys.ENTER);
		// new WebDriverWait(driver,
		// Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(eag_login.confirmationDialogBoxToProceed));
		/*
		 * 
		 * Thread.sleep(3000); action.sendKeys(Keys.ENTER).perform();
		 */
		Thread.sleep(5000);
		String gettoken = driver.getCurrentUrl();
		URL url = new URL(gettoken);
		System.out.println(url.getFile());
		driver.get("https://172.30.113.10:8080" + url.getFile());
	}

	@Test(priority = 2)
	public void goToAddNewJobPage() throws InterruptedException {
		Thread.sleep(4000);
		eag_login.closeexistingpopup.click();
		/*
		 * Thread.sleep(4000); eag_login.closeexistingpopup.click();
		 */job.addNewJob.click();
	}
}
