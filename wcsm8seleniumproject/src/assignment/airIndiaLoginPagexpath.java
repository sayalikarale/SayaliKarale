package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class airIndiaLoginPagexpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    WebDriver step=new ChromeDriver(co);
    
    step.manage().window().maximize();
    Thread.sleep(2000);
    step.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=Vm10UHRFZ3RLN2JsNjF1cVpobmNBNkNGRWo2SWRBZXphMTVtby1qU19PWjZW_en-GB_false_&nonce=Vm10UHRFZ3RLN2JsNjF1cVpobmNBNkNGRWo2SWRBZXphMTVtby1qU19PWjZW&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=lq75IC4XoPE94ThvpvDzU3LzGUTusZyZto5hFck64rw&ui_locales=en-GB");
    Thread.sleep(2000);
    step.findElement(By.xpath("//input[@id='signInName']")).sendKeys("sayalikarale678@gmail.com");
    Thread.sleep(2000);
    step.findElement(By.xpath("//input[@id='password']")).sendKeys("sayalik@2000");
    Thread.sleep(2000);
    step.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    

}
}
