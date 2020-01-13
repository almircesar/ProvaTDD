package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
		
		private static WebElement element = null;
		
		public static WebElement botaoUser( WebDriver driver) {
			//encontra o bot�o user
			element = driver.findElement(By.id("menuUser"));
			return element;
	}
		public static WebElement BotaoSearch( WebDriver driver) {
			//encontra o bot�o Search
			element = driver.findElement(By.id("menuSearch"));
			return element;
}
		public static WebElement pesquisaSearch(WebDriver driver) {
			element = driver.findElement(By.id("autoComplete"));
			return element;
		
		}
		
		public static WebElement escolherprod(WebDriver driver) {
			element = driver.findElement(By.linkText("HP ElitePad 1000 G2 Tablet"));
			return element;
			
			
		}
		public static WebElement  produto(WebDriver driver) {
			element = driver.findElement(By.className("ng-scope"));
			return element;
			
		}
		public static WebElement  fechasearch(WebDriver driver) {
			element = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div/img"));
			return element;
		
		
		
}
}
