package mindtree.seleninumtest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndiaBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiabookstore.net/");
		driver.findElement(By.id("searchBox")).sendKeys("Selenium");
		driver.findElement(By.id("searchBox")).sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement Category_Book = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51Oa0cZRm6L._SL160_.jpg']")));
		Category_Book.click();
		WebElement W1 = driver.findElement(By.xpath("//div[@class='isbnContainer']"));
		String val = W1.getText();
		System.out.println(val);
		WebElement W2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.indiabookstore.net/redirect?url=https%3A%2F%2Fwww.amazon.in%2Fdp%2F1849515743%3Ftag%3Dindi08-21%26linkCode%3Dosi%26th%3D1%26psc%3D1&source=buyLinkModal&name=Amazon&ibsId=9781849515740&urlDisplay=https%3A%2F%2Fwww.amazon.in%2Fdp%2F1849515743%3Ftag%3Dindi08-21%26linkCode%3Dosi%26th%3D1%26psc%3D1&sellingPrice=2519&storeId=17&isbn13=9781849515740&rank=1&minPrice=1019&storesCount=3&searchId=\']")));
		W2.click();
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles()); 
		driver.switchTo().window(tabs.get(1));
		WebElement W3=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
		String val2= W3.getAttribute("'a-size-medium a-color-success");
		System.out.println("The input value: "+ val2);

	}

}
