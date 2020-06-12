import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CommodityForm {
	
	
	WebDriver driver;
	DriverSetup ds = new DriverSetup(driver);
	
	By name = By.id("name");
	By table1 = By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[1]");
	By weight = By.id("weight");
	By table2 = By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[2]");
	By length = By.id("length");
	By table3 = By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[3]");
	By width = By.id("width");
	By table4 = By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[4]");
	By height = By.id("height");
	By table5 = By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[5]");//*[@id="myTable"]/tbody/tr[2]/td[5]
	By add = By.id("add");
	By commodity = By.id("count");
	By total = By.id("total");
	
	
	public CommodityForm() {			}


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


	public String getTable1() {
		return driver.findElement(table1).getText();
	}


	public String getTable2() {
		return driver.findElement(table2).getText();
	}


	public String getTable3() {
		return driver.findElement(table3).getText();
	}


	public String getTable4() {
		return driver.findElement(table4).getText();
	}


	public String getTable5() {
		return driver.findElement(table5).getText();
	}


	public String getCommodity() {
		return driver.findElement(commodity).getText();
	}


	public String getTotal() {
		return driver.findElement(total).getText();
	}
	
	
}
