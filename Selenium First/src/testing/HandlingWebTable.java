package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		//open a FirefoxDriver browser
		WebDriver driver = new FirefoxDriver();
		
		//opening of url
		driver.get("file:///G:/Automation%20Testing%20Data/Selenium%20Software/Offline%20Website/index.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Locate email element
		WebElement userEle = driver.findElement(By.cssSelector("input[id=email]"));
		
		//Enter user name into text box
		userEle.sendKeys("kiran@gmail.com");
		
		//Locate password element
		
		

	}

}
