package br.com.rsinet.hub_tdd.provaTDD.driverFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static WebDriver ComecaChrome() {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\almir.damiao\\Desktop\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void openWebSite(WebDriver driver) {

		driver.get("http://advantageonlineshopping.com/");
	}

	public static void closeChrome(WebDriver driver) {
		if (driver != null)
			driver.close();
	}
}
