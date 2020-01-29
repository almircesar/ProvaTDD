package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Registro_Action;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverManager;

public class Testecadastro {

	private static Logger Log = Logger.getLogger(Testecadastro.class.getName());
	private static WebDriver driver;

	@BeforeMethod
	public void iniciaNavegadorESite() {
		driver = DriverManager.ComecaChrome();
		Log.info("Teste iniciado");
	}

	@AfterMethod
	public void encerraNavegador() {

		DriverManager.closeChrome(driver);
		Log.info("Teste concluido");
	}

	@Test(priority = 0)

	public void loga() throws Exception {

		DriverManager.openWebSite(driver);

		Home_Action.logar(driver);

		Registro_Action.cadastroCerto(driver);

		Log.info("cadastrado com sucesso");

		Thread.sleep(1000);

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://advantageonlineshopping.com/#/");

		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		Log.info("cadastro efetuado com sucesso");

	}

	@Test(priority = 1)

	public void logaerro() throws Exception {

		DriverManager.openWebSite(driver);

		Home_Action.logar(driver);

		Registro_Action.cadastroErro(driver);

		Log.info("falha no cadastro");

//		Reporter.log("cadastrado com sucesso");

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://advantageonlineshopping.com/#/register");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		Log.info("cadastro com falha efetuado");

	}

}