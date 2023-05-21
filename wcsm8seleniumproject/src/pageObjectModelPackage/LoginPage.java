package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = ("//input[@name='username']"))
	private WebElement userameTB;
	@FindBy(xpath = ("//input[@name='pwd']"))
	private WebElement passwordTB;
	@FindBy(xpath=("//input[@name='remember']"))
	private WebElement checkBT;
	@FindBy(xpath=("//a[@id='loginButton']"))
	private WebElement loginBT;
	
	//to call  webelements in once
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//using getter method for making private
	public WebElement getUserameTB() {
		return userameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getCheckBT() {
		return checkBT;
	}

	public WebElement getLoginBT() {
		return loginBT;
	}
	
	//operational method
	public void validLogin(String validUsername,String validPassword) throws InterruptedException
	{
		userameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		loginBT.click();
		
	}
}
