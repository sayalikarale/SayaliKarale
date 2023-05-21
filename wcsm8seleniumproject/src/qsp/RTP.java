package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTP {
     WebDriver driver;
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);               
      System.out.println("select the browser which you want to open!!!");
      String browserValue =sc.next();
      
      if (browserValue.equalsIgnoreCase("chrome")) {
    	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  		ChromeDriver co= new ChromeDriver();  


	                                                                                                                                                                                          
    		  
	}
    	  
	}


