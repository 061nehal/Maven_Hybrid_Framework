package Operation;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UIOperation extends Abstract {
	
	public UIOperation (WebDriver driver) {
		
		Abstract.driver=driver;
	}
	public void keyWordPerform(Properties p,String KeyWord, String ObjectName, String ObjectType, String Data) throws Exception {
		
		switch(KeyWord.toUpperCase()) {
		
		case "GOTOURL":
			driver.get(p.getProperty(Data));
			break;
			
		case "SENDKEYS":
			driver.findElement(this.getObject(p, ObjectName, ObjectType)).sendKeys(Data);
			break;
		case "SELECT":
			Select select=new Select(driver.findElement(this.getObject(p, ObjectName, ObjectType)));
			select.selectByVisibleText(Data);
			break;
		case "CLICK":
			driver.findElement(this.getObject(p, ObjectName, ObjectType)).click();
			break;
		case "CLEAR":
			driver.findElement(this.getObject(p, ObjectName, ObjectType)).clear();
			break;
		case "ALERTHANDLING":
			Alert alt=driver.switchTo().alert();
			System.out.println("Alert Text is : "+alt.getText());
			alt.accept();
			//alt.dismiss();
		case "SUBMENUHANDLING":
			WebElement sm=driver.findElement(this.getObject(p, ObjectName, ObjectType));
			Actions act =new Actions(driver);
			act.moveToElement(sm).build().perform();
			break;
			
		case "CHILDWINDOW1":
			ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab1.get(1));
			break;
		case "CHILDWINDOW2":
			ArrayList<String>tab2=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab2.get(2));
			break;
		case "CHILDWINDOW":
			ArrayList<String>tab3=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab3.get(3));
			break;
		case "MAINWINDOW":
			ArrayList<String>tab0=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab0.get(0));
			break;
		case "SCREENSHOT":
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("D:\\ITTraining\\ScreenShot\\websitescreenshot.jpg"));
			break;
		case "HIGHLIGHT":
			WebElement fname=driver.findElement(this.getObject(p, ObjectName, ObjectType));
			JavascriptExecutor jse=((JavascriptExecutor)driver);
			jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", fname);
		    break;
		case "THREAD":
			Thread.sleep(4000);
			break;
		case "CLOSE":
			driver.close();
			break;
		case "QUIT":
			driver.quit();
			break;
		
		}
		
	}
	private By getObject(Properties p, String ObjectName, String ObjectType) throws Exception {
		
		if(ObjectType.equalsIgnoreCase("ID")) {
			return By.id(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("NAME")) {
			return By.name(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("XPATH")) {
			return By.xpath(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("TAGNAME")) {
			return By.tagName(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("CLASS")) {
			return By.className(p.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(p.getProperty(ObjectName));
		}	
		else {
			throw new Exception("Wrong Object Type");
		}
	}

}
