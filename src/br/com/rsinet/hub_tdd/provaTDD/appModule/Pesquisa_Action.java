package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Pesquisa_Action {

	private static Logger Log = Logger.getLogger("Classe de pesquisa");

	public static void procurarerro(WebDriver driver) throws Exception {
        
		JavascriptExecutor exs = (JavascriptExecutor) driver;
        exs.executeScript("arguments[0].click();", Home_Page.pesquisaSearch(driver));

		Home_Page.pesquisaSearch(driver).sendKeys(ExcelUtils.getCellData(3, 0));
		Log.info("pesquisa o conteudo do excel");

		Home_Page.pesquisaSearch(driver).sendKeys(Keys.ENTER);

	}


	public static void PesquisaCerta(WebDriver driver) throws Exception {
		
		
       Home_Page.BotaoSearch(driver).click();
        
		JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", Home_Page.pesquisaSearch(driver));

		Home_Page.pesquisaSearch(driver).sendKeys(ExcelUtils.getCellData(2, 0));
		Log.info("pesquisa o conteudo do excel");

		Home_Page.pesquisaSearch(driver).sendKeys(Keys.ENTER);

	}
}
