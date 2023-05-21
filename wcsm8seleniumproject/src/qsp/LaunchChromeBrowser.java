package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	//to avoid illeagalstatexception
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	//to avoid connectionfailedexception
	ChromeOptions co = new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     //to do upcasting
    new ChromeDriver(co);
	
}
}
