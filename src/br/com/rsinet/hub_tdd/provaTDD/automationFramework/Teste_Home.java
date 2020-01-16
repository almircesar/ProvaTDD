package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.pageActions.Home_Teste_Action;

public class Teste_Home {

	private static WebDriver driver = null;
		
		@BeforeTest
	    public void iniciaNavegadorESite() throws Exception {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.advantageonlineshopping.com/");
		}
			@Test
			public void ClicaProd() throws Exception {
			Home_Teste_Action.ItemHome(driver);
	}
	    @AfterTest
	    public void encerraNavegador() {
	        driver.quit();
	      
	   }
	}