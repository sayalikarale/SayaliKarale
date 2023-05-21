package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //to get the url
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//to drag the Web Element
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		// ----------------------------------------------------------------------------------------------
		//to drop the Web Element
		WebElement target1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
		WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
		//-------------------------------------------------------------------------------------------------------------
		// to perform drag and drop action on web element
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//action to be perform
		
		act.dragAndDrop(src1, target1).perform();
		act.dragAndDrop(src2, target2).perform();
		act.dragAndDrop(src3, target3).perform();
		act.dragAndDrop(src4, target4).perform();

	}

}
