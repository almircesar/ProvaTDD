package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Register_Page;

public class Register_Action {
	public static void cadastroinf(WebDriver driver) {
		
		Register_Page.username(driver).sendKeys("Ltr3cc23");
		Register_Page.email(driver).sendKeys("lilala82@hotmail.com");
		Register_Page.senha(driver).sendKeys("Garrafa889");
		Register_Page.confirmacaoSenha(driver).sendKeys("Garrafa889");
		Register_Page.Primeironome(driver).sendKeys("miguel");
		Register_Page.ultimoNome(driver).sendKeys("Santos");
		Register_Page.numeroTelefone(driver).sendKeys("972128922");
		Register_Page.paisescolhido(driver).selectByVisibleText("Brazil");
		Register_Page.city(driver).sendKeys("São Paulo");
		Register_Page.adress(driver).sendKeys("rua linde");
		Register_Page.state(driver).sendKeys("São Paulo");
		Register_Page.codpostal(driver).sendKeys("05539445");
		Register_Page.agree(driver).click();
		Register_Page.regiser(driver).click();

		

	}

}
