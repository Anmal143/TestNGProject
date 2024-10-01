package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	private By Firstname = By.xpath("//input[@name='UserFirstName']");
	private By JobTitle = By.xpath("//select[@name='UserTitle']");
	private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	private By Lastname = By.xpath("//input[@name='UserLastName']");
	private By email = By.xpath("//input[@type='email']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By country = By.xpath("//select[@name='CompanyCountry']");
	
	public SignUpPageObjects(WebDriver driver2)
	{
		this.driver=driver2;
	}

	public WebElement EnterFirstName()
    {
    	return driver.findElement(Firstname);
    }
	public WebElement EnterlastName()
    {
    	return driver.findElement(Lastname);
    }
	public WebElement SelectJobtitle()
    {
    	return driver.findElement(JobTitle);
    }
	public WebElement SelectEmployees()
    {
    	return driver.findElement(Employees);
    }
	public WebElement EnterEmail()
    {
    	return driver.findElement(email);
    }
	public WebElement EnterComapny()
    {
    	return driver.findElement(company);
    }
	public WebElement SelectCountry()
    {
    	return driver.findElement(country);
    }
}
