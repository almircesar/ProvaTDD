package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsPosPesquisa_Page {
	

	private static WebElement element = null;

	public static WebElement TextoEsperado(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Chromebook 14 G1(ENERGY STAR)"));
		return element;
	}
	
	public static WebElement TextoEsperadocadeira(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		return element;
	
}
	public static WebElement FacebookBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"follow\"]/a[1]/img"));
        return element;
 
 }
	public static  WebElement BeatsStudio(WebDriver driver) {
		element = driver.findElement(By.id("15"));
		return element;
		
	}
	
	public static WebElement NoteComErro(WebDriver driver) {
		element = driver.findElement(By.linkText(" HP CHROMEBOOK 14 G1(ES) "));
		return element;
		
	}
	public static WebElement AdicionarAoCarrinho(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[3]/button"));
		return element;
	
}
	public static WebElement bookchrome(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
		return element;
	
	
	
}
	
	public static WebElement cadeiraInexistente(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		return element;
		
		
	}
}