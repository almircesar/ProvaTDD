package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestePesquisa {

private static WebDriver driver = null;
	
	@BeforeTest
    public void iniciaNavegadorESite() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/");
    }

  //  @AfterTest
 //   public void encerraNavegador() {
     //   driver.quit();
  //  }

	@Test
	public void Pesquisan() {
	Search_Action.procurar(driver);
	
}

}
