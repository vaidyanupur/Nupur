package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[]args) {
		
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///G:/Automation%20Testing%20Data/Selenium%20Software/Offline%20Website/index.html");
		wd.manage().window().maximize();
		
	// blank values
		WebElement we =  wd.findElement(By.id("email"));
		we.sendKeys("");
		
		WebElement we1 = wd.findElement(By.id("password"));
		we1.sendKeys("");
		
		WebElement we2 = wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		we2.click();
		
	    //negative values
		WebElement we3 = wd.findElement(By.id("email"));
		we3.sendKeys("etryye");
		
		WebElement we4 = wd.findElement(By.id("password"));
		we4.sendKeys("erertr");
		
		WebElement we5 = wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		we5.click();
		we3.clear();
		
		we4.clear();
		
		//positive values
		WebElement we6 =  wd.findElement(By.id("email"));
		we6.sendKeys("kiran@gmail.com");
		
		WebElement we7 = wd.findElement(By.id("password"));
		we7.sendKeys("123456");
		
		WebElement we8 = wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		we8.click();
		
	
		
	
	}
	

}
