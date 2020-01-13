package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.pageActions.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Register_Action;

public class POM_TC {

	private static WebDriver driver = null;

	@Test
	public void loga() {

		driver = new ChromeDriver();

		driver.get("https://www.advantageonlineshopping.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Home_Action.logar(driver);

		System.out.println("clickou no user com sucesso");

		Register_Action.cadastroinf(driver);
		
		System.out.println("Cadastro feito com sucesso");
		
		Home_Action.procurar(driver);
		
		
	//	driver.quit();
	}
}