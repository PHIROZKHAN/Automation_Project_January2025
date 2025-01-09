package Baseutility ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary {
	
	public static WebDriver driver;
	
	public void launchUrl()
	{ //WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		//option.setAcceptInsecureCerts(true);
		//option.addArguments("--incognito");
		
		//option.addArguments("--maximize");
	    //driver.manage().window().maximize();
		
		driver.get("https://testingbaba.com/old/");
	}

}
