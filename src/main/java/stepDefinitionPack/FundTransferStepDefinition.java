package stepDefinitionPack;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;

public class FundTransferStepDefinition extends AbstracClassCucumber{
	
	@Given("^I am on fund transfer webpage$")
	public void i_am_on_fund_transfer_webpage() {
		driver.get("file:///D:/ITTraining/WebSite/JavaScript/FundTransfer.html");
	    
	}

	@When("^I select valid payee \"([^\"]*)\"$")
	public void i_select_valid_payee(String vpayee) {
		driver.findElement(By.xpath("//*[@id='payee']")).sendKeys(vpayee);
	    
	}

	@When("^I enter valid amount \"([^\"]*)\"$")
	public void i_enter_valid_amount(String vamount) {
		driver.findElement(By.xpath("//*[@name='amount']")).sendKeys(vamount);
	    
	}

	
	@When("^I select invalid payee \"([^\"]*)\"$")
	public void i_select_invalid_payee(String invpayee) {
		driver.findElement(By.xpath("//*[@id=\"payee\"]")).sendKeys(invpayee);
	    
	}
	

	@When("^I enter invalid amount \"([^\"]*)\"$")
	public void i_enter_invalid_amount(String invamount) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys(invamount);
	   Thread.sleep(3000); 
	}

	
	@When("^I click on fund transfer button$")
	public void i_click_on_fund_transfer_button() {
		driver.findElement(By.xpath("//*[@id=\"transfer\"]")).click();
	    
	}
	@Then("^I should get message \"([^\"]*)\"$")
	public void i_should_get_message(String expectedmessage) {
		String actualmessage=driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
	     Assert.assertEquals(actualmessage, expectedmessage);
	}

}