package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.Utils.ExcelUtils;
import br.com.rsinet.hub_tdd.provaTDD.Utils.constant;
import br.com.rsinet.hub_tdd.provaTDD.pageActions.Search_Action;

public class TestePesquisa {

private static WebDriver driver = null;
	
	@BeforeTest
    public void iniciaNavegadorESite() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/");
        ExcelUtils.setExcelFile(constant.Path_TestData + constant.File_TestData, "Planilha1");
    }

	@Test
	public void Pesquisan() throws Exception {
	Search_Action.procurar(driver);
}

}
