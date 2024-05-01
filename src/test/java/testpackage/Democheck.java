package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Democheck {
	WebDriver driver;

	@Test
	public void demomethod() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ram");

		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ram@yopmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Tuslipur");

		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Lucnow");

		WebElement buttonsubmit = driver.findElement(By.xpath("//div//div//button[@id='submit']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(852,899)");

		buttonsubmit.click();

	}
}
