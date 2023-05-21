package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//writting all recorded web elements with findBy@ annotation
	@FindBy(xpath="//A[@class='content administration']/IMG[@class='sizer']") private WebElement setting;
	@FindBy(xpath="//A[@class='content calendar']/IMG[@class='sizer']") private WebElement workSchedule;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement user;
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']") private WebElement reports;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']") private WebElement task;
	@FindBy(xpath="//A[@class='content tt_selected selected']/DIV[2]/IMG"2) private WebElement timeTrack;
	@FindBy(xpath="//a[contains(normalize-space(@class),'logout')]") private WebElement logOutLink;

	//initialization
	public HomePage (WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
    //utilization
	public WebElement getSetting() {
		return setting;
	}
	public WebElement getWorkSchedule() {
		return workSchedule;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getReports() {
		return reports;
	}
	public WebElement getTask() {
		return task;
	}
	public WebElement getTimeTrack() {
		return timeTrack;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	
   //method for logoutlink
    public void logoutmethod()
    {
    	logOutLink.click();
    }

    //method for create user module
    public void createUserModule()
    {
    	user.click();
    }














}
