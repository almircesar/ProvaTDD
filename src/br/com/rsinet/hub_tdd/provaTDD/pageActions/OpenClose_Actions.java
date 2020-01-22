package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class OpenClose_Actions {
	
	public static ChromeDriver driver = null;
	

    public static WebDriver iniciaNavegadorESite() {
    	
      DOMConfigurator.configure("log4j.xml");
      System.setProperty("webdriver.chrome.drive", "C:\\Users\\almir.damiao\\Documents\\chromedriver");
      WebDriver driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();

      return driver;
    }
    
   public static void encerraNavegador() {
       driver.close();
       Reporter.log("Teste concluído com sucesso");
    }
}