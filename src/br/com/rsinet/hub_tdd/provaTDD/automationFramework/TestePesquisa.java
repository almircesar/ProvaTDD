package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.Utils.constant;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Pesquisa_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.ItemsPosPesquisa_Page;

public class TestePesquisa {

	private static Logger Log = Logger.getLogger(TestePesquisa.class.getName());

	private static WebDriver driver = null;

	public void iniciaNavegadorESite() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.info("inicia o driver,abre o site e maximiza a tela");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/");
		ExcelUtils.setExcelFile(constant.Path_TestData + constant.File_TestData, "Planilha1");
		Reporter.log("Teste iniciado");
	}

	public void encerraNavegador() {

		driver.close();
		Log.info("Teste concluído com sucesso");
	}

	@Test(priority = 0)
	public void Pesquisa() throws Exception {

		iniciaNavegadorESite();

		Pesquisa_Action.PesquisaCerta(driver);
		Log.info("Pesquisa feita");

		assertEquals(ItemsPosPesquisa_Page.TextoEsperado(driver).getText()
				.contains(ExcelUtils.getCellData(2, 0).toUpperCase()), true);

		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");

		encerraNavegador();

	}

	@Test(priority = 1)
	public void PesquisaErro() throws Exception {

		iniciaNavegadorESite();

		Pesquisa_Action.procurarerro(driver);
		Log.info("Tira o print");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ItemsPosPesquisa_Page.cadeiraInexistente(driver)));

		assertEquals(ItemsPosPesquisa_Page.TextoEsperadocadeira(driver).getText()
				.contains(ExcelUtils.getCellData(4, 0).toUpperCase()), true);

		Log.info("Pesquisa não respondeu ao que era esperado");
		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");

		encerraNavegador();

	}
}
