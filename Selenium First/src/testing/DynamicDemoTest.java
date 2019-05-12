package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDemoTest {

	public static void main(String[] args) {
		
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///G:/Automation%20Testing%20Data/Selenium%20Software/Offline%20Website/index.html");
		wd.manage().window().maximize();
		
		WebElement we9 =  wd.findElement(By.xpath("//input [@id='email']"));
		we9.sendKeys("");
		
		WebElement we10 = wd.findElement(By.xpath("//input [@id='password']"));
		we10.sendKeys("");
		
		WebElement we11 = wd.findElement(By.xpath("//*[@type='submit']"));
		we11.click();
		
	}

}
