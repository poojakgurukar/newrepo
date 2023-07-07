package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		try {
			prop= new Properties();
			FileInputStream fin= new FileInputStream("D:\\eclipse_fold\\SLB_Automation\\src\\main\\java\\Config\\config.properties");
			prop.load(fin);
		}catch(FileNotFoundException file) {
			file.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		switch(browsername){
			case "ie" : 
				 driver=new InternetExplorerDriver();
			break;
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.setAcceptInsecureCerts(true);
				driver = new ChromeDriver(options);
			break;
			default:
				 driver = new FirefoxDriver();
			break;
			}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}
