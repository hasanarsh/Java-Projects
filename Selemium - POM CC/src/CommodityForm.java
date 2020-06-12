import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CommodityForm {
	
	
	WebDriver driver;
	//DriverSetup ds = new DriverSetup(driver);
	
	By name = By.xpath("//div/table[@id='myTable']/tbody/tr/td/input[@id='name']");	
	By weight = By.xpath("//div/table[@id='myTable']/tbody/tr/td/input[@id='weight']");	
	By length = By.xpath("//div/table[@id='myTable']/tbody/tr/td/input[@id='length']");	
	By width = By.xpath("//div/table[@id='myTable']/tbody/tr/td/input[@id='width']");	
	By height = By.xpath("//div/table[@id='myTable']/tbody/tr/td/input[@id='height']");
	By add = By.xpath("//div/table[@id='myTable']/tbody/tr/td/button[@id='add']");
	By commodity = By.xpath("//div[@id='result']/table/tbody/tr/td/input[@id='count']");
	By total = By.xpath("//div[@id='result']/table/tbody/tr/td/input[@id='total']");
	
	
	
	public CommodityForm(WebDriver driver) {this.driver=driver;}


	public void setName(String sname) {
		driver.findElement(name).sendKeys(sname);
	}


	public void setWeight(String sweight) {
		driver.findElement(weight).sendKeys(sweight);
	}


	public void setLength(String slength) {
		driver.findElement(length).sendKeys(slength);
	}


	public void setWidth(String swidth) {
		driver.findElement(width).sendKeys(swidth);
	}

	public void setHeight(String sheight) {
		driver.findElement(height).sendKeys(sheight);
	}
	
	public void clickAdd() {
		driver.findElement(add).click();;
	}
	
	public List<WebElement> lastInsertedRow() {
		
		List<WebElement> lstRowsEle = new ArrayList<WebElement>();
		List<WebElement> lstColsEle = new ArrayList<WebElement>();
		lstRowsEle = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr"));
		int posLastrow =  lstRowsEle.size()-2;
		 lstColsEle =  lstRowsEle.get(posLastrow).findElements(By.xpath("./td"));
		return lstColsEle;
		
		
		/*for(WebElement rowEle : lstRowsEle)
		{
			lstColsEle =rowEle.findElements(By.xpath("./td"));
			
			for(WebElement colEle : lstColsEle)
			{
				System.out.println(colEle.getText().trim());
				//System.out.println(colEle.getAttribute("value").trim());
			}
		}*/
		//return lstRowsEle.size();
		//return lstRowsEle;
	}


	

	public String getCommodity() {
		String s = driver.findElement(commodity).getAttribute("value");
		//int i = Integer.parseInt(s);
		return s;
	}


	public String getTotal() {
		return driver.findElement(total).getAttribute("value");
	}
	
	
}
