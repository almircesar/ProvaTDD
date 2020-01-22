package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.Utils.constant;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Pesquisa_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.ItemsPosPesquisa_Page;

public class TestePesquisa {

	private static Logger Log = Logger.getLogger("Classe de pesquisa");

	private static WebDriver driver = null;


	public void iniciaNavegadorESite() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.info("inicia o driver,abre o site e maximiza a tela");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/");
		ExcelUtils.setExcelFile(constant.Path_TestData + constant.File_TestData, "Planilha1");
		
	}

	public void encerraNavegador() {

		driver.close();
		Reporter.log("ChromeDriver fechado com sucesso.");
		Reporter.log("Teste concluído com sucesso");
	}
	
	@Test(priority = 0)
	public void Pesquisa() throws Exception {
		
		iniciaNavegadorESite();
		
		Pesquisa_Action.PesquisaCerta(driver);
		
		assertEquals(ItemsPosPesquisa_Page.TextoEsperado(driver).getText().contains(ExcelUtils.getCellData(2, 0).toUpperCase()), true);
		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		
		encerraNavegador();
		
	}
	@Test(priority = 1)
	public void PesquisaErro() throws Exception {
		
		iniciaNavegadorESite();
		
		Pesquisa_Action.procurarerro(driver);
		
		assertEquals(ItemsPosPesquisa_Page.TextoEsperadocadeira(driver).getText().contains(ExcelUtils.getCellData(4, 0).toUpperCase()), true);
		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		
		encerraNavegador();

}
}
