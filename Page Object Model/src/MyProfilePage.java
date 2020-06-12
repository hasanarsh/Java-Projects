import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfilePage {
	
	WebDriver driver;
	By name = By.xpath("/html/body/table/tbody/tr[1]/td[2]");
	By userName = By.xpath("/html/body/table/tbody/tr[2]/td[2]");
	By email = By.xpath("/html/body/table/tbody/tr[3]/td[2]");
	By role = By.xpath("/html/body/table/tbody/tr[4]/td[2]");
	By addres = By.xpath("/html/body/table/tbody/tr[5]/td[2]");
	By city = By.xpath("/html/body/table/tbody/tr[6]/td[2]");
	By state = By.xpath("/html/body/table/tbody/tr[7]/td[2]");
 	
	public MyProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getName() {
		return driver.findElement(name).getText();
	}
	
	public String getUsername() {
		return driver.findElement(userName).getText();
		
	}
	
	public String getEmail() {
		return driver.findElement(email).getText();
	}
	
	public String getRole() {
		return driver.findElement(role).getText();
	}
	
	public String getAddress() {
		return driver.findElement(addres).getText();
	}
	
	public String getCity() {
		return driver.findElement(city).getText();
	}
	
	public String getState() {
		return driver.findElement(state).getText();
	}
	
	public boolean verifyMyProfile() {
		getUsername();
		getUsername();
		getEmail();
		getRole();
		getAddress();
		getCity();
		getState();
		return true;
	}
	

}
