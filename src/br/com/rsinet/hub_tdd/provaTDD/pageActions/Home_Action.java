package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class Home_Action {
	public static void logar(WebDriver driver) {

		Home_Page.botaoUser(driver).click();
		Login_Page.botaoregister(driver).sendKeys(Keys.ENTER);

		}

}