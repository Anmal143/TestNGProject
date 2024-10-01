package TestCases;

import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCase extends BaseClass{
    
	@Test
	public void Signup() throws IOException
	{
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.ClickTryForFree().click();
		
		String actual = driver.getTitle();
		String expected = TestCaseData.expected;
		
		SignUpPageObjects spo = new SignUpPageObjects(driver);
		spo.EnterFirstName().sendKeys(TestCaseData.firstname);
		spo.EnterlastName().sendKeys(TestCaseData.Lastname);
		spo.EnterEmail().sendKeys(TestCaseData.Email);
		spo.EnterComapny().sendKeys(TestCaseData.Company);
						
//		Select s = new Select(spo.SelectJobtitle());
//		s.selectByIndex(1);
//		
//		Select s1 = new Select(spo.SelectEmployees());
//		s1.selectByIndex(2);
//
//		Select s2 = new Select(spo.SelectCountry());
//		s2.selectByIndex(5);
		
		CommonUtilities.dropdownhandle(spo.SelectJobtitle(), 2);
		CommonUtilities.dropdownhandle(spo.SelectEmployees(), 3);
		CommonUtilities.dropdownhandle(spo.SelectCountry(), 4);
		
		CommonUtilities.handleAssertion(actual, expected);
	}
}
