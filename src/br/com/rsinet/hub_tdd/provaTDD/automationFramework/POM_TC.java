package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.pageActions.Login_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Register_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.SingIn_Action;

public class POM_TC {

	private static WebDriver driver = null;

	@Test
	public void loga() {

		driver = new ChromeDriver();

		driver.get("https://www.advantageonlineshopping.com/#/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		SingIn_Action.logar(driver);
		
		System.out.println("clickou no user com sucesso");
		
		Login_Action.clickarregistro(driver);
		
		Register_Action.cadastroinf(driver);
		
	//	driver.quit();
		
		

	}
}