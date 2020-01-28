package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Registro_Action;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Testecadastro {

	private static Logger Log = Logger.getLogger("Classe de Cadastro");

	private static WebDriver driver;

	@BeforeMethod
	public void iniciaNavegadorESite() {
		driver = DriverManager.ComecaChrome();
		Log.info("inicia o ChromeDriver");
	}

	@AfterMethod
	public void encerraNavegador() {

		DriverManager.closeChrome(driver);
		Reporter.log("ChromeDriver fechado com sucesso.");
		Reporter.log("Teste concluído com sucesso");
	}

	@Test(priority = 0)

	public void loga() throws Exception {

		DriverManager.openWebSite(driver);

		Home_Action.logar(driver);

		Registro_Action.cadastroCerto(driver);

		Reporter.log("cadastrado com sucesso");

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(Home_Page.HeadPhones(driver)));

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://advantageonlineshopping.com/#/");

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(Home_Page.MiceElement(driver)));

		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		
	}

	@Test(priority = 1)

	public void logaerro() throws Exception {

		DriverManager.openWebSite(driver);

		Home_Action.logar(driver);

		Registro_Action.cadastroErro(driver);

		Reporter.log("cadastrado com sucesso");

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://advantageonlineshopping.com/#/register");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");

	}

}