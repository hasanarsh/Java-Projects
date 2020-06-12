import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyProfileTest {
	
	@Test
	public void testMyProfile() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/");
		
		LoginPage lg = new LoginPage(driver);
		lg.verifySignIn();
		HomePage hp = new HomePage(driver);
		hp.clickProfile();
		MyProfilePage mp = new MyProfilePage(driver);
		assertEquals("Admin",mp.getUsername());
		assertEquals("Robert",mp.getName());
		assertEquals("admin14@gmail.com",mp.getEmail());
		assertEquals("Admin",mp.getRole());
		assertEquals("981 Dundas St W",mp.getAddress());
		assertEquals("Steelville",mp.getCity());
		assertEquals("USA",mp.getState());
		
		driver.quit();
		
		
		
		
		
	}

}
