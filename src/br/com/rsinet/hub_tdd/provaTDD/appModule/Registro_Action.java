package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Register_Page;

public class Registro_Action {
	

//	private static Logger Log = Logger.getLogger("Classe de pesquisa");

//	private static WebDriver driver = null;
	
	public static void cadastroCerto(WebDriver driver) {

		Register_Page.username(driver).sendKeys("aluiiend");
		Register_Page.email(driver).sendKeys("lilala32@hotmail.com");
		Register_Page.senha(driver).sendKeys("Garrafa88A");
		Register_Page.confirmacaoSenha(driver).sendKeys("Garrafa88A");
		Register_Page.Primeironome(driver).sendKeys("miguel");
		Register_Page.ultimoNome(driver).sendKeys("Santos");
		Register_Page.numeroTelefone(driver).sendKeys("972128922");
		Register_Page.paisescolhido(driver).selectByVisibleText("Brazil");
		Register_Page.city(driver).sendKeys("S�o Paulo");
		Register_Page.adress(driver).sendKeys("rua linde");
		Register_Page.state(driver).sendKeys("S�o Paulo");
		Register_Page.codpostal(driver).sendKeys("05539445");
		Register_Page.agree(driver).click();
		Register_Page.register(driver).click();
		

			}

			public static void cadastroErro(WebDriver driver) throws Exception {
				
				Register_Page.username(driver).sendKeys("AluraBoy");
				Register_Page.email(driver).sendKeys("lilala2@hotmail.com");
				Register_Page.senha(driver).sendKeys("Garrafa889");
				Register_Page.confirmacaoSenha(driver).sendKeys("Garrafa889");
				Register_Page.Primeironome(driver).sendKeys("miguel");
				Register_Page.ultimoNome(driver).sendKeys("Santos");
				Register_Page.numeroTelefone(driver).sendKeys("972128922");
				Register_Page.paisescolhido(driver).selectByVisibleText("Brazil");
				Register_Page.city(driver).sendKeys("S�o Paulo");
				Register_Page.adress(driver).sendKeys("rua linde");
				Register_Page.state(driver).sendKeys("S�o Paulo");
				Register_Page.codpostal(driver).sendKeys("055-qqqq14444");
				Register_Page.agree(driver).click();
				Register_Page.register(driver).click();		
			
}
			
			
			
}
