package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;

	public static WebElement botaoUser(WebDriver driver) {
		// encontra o botão user
		element = driver.findElement(By.id("menuUser"));
		return element;
	}

	public static WebElement BotaoSearch(WebDriver driver) {
		// encontra o botão Search
		element = driver.findElement(By.xpath("//*[@id=\"menuSearch\"]"));
		return element;
	}

	public static WebElement pesquisaSearch(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		return element;

	}

public static WebElement escolhermouser(WebDriver driver) {
	element = driver.findElement(By.linkText("Logitech G502 Proteus Core"));
	return element;
	
}

	public static WebElement produto(WebDriver driver) {
		element = driver.findElement(By.className("ng-scope"));
		return element;

	}

	public static WebElement fechasearch(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div/img"));
		return element;

	}
	public static WebElement HeadPhones(WebDriver driver) {
		element = driver.findElement(By.id("headphonesImg"));
		return element;
	
}
	public static WebElement notebookFolio(WebDriver driver) {
		element = driver.findElement(By.linkText("HP ELITEBOOK FOLIO"));
		return element;
		
	}
	public static WebElement notebookElement(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"details_10\"]"));
		return element;
	
}
	public static WebElement MiceElement(WebDriver driver) {
		element = driver.findElement(By.id("miceImg"));
		return element;
		
	}

 	
	
}
