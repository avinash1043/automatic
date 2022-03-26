package mindtree.seleninumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");  
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']")).click();
	//driver.findElement(By.xpath("//div[@data-testid='search-source-city-txt']")).sendKeys("pune");
	driver.findElement(By.xpath("//input[@value='Bengaluru (BLR)']")).click();
	//driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//input[@value='Bengaluru (BLR)']")).sendKeys("pun");
			
	
	
	
	//driver.close();
	}
}
