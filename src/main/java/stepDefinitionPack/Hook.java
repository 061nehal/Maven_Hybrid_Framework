package stepDefinitionPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends AbstracClassCucumber{
	
		
		
		
		@Before
		public void setup () {
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		      WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			//WebDriverManager.firefoxdriver().setup();
			//driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}

		@After
		public void teardown() {
			driver.close();
		}
}
