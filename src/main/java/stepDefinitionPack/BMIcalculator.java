package stepDefinitionPack;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BMIcalculator extends AbstracClassCucumber{
	
	@Given("^I am on BMI calculator webpage$")
	public void i_am_on_BMI_calculator_webpage() {
		driver.get("file:///D:/ITTraining/WebSite/JavaScript/BMI.html");
	    
	}

	@When("^I enter height \"([^\"]*)\", weight \"([^\"]*)\"$")
	public void i_enter_height_weight(String ht, String wt) {
		driver.findElement(By.xpath("//*[@id=\"heightCMS\"]")).sendKeys(ht);
		driver.findElement(By.xpath("//*[@id=\"weightKg\"]")).sendKeys(wt);
	    
	}

	@When("^I click on calculate button$")
	public void i_click_on_calculate_button() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"Calculate\"]")).click();
	   Thread.sleep(3000);
	}

	@Then("^BMI should \"([^\"]*)\"$")
	public void bmi_should(String expectedBmi) {
		String actualBmi=driver.findElement(By.xpath("//*[@id=\"bmi\"]")).getAttribute("value");
		Assert.assertEquals(actualBmi, expectedBmi);
	    
	}

	@Then("^BMI category should  \"([^\"]*)\"$")
	public void bmi_category_should(String expectedCategory) {
		String actualCategory=driver.findElement(By.xpath("//*[@id=\"bmi_category\"]")).getAttribute("value");
		Assert.assertEquals(actualCategory, expectedCategory);
	   
	}


}
