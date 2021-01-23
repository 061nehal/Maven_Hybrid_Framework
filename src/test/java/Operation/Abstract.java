package Operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abstract {
	
	protected static WebDriver driver;
	
	@BeforeTest
	
	public void setup () {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
	      WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	

	
}
