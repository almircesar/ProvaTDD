package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Search_Action {
	
	private static Logger Log = Logger.getLogger("Classe de pesquisa");

public static void procurar(WebDriver driver)  throws Exception {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Home_Page.BotaoSearch(driver).click();
		Log.info("clica no search");
		Home_Page.pesquisaSearch(driver).sendKeys(ExcelUtils.getCellData(2,0));
		Log.info("pesquisa o conteudo do excel");
		Home_Page.pesquisaSearch(driver).sendKeys(Keys.ENTER);
		Log.info("clica pra pesquisar o conteudo digitado");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("da um tempo");
		wait.until(ExpectedConditions.urlContains("search"));

		wait.until(ExpectedConditions.visibilityOf(Home_Page.escolhermouser(driver)));

		Home_Page.escolhermouser(driver).click();
		Screenshot.captureScreenShot(driver);
		Log.info("escolher um produto especifico");
		driver.quit();
		Log.info("sai do teste");
		
		

	}
}
