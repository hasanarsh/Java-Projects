import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@Test
	public void testHomePage() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/");
		
		LoginPage lg = new LoginPage(driver);
		lg.verifySignIn();
		HomePage hp = new HomePage(driver);
		assertEquals("Welcome Robert!!!",hp.getWelcomeMessage());
		driver.quit();
	}

}
