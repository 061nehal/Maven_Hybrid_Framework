package stepDefinitionPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OurWebSiteDataTableStepDefinition extends AbstracClassCucumber{
	

@Given("^I am on our website webpage$")
public void i_am_on_our_website_webpage() {
	driver.get("file:///D:/ITTraining/OurWebSite.html");
   
}
@When("^I enter$")
public void i_enter(DataTable table1) {
	
	List<List<String>>data=table1.raw();
	driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys(data.get(1).get(0));
	driver.findElement(By.xpath("//*[@id=\"LN\"]")).sendKeys(data.get(1).get(1));
	driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys(data.get(1).get(2));
	driver.findElement(By.xpath("//*[@id=\"AEM\"]")).sendKeys(data.get(1).get(3));
	driver.findElement(By.xpath("//*[@id=\"PW\"]")).sendKeys(data.get(1).get(4));
   
}

@When("^I select$")
public void i_select(DataTable table2) {
	
	List<List<String>>data=table2.raw();
	Select monthSelect=new Select(driver.findElement(By.id("month")));
	monthSelect.selectByVisibleText(data.get(1).get(0));
	Select daySelect=new Select(driver.findElement(By.id("day")));
	daySelect.selectByVisibleText(data.get(1).get(1));
	Select yearSelect=new Select(driver.findElement(By.id("year")));
	yearSelect.selectByVisibleText(data.get(1).get(2));
    
}

@When("^I click on$")
public void i_click_on(DataTable table3) {
	
	List<List<String>>data=table3.raw();
	if(data.get(1).get(0).equals("Male")) {
	driver.findElement(By.xpath("/html/body/input[6]")).click();
	}
    
}


}
