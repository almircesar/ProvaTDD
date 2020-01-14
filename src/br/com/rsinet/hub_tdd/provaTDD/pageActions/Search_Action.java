package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Search_Action {

public static void procurar(WebDriver driver)  throws Exception {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Home_Page.BotaoSearch(driver).click();
		Home_Page.pesquisaSearch(driver).sendKeys(ExcelUtils.getCellData(1,0));
		Home_Page.pesquisaSearch(driver).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.urlContains("search"));
		wait.until(ExpectedConditions.visibilityOf(Home_Page.escolherprod(driver)));
		Home_Page.escolherprod(driver).click();
	}
}
