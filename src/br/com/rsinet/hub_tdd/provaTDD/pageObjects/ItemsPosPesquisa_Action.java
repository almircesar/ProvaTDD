package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsPosPesquisa_Action {

	private static WebElement element = null;

	public static WebElement TextoEsperado(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Chromebook 14 G1(ENERGY STAR)"));
		return element;
	}
	
	public static WebElement TextoEsperadocadeira(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		return element;
	
}
}