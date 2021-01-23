package stepDefinitionPack;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import HelperPack.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrienOurWebsiteExcel extends AbstracClassCucumber {
	
	 public List<HashMap<String,String>> datamap;
	 
	 
	 public DataDrienOurWebsiteExcel() throws IOException {
		 driver=AbstracClassCucumber.driver;
		 datamap=DataHelper.data("D:\\ITTraining\\CompanyData\\FacebookData.xlsx", "Data1");
		
		 
	 }
	 @Given("^I am on Ourwebsite webpage$")
	 public void i_am_on_Ourwebsite_webpage() {
		 driver.get("file:///D:/ITTraining/OurWebSite.html");
	     
	 }

	 @When("^I enter and select \"([^\"]*)\"$")
	 public void i_enter_and_select(String stringvalue) throws InterruptedException {
		 
		    int index = Integer.parseInt(stringvalue)-1;
		 
			driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys(datamap.get(index).get("First Name"));
			driver.findElement(By.xpath("//*[@id=\"LN\"]")).sendKeys(datamap.get(index).get("Last Name"));
			driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys(datamap.get(index).get("Email"));
			driver.findElement(By.xpath("//*[@id=\"AEM\"]")).sendKeys(datamap.get(index).get("Again Email"));
			driver.findElement(By.xpath("//*[@id=\"PW\"]")).sendKeys(datamap.get(index).get("Password"));
			
			Select monthSelect=new Select(driver.findElement(By.id("month")));
			monthSelect.selectByVisibleText(datamap.get(index).get("Birth Month"));
			Select daySelect=new Select(driver.findElement(By.id("day")));
			daySelect.selectByVisibleText(datamap.get(index).get("Birth Day"));
			Select yearSelect=new Select(driver.findElement(By.id("year")));
			yearSelect.selectByVisibleText(datamap.get(index).get("Birth Year"));
			
			if(datamap.get(index).get("Gender").equalsIgnoreCase("Male")) {
				driver.findElement(By.xpath("/html/body/input[6]")).click();
			}
			else if(datamap.get(index).get("Gender").equalsIgnoreCase("Female")) {
				driver.findElement(By.xpath("/html/body/input[7]")).click();
			}
			Thread.sleep(2000);
	   
	 }

	 @Then("^I Should created new account successfully$")
	 public void i_Should_created_new_account_successfully() {
		 
		 System.out.println("Account created successfully");
	     
	 }

}
