package qaDemoSourcePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage 
{

	WebDriver driver;
	@FindBy(xpath = "//div[@class='card-body']//h5[text()='Elements']")
	WebElement elements;
	
	@FindBy(xpath = "//ul[@class='menu-list']//li[@id='item-1']//span[text()='Check Box']")
	WebElement checkboxmenu;
	
	@FindBy(xpath = "//span[@class='rct-checkbox']")
	WebElement homecheckbox;
	
	@FindBy(xpath = "//div[@class='rct-options']//button[@class='rct-option rct-option-expand-all']")
	WebElement expandbutton;
	
	@FindBy(xpath = "//span[text()='Documents']")
	WebElement uncheck_documents;
	
	@FindBy(xpath = "//button[@class='rct-option rct-option-collapse-all']")
	WebElement collapsebutton;
	
	public void checkbox()
	{
		elements.click();
		checkboxmenu.click();
		homecheckbox.click();
		expandbutton.click();
		uncheck_documents.click();
		collapsebutton.click();
	}
	
	public CheckBoxPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
