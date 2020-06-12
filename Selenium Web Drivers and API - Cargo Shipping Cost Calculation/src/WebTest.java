import java.util.regex.Pattern;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class WebTest {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  static String url;
  static WebElement weight,air,road,ship,premium,calculate,result;
  
  
  @Before
  public void setUp() throws Exception {
	   driver = new FirefoxDriver();
	   //url = "http://apps.qa2qe.cognizant.e-box.co.in/Cargo_Shipping_Cost";
	   url = "http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/";
	    driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
  }
  
  @Test
  public void testWeb() throws Exception {
	    driver.get(url);	    	
	    driver.findElement(By.id("weight")).sendKeys("80");
	    driver.findElement(By.id("air")).click();
	    driver.findElement(By.id("premium")).click();
	    driver.findElement(By.id("calculate")).click();
	    try {
	      assertEquals("Dear Customer, your total shipping cost is $70.4", driver.findElement(By.id("result")).getText());
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    String result1 = driver.findElement(By.id("result")).getText();
	    driver.findElement(By.id("ship")).click();
	    driver.findElement(By.id("calculate")).click();
	    try {
	      assertEquals("Dear Customer, your total shipping cost is $49.28", driver.findElement(By.id("result")).getText());
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    String result2 = driver.findElement(By.id("result")).getText();
	    driver.findElement(By.id("road")).click();
	    driver.findElement(By.id("calculate")).click();
	    try {
	      assertEquals("Dear Customer, your total shipping cost is $35.2", driver.findElement(By.id("result")).getText());
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    String result3 = driver.findElement(By.id("result")).getText();

  }

@After
  public void tearDown() throws Exception {

    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
