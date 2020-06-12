import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class StepDefinition1 {

	WebDriver driver;

	@Given("^Firefox browser is launched and navigated to the shipment page1$")
	public void Firefox_browser_is_launched_and_navigated_to_the_shipment_page() {
		driver = new FirefoxDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CucumberShipmentPagination/");
	}

	@When("^Get the page1 element and click on it$")
	public void Get_the_page_element_and_click_on_it() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div/span[1]/a"))
				.click();

	}

	@Then("^Validate that table element is present in page1 with expected data and close the driver with quit method$")
	public void Validate_that_table_element_is_present_with_expected_data_and_close_the_driver_with_quit_method(
			DataTable arg1) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<List<String>> data = arg1.raw();

		for (int i = 1; i < data.size(); i++) {

			for (int j = 0; j < 5; j++) {

				Assert.assertTrue(driver
						.findElement(
								By.xpath("/html/body/table/tbody/tr[" + (i + 1)
										+ "]/td[" + (j + 1) + "]")).getText()
						.equals(data.get(i).get(j)));

			}

		}

		driver.close();
		driver.quit();
	}

}
