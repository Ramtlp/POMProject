package qaDemoSourcePage;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import excelUtility.ExcelData;

public class TextBoxPage extends ExcelData {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='card-body']//h5[text()='Elements']")
	WebElement elements;

	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement text_boxButton;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement usernamefield;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement emailfield;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddress;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement pr_address;

	@FindBy(xpath = "//div[@class='mt-2 justify-content-end row']//div//button[@id='submit']")
	WebElement submitbutton;

	public void elemnet() {
		elements.click();
	}

	public void textbox() {
		text_boxButton.click();
	}

	public void getuserdetails(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException {
		getdata();

		usernamefield.sendKeys(fullname);
		emailfield.sendKeys(email);
		currentAddress.sendKeys(craddress);
		pr_address.sendKeys(permanentaddress);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(852,899)");
		Thread.sleep(3000);
		submitbutton.click();
	
		
	}

	public TextBoxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
