package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class Home_Action {
	public static void logar(WebDriver driver) {

		Home_Page.botaoUser(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_Page.botaoregister(driver).sendKeys(Keys.ENTER);

		}
	
}