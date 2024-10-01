package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	public static void dropdownhandle(WebElement dropdownXpath, int dropdownValue)
	{
		Select s = new Select(dropdownXpath);
		s.selectByIndex(dropdownValue);
	}

    public static void handleAssertion(String actual, String expected)	
	{
	    SoftAssert assertion = new SoftAssert();
	    assertion.assertEquals(actual, expected);
	    assertion.assertAll();
	}
}
