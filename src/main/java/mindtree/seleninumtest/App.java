package mindtree.seleninumtest;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class App 
{
    public static void main( String[] args )
    {
    	
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");  
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	System.out.println(driver.getTitle());
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("refrigarator");
    	driver.findElement(By.id("nav-search-submit-button")).click();
    	
    	//System.out.println(driver.findElement(By.xpath("//span[@aria-label='2,641']")).getText());
    	driver.findElement(By.cssSelector("img[data-image-index='3']")).click();
    	Set <String> ids=driver.getWindowHandles();
    	java.util.Iterator<String> it=ids.iterator();
    	//WebElement d=driver.findElement(By.xpath());
    	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	WebElement d1=driver.findElement(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr[14] //td[@class='a-size-base prodDetAttrValue']"));
    	System.out.println(d1.getText());
    }
}
