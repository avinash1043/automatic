package mindtree.seleninumtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");  
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    	
    	//Actions act=new Actions(driver);
    //	act.moveToElement(driver.findElement(By.cssSelector("span[class='icp-nav-flag icp-nav-flag-in']")));
    //	act.click(driver.findElement(By.xpath("//a[@href='#switch-lang=hi_IN']")));
    //	driver.findElement(By.id("nav-search-submit-button")).click();
    //	System.out.println(driver.findElement(By.xpath("//span[@aria-lable='2650']")).getText());
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("refrigarator");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
    	driver.findElement(By.cssSelector("img[data-image-index='3']")).click();
    	driver.getWindowHandle();
    	WebElement d1=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[3]"));
    	String s1=d1.getTagName();
    	System.out.println(s1);
    	for(String winHandle: driver.getWindowHandles())
    	{
    		driver.switchTo().window(winHandle);
    	}
    	WebElement d2=driver.findElement(By.id("acrCustomerReviewText"));
    	String s2=d2.getText();
    	System.out.println(s2);
    	if(s2.indexOf(s1)!=-1)
    	{
    		System.out.println("Matched");
    	}
    	else {
    		System.out.println("Not matched");
    	}
    	List<WebElement> th1=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/th"));
    	List<WebElement> td1=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/td"));
    	for(int i=0;i<th1.size();i++) {
    		if(th1.get(i).getText().equalsIgnoreCase("Voltage")) {
    		System.out.println(td1.get(i).getText());
    		break;
    	}
    	}
	driver.findElement(By.cssSelector("img[alt='LG 190L 5 Star Direct-Cool Smart Inverter Single Door Refrigerator (GL-D201ASPZ, Scarlet Plumeria, Base stand with drawer)']")).click();
	driver.getWindowHandle();
	for(String winHandle1:driver.getWindowHandles()) {
		driver.switchTo().window(winHandle1);
	}
	System.out.println(driver.getCurrentUrl());
	List<WebElement> l1=driver.findElements(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[21]/td"));
	List<String> al=new ArrayList<>();
	for(int i=0;i<l1.size();i++) {
		al.add(l1.get(i).getText());
		System.out.println(l1.get(i).getText());
	}
	Object ob1=Collections.max(al);
	System.out.println("The Maximun weight is"+ob1);
	}

}
