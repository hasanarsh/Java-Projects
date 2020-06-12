import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverSetup {
	
	WebDriver driver;
	//WebDriver driver = new FirefoxDriver();
	
	public DriverSetup (WebDriver driver) {this.driver=driver;}
	public WebDriver setUp() {
		return driver = new FirefoxDriver();
	}
	
	

}
