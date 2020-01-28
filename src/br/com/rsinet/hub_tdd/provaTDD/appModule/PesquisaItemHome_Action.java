package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class PesquisaItemHome_Action {
	
	
	public static void ItemHome(WebDriver driver) {
		
		   JavascriptExecutor ex = (JavascriptExecutor) driver;
	        ex.executeScript("arguments[0].click();", Home_Page.HeadPhones(driver));
}
	public static void ItemHomeError(WebDriver driver) throws Exception {
	JavascriptExecutor exe = (JavascriptExecutor) driver;
    exe.executeScript("arguments[0].click();", Home_Page.notebookElement(driver));

}
}