package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class POM_TC {
	
	private static WebDriver driver = null;
    @Test
    public void loga() {
    	
         driver = new ChromeDriver();
     
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
         driver.get("https://www.advantageonlineshopping.com/#/");
         
         Home_Page.botaoUser(driver);
         
         Login_Page.botaoCadastro(driver);
         
}
}