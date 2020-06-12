import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 */

/**
 * @author hasan
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By userName = By.name("username");
	By userPassword = By.name("password");
	By logIn = By.name("login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
	}

	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		driver.findElement(userPassword).sendKeys(strPassword);
	}
	
	public void clickLogin() {
		driver.findElement(logIn).click();
	}
	
	public boolean verifySignIn() {
		
		setUserName("Admin");
		setPassword("admin123");
		clickLogin();
		return true;
	}
	

}
