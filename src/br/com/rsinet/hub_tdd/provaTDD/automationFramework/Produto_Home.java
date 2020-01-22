package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.pageActions.PesquisaItemHome_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.ItemsPosPesquisa_Page;

public class Produto_Home {

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

			@Test
			public void ClicaProd() throws Exception {
				
			iniciaNavegadorESite();
			
			PesquisaItemHome_Action.ItemHome(driver);
			Reporter.log("clicando no item da home");
			
			// espera o elemento headphone aparecer na pagina para rodar o assert
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(ItemsPosPesquisa_Page.BeatsStudio(driver)));
			
			AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.advantageonlineshopping.com/#/category/Headphones/2");
			
			encerraNavegador();
	
	}
	@Test
	public void ProdutoErrado() throws Exception {

		iniciaNavegadorESite();

		PesquisaItemHome_Action.ItemHomeError(driver);

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOf(ItemsPosPesquisa_Page.AdicionarAoCarrinho(driver)));

		assertEquals(ItemsPosPesquisa_Page.bookchrome(driver).getText().contains("Folio"), false);

		encerraNavegador();

	}

}
