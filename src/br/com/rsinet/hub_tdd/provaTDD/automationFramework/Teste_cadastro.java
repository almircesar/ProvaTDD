package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.Screenshot;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Registro_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Teste_cadastro {
	
	private static Logger Log = Logger.getLogger("Classe de Cadastro");

	private static WebDriver driver = null;

	public void iniciaNavegadorESite() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/");
	}

	public void encerraNavegador() {

		driver.close();
		Reporter.log("ChromeDriver fechado com sucesso.");
		Reporter.log("Teste concluído com sucesso");
	}

	@Test(priority = 0)

	public void loga() throws Exception {

		iniciaNavegadorESite();

		Home_Action.logar(driver);

		Registro_Action.cadastroCerto(driver);

		Reporter.log("cadastrado com sucesso");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Home_Page.HeadPhones(driver)));

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.advantageonlineshopping.com/#/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		
		encerraNavegador();
	}

	@Test(priority = 1)

	public void logaerro() throws Exception {

		iniciaNavegadorESite();

		Home_Action.logar(driver);

		Registro_Action.cadastroErro(driver);

		Reporter.log("cadastrado com sucesso");

		// espera o elemento headphone aparecer na pagina para rodar o assert
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(Home_Page.HeadPhones(driver)));

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.advantageonlineshopping.com/#/register");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		Screenshot.captureScreenShot(driver);
		Log.info("Tira o print");
		
		encerraNavegador();
	}

}