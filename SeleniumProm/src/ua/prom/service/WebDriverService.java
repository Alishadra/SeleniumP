package ua.prom.service;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverService {
	
	private static final String SEP = System.getProperty("file.separator");
	private static final String CHROMEDRIVER_PATH = System.getProperty("user.dir") + SEP + "lib" + SEP + "webdriver" + SEP + "chromedriver.exe";

	
	public static WebDriver getWebDriver() {
		
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		return driver;
		
 		
	}
}
