package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Home_Teste_Action {
	public static void ItemHome(WebDriver driver) {
	
		   JavascriptExecutor ex = (JavascriptExecutor) driver;
	        ex.executeScript("arguments[0].click();", Home_Page.HeadPhones(driver));
	

}
}