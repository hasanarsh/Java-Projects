package stepsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import static org.testng.Assert.assertEquals;




import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintion {
	
	WebDriver driver;
	String text;
	
	@Given("^start browser by creating a driver instance$")
	public void start_browser_by_creating_a_driver_instance() throws Throwable {
	    driver = new FirefoxDriver();
	    text = "http://apps.qa2qe.cognizant.e-box.co.in/CustomerRegistration/Index";
	    
	}

	@When("^To test the page \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void To_test_the_page(String str1, String str2, String str3, String str4, String str5, String str6) throws Throwable {
	    driver.get(text);                                                                                                                                                                              
	    
	    assertEquals(driver.findElement(By.id("heading")).getText(),"Customer Form");
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[1]/td[1]")).getText(),"Customer Name");
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[2]/td[1]")).getText(),"Age");
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[3]/td[1]")).getText(),"Address");
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[4]/td[1]")).getText(),"Phone Number");
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[5]/td[1]")).getText(),"Email");
	    
	    //assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[5]/td[1]")).getText(),"Customer Name");
	    driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[1]/td[2]/input")).sendKeys(str1);
	    driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[2]/td[2]/input")).sendKeys(str2);
	    driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[3]/td[2]/input")).sendKeys(str3);
	    driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[4]/td[2]/input")).sendKeys(str4);
	    driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[5]/td[2]/input")).sendKeys(str5);
	    driver.findElement(By.id(str6)).click();;
	    
	    
	}

	@Then("^To validate expected and \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"and quit the driver$")
	public void To_validate_expected_and_and_quit_the_driver(String res1, String res2, String res3, String res4, String res5, String res6, String res7) throws Throwable {
		assertEquals(driver.findElement(By.id("heading")).getText(),res7);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[1]/td[2]/input")).getText(),res1);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[2]/td[2]/input")).getText(),res2);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[3]/td[2]/input")).getText(),res3);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[4]/td[2]/input")).getText(),res4);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"agent-form\"]/table/tbody/tr[5]/td[2]/input")).getText(),res5);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"message\"]")).getText(),res6);
		
		driver.quit();
	  
	}
	
}
