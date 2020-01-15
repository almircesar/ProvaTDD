package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.Utils.constant;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Search_Action;

public class TestePesquisa {
	
	private static Logger Log = Logger.getLogger("Classe de pesquisa");

private static WebDriver driver = null;
	
	@BeforeTest
    public void iniciaNavegadorESite() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.info("inicia o driver,abre o site e maximiza a tela");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/");
        ExcelUtils.setExcelFile(constant.Path_TestData + constant.File_TestData, "Planilha1");
    	
	}
	
	@Test
	public void Pesquisan() throws Exception {
	Search_Action.procurar(driver);
	Reporter.log("procurando com sucesso");
	
	
}
    @AfterTest
    public void encerraNavegador() {
        driver.quit();
      
    }
}
