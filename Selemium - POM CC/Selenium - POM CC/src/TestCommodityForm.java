import static org.testng.Assert.assertEquals;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestCommodityForm {
	WebDriver driver;

	@Before
	public void setup() {
		WebDriver driver = new HtmlUnitDriver();
		
	driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CommodityDetails/");
	//Thread.sleep(8000);
	}
	
	@Test
	public void test_Commodity_Details() throws Exception {
		
		CommodityForm comf =new CommodityForm();
		
		comf.setName("LG 335 Refrigerator");
		comf.setHeight("1200");
		comf.setLength("450");
		comf.setWeight("100");
		comf.setWidth("520");
		comf.clickAdd();
		
		assertEquals("LG 335 Refrigerator",comf.getTable1());
		assertEquals("1200",comf.getTable5());
		assertEquals("450",comf.getTable3());
		assertEquals("100",comf.getTable2());
		assertEquals("520",comf.getTable4());
		assertEquals("1",comf.getCommodity());
		assertEquals("100",comf.getTotal());
		
		
		comf.setName("Leather Sofa Set");
		comf.setHeight("120");
		comf.setLength("400");
		comf.setWeight("800");
		comf.setWidth("55");
		comf.clickAdd();
		
		assertEquals("Leather Sofa Set",comf.getTable1());
		assertEquals("120",comf.getTable5());
		assertEquals("400",comf.getTable3());
		assertEquals("800",comf.getTable2());
		assertEquals("55",comf.getTable4());
		assertEquals("2",comf.getCommodity());
		assertEquals("220",comf.getTotal());
		
		driver.quit();
		
 	}

}
