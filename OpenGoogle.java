package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\7.1DIGIT7_DRIVE_D\\SeleniumTutorial\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver(); 
		driver.get("https://digit7.io/");
		
	}

}
