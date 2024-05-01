package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import qaDemoSourcePage.TextBoxPage;

public class TextBoxPageTest extends LaunchAndQuit
{

	@Test
	public void textboxpage() throws InterruptedException, EncryptedDocumentException, IOException
	{
	 TextBoxPage ob=new TextBoxPage(driver);
	 ob.elemnet();
	 ob.textbox();
	 ob.getuserdetails(driver);
	}
}
