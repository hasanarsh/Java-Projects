import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By welcome = By.xpath("/html/body/h2");
	By profile = By.id("profile");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getWelcomeMessage() {
	 return	driver.findElement(welcome).getText();
	}
	
	public void clickProfile() {
		 driver.findElement(profile).click();
		}
	
	
	

}
