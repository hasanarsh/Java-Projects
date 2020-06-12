import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void testLoginPage() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/");
		
		LoginPage lg = new LoginPage(driver);
		//lg.setUserName("Admin");
		//lg.setPassword("admin123");
		//lg.clickLogin();
		assertTrue(lg.verifySignIn());
		driver.quit();
	}

}
