package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.pageActions.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Register_Action;

public class Teste_cadastro {
	
	private static WebDriver driver = null;
	
	@BeforeTest
    public void iniciaNavegadorESite() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/");
    }

    @AfterTest
   public void encerraNavegador() {
       driver.quit();
       Reporter.log("ChromeDriver fechado com sucesso.");
       Reporter.log("Teste concluído com sucesso");
    }

	@Test
	
	public void loga() {

	Home_Action.logar(driver);

	Register_Action.cadastroinf(driver);
	
	Reporter.log("cadastrado com sucesso");
	
	}
	
}