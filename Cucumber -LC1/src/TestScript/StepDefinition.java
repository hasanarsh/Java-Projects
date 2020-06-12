package TestScript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	String text;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		text = "http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/";
	}
	
	
	@Given("^load the application from the given URL$")
	public void load_the_application_from_the_given_URL() throws Throwable {
		driver.get(text);
		//driver.manage().window().maximize();
	    
	}

	@When("^Tests the cost calculation by giving \"([^\"]*)\"$")
	public void Tests_the_cost_calculation_by_giving(String mode) throws Throwable {
		driver.findElement(By.id("weight")).sendKeys("100");
		driver.findElement(By.id(mode)).click();
		//driver.findElement(By.id("premium")).click();
		driver.findElement(By.id("calculate")).click();
	    
	}

	@Then("^validates \"([^\"]*)\" of the test$")
	public void validates_of_the_test(String message) throws Throwable {
		assertEquals(driver.findElement(By.id("result")).getText().trim(),message);
	    
	}
	@After
	public void tearDown() {
		driver.quit();
	}


}
