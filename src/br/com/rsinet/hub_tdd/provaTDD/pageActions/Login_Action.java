package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class Login_Action {

	public static void clickarregistro(WebDriver driver) {

		Login_Page.botaoregister(driver).sendKeys(Keys.ENTER);

	}

}
