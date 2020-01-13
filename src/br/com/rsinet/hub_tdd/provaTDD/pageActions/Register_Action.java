package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Register_Page;

public class Register_Action {
	public static void cadastroinf(WebDriver driver) {

		Register_Page.username(driver).sendKeys("Alanzz");
		Register_Page.email(driver).sendKeys("Aleida@outlook.com.br");
		Register_Page.senha(driver).sendKeys("2345atrsA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Register_Page.confirmacaoSenha(driver).sendKeys("2345atrsA");
		Register_Page.Primeironome(driver).sendKeys("Alan");
		Register_Page.ultimoNome(driver).sendKeys("Santos");
		Register_Page.numeroTelefone(driver).sendKeys("940028922");
	//	Register_Page.paisescolhido(driver).sendKeys("Brazil");
		Register_Page.city(driver).sendKeys("Barueri");
		Register_Page.adress(driver).sendKeys("rua jaguaré");
		Register_Page.state(driver).sendKeys("São Paulo");
		Register_Page.codpostal(driver).sendKeys("03339445");
		Register_Page.agree(driver).click();
		Register_Page.regiser(driver).click();
		

		

	}

}
