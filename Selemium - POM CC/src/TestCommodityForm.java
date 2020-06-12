import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCommodityForm {
	WebDriver driver;
	
	/*@Before
	public void setup() throws InterruptedException {
	 driver = new FirefoxDriver();
	driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CommodityDetails/");
	Thread.sleep(8000);
	
	}*/
	
	@Test
	public void test_Commodity_Details() throws Exception {
		
		DriverSetup ds = new DriverSetup(driver);
		driver =  ds.setUp();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CommodityDetails/");
		CommodityForm comf =new CommodityForm(driver);
			
		
		
		comf.setName("LG 335 Refrigerator");
		comf.setWeight("100");
		comf.setLength("450");
		comf.setWidth("520");
		comf.setHeight("1200");		
		
		comf.clickAdd();
		System.out.println(comf.getCommodity());
		List<WebElement> lstRowCollemns1 = comf.lastInsertedRow();
		
		assertEquals("LG 335 Refrigerator",lstRowCollemns1.get(0).getText().trim());
		assertEquals("100",lstRowCollemns1.get(1).getText().trim());
		assertEquals("450",lstRowCollemns1.get(2).getText().trim());
		assertEquals("520",lstRowCollemns1.get(3).getText().trim());
		assertEquals("1200",lstRowCollemns1.get(4).getText().trim());
		//String s = comf.getCommodity();
		assertEquals("1",comf.getCommodity());
		//assertTrue(comf.getCommodity().equalsIgnoreCase("1"));
		assertEquals("100",comf.getTotal());
		
		
		comf.setName("Leather Sofa Set");
		comf.setWeight("120");
		comf.setLength("400");
		comf.setWidth("800");
		comf.setHeight("55");		
		
		comf.clickAdd();
		List<WebElement> lstRowCollemns2 = comf.lastInsertedRow();
		
		assertEquals("Leather Sofa Set",lstRowCollemns2.get(0).getText().trim());
		assertEquals("120",lstRowCollemns2.get(1).getText().trim());
		assertEquals("400",lstRowCollemns2.get(2).getText().trim());
		assertEquals("800",lstRowCollemns2.get(3).getText().trim());
		assertEquals("55",lstRowCollemns2.get(4).getText().trim());
		assertEquals("2",comf.getCommodity());
		assertEquals("220",comf.getTotal());
		
		driver.quit();
		
 	}

}
