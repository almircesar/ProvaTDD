package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.appModule.PesquisaItemHome_Action;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.ItemsPosPesquisa_Page;

public class TesteProdutoHome {

	private static Logger Log = Logger.getLogger(TesteProdutoHome.class.getName());

	private static WebDriver driver = null;

	@BeforeMethod
	public void iniciaNavegadorESite() {
		driver = DriverManager.ComecaChrome();
		Log.info("Teste iniciado");
	}

	@AfterMethod
	public void encerraNavegador() {

		DriverManager.closeChrome(driver);
		Log.info("Teste concluído com sucesso");
	}

	@Test(priority = 0)
	public void ClicaProd() throws Exception {

		DriverManager.openWebSite(driver);
		Log.info("Site aberto");
		PesquisaItemHome_Action.ItemHome(driver);

		Log.info("Item encontrado na home");
		// espera o elemento headphone aparecer na pagina para rodar o assert

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ItemsPosPesquisa_Page.BeatsStudio(driver)));

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://advantageonlineshopping.com/#/category/Headphones/2");

		Thread.sleep(1000);

		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		Log.info("Item encontrado com sucesso");

	}

	@Test(priority = 1)
	public void ProdutoErrado() throws Exception {

		DriverManager.openWebSite(driver);
		Log.info("Site aberto");

		PesquisaItemHome_Action.ItemHomeError(driver);

		WebDriverWait wait = new WebDriverWait(driver, 5);

		Log.info("Item clicado na home");

		wait.until(ExpectedConditions.visibilityOf(ItemsPosPesquisa_Page.AdicionarAoCarrinho(driver)));

		assertEquals(ItemsPosPesquisa_Page.bookchrome(driver).getText().contains("Folio"), false);

		Screenshot.captureScreenShot(driver);

		Log.info("Tira o print");

		Log.info("Caminho para produto errado feito");

	}

}
