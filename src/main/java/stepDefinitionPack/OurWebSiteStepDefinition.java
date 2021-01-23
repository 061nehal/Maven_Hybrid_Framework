package stepDefinitionPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurWebSiteStepDefinition extends AbstracClassCucumber {
	
	@Given("^I am on ourwebsite webpage$")
	public void i_am_on_ourwebsite_webpage() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
	    
	}

	@When("^I enter first name \"([^\"]*)\", last name \"([^\"]*)\", email \"([^\"]*)\", again email \"([^\"]*)\", password \"([^\"]*)\"$")
	public void i_enter_first_name_last_name_email_again_email_password(String FName, String LName, String EMail, String AEMail, String Pass) {
		driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys(FName);
		driver.findElement(By.xpath("//*[@id=\"LN\"]")).sendKeys(LName);
		driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys(EMail);
		driver.findElement(By.xpath("//*[@id=\"AEM\"]")).sendKeys(AEMail);
		driver.findElement(By.xpath("//*[@id=\"PW\"]")).sendKeys(Pass);
		
	}

	@When("^I select month \"([^\"]*)\", day \"([^\"]*)\", year \"([^\"]*)\"$")
	public void i_select_month_day_year(String MN, String DY, String YR) {
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText(MN);
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText(DY);
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText(YR);
		
	    
	}

	@When("^I click on \"([^\"]*)\" radio button$")
	public void i_click_on_radio_button(String arg1) {
	    driver.findElement(By.xpath("/html/body/input[6]")).click();
	}

	@Then("^I should create new account successfully$")
	public void i_should_create_new_account_successfully() {
	    System.out.println("I have created new account successfully");
	}


}
