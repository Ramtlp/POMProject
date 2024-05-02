package testpackage;

import org.testng.annotations.Test;

import qaDemoSourcePage.CheckBoxPage;

public class CheckBoxTest extends LaunchAndQuit
{

	@Test
	public void checkboxtest()
	{
		CheckBoxPage ob=new CheckBoxPage(driver);
		ob.checkbox();
	}
}
