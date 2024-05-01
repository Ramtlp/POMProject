package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit 
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}
