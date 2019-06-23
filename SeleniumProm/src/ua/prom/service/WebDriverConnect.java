package ua.prom.service;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ua.prom.util.Timer;

public class WebDriverConnect {
	
	WebDriver driver = WebDriverService.getWebDriver();
	
	driver.get("https://prom.ua/ua");
	Timer.getPause(5);
	
	WebElement searchInput = driver.findElement(ByClassName("x-header__controls-link"));
	searchInput.sendKeys("”‚≥ÈÚË").click();
	
	WebElement submitElement = driver.findElement(ByClassName("x-header__controls-link-text"));
	submitElement.submit();
	
	Timer.getPause(5);
	
	element = driver.findElement(ByTagName("x-login-form__reg"));
	
	WebElement submElement = driver.findElement(ByClassName("x-login-form__reg-item")).click();
	submElement.submit();
	
	Timer.getPause(5);
	
	element = driver.findElement(ByClassName("lp-form lp-form_type_with-sticker"));
	
	element = driver.findElement(ByClassName("lp-input"));
	element = driver.findElement(ByTagName("email"));
	
	element.sendKeys("vdfg@gmail.com", Keys.ARROW_DOWN);
	
	element = driver.findElement(ByTagName("password"));
	
	element.sendKeys("asd123", Keys.ARROW_DOWN);
	
	element = driver.findElement(ByTagName("lp-checkbox__checkbox-fake")).click();
	
	element = driver.findElement(ByTagName("lp-button lp-button_width_full lp-button_theme_purple")).click();
	
	element.submit();
	
	Timer.getPause(5);
	
	String currentURL = driver.getCurrentUrl();
	driver.get(currentURL);
	
	Timer.getPause(5);
	
	driver.quit();
	
	
	
	

}
