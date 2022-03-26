package mindtree.seleninumtest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buy {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nobroker.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//div[@id='app']/div/div/div[1]/div[3]/div[1]")).click();
	driver.findElement(By.xpath("//div[@id='searchCity']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")).click();
    
    Actions city=new Actions(driver);
    for(int i=0;i<3;i++)
    {
    	city.sendKeys(Keys.DOWN).perform();
    }
    city.sendKeys(Keys.ENTER).perform();
    
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;

    
	
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Hinjewadi");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;

		//*[@id="app"]/div/div/div[1]/div[4]/div[2]/div
		
	driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
	Actions loc=new Actions(driver);
	for(int i=0;i<2;i++)
	{
		loc.sendKeys(Keys.DOWN).perform();
	}
	
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;	
    //driver.findElement(By.xpath("//div"))
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;	
	driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi\"]")).click();
	//loc.sendKeys(Keys.ENTER).perform();
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//button[@class=\"prop-search-button btn btn-primary btn-lg\"]")).click();
	
	//*[@id="8a9f9e827a13c32a017a13d912b3099c"]/section[1]/div[1]/a/h2/span
      driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	
	driver.findElement(By.xpath("//*[@id=\"8a9f9e827a13c32a017a13d912b3099c\"]/section[1]/div[1]/a/h2/span")).click();
	ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles()); 
	driver.switchTo().window(tabs.get(1));
	WebElement name=driver.findElement(By.xpath("//*[@id=\"propertyDetails\"]/div[1]/div/div[1]/div[2]/div[1]/h1"));
	String n1=name.getText();
	System.out.println(n1);
	
	WebElement cost=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[1]/div/section[1]/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div[1]/span"));
	String c1=cost.getText();
	System.out.println(c1);
	//Thread.sleep(5000);
	//span[@id="propertyCount"]
	//driver.findElement(By.xpath("//span[@id=\"propertyCount\"]")).click();
	
	}

}
