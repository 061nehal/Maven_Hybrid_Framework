package stepDefinitionPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenOurWebsite extends AbstracClassCucumber {
	
	@Given("^I am on Ourwebsite Webpage$")
	public void i_am_on_Ourwebsite_Webpage() {
		driver.get("file:///D:/ITTraining/OurWebSite.html");
	 
	}

	@When("^I Enter first name \"([^\"]*)\", last name \"([^\"]*)\", email \"([^\"]*)\", again email \"([^\"]*)\", password \"([^\"]*)\"$")
	public void i_Enter_first_name_last_name_email_again_email_password(String Fname, String Lname, String Email, String AEmail, String Pass) {
		driver.findElement(By.xpath("//*[@id=\"FN\"]")).sendKeys(Fname);
		driver.findElement(By.xpath("//*[@id=\"LN\"]")).sendKeys(Lname);
		driver.findElement(By.xpath("//*[@id=\"EM\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"AEM\"]")).sendKeys(AEmail);
		driver.findElement(By.xpath("//*[@id=\"PW\"]")).sendKeys(Pass);
	}

	@When("^I Select month \"([^\"]*)\", day \"([^\"]*)\", year \"([^\"]*)\"$")
	public void i_Select_month_day_year(String MN, String DY, String YR) {
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText(MN);
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText(DY);
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText(YR);
	    
	}

	@When("^I Click on \"([^\"]*)\" radio button$")
	public void i_Click_on_radio_button(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		}
		else {
			driver.findElement(By.xpath("/html/body/input[7]")).click();
		}
	}

	@Then("^I Should create new account successfully$")
	public void i_Should_create_new_account_successfully() {
		System.out.println("Account created successfully");
	    
	}


}
