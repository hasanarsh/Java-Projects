package Menu;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Arshad\\Cognizant\\QA2QE\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System. setProperty("webdriver.chrome.driver", "path of the exe file\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.severntrent.com");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/button")).click();
		
		
		//Mouseover on  button
				Actions action = new Actions(driver);
				WebElement btn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/button"));
				action.moveToElement(btn).perform();
				//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/ul/li[1]/a")).click();
				
				
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
				 // now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("C:/SWT/Investor_Overwiew_chrome1.png"));
				}
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());
				 
				 }
				
				
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				try {
					 // now copy the  screenshot to desired location using copyFile //method
					FileUtils.copyFile(src, new File("C:/SWT/Investor_Overwiew_chrome2.png"));
					}
					catch (IOException e)
					 {
					  System.out.println(e.getMessage());
					 
					 }
				
				//js.executeScript("window.scrollBy(0,1000)");
				
				
				
				
				
		driver.quit();

	}

}
