package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
		
		private static WebElement element = null;
		
		public static WebElement botaoUser( WebDriver driver) {
			//encontra o botão user
			element = driver.findElement(By.id("menuUser"));
			return element;
	}
		public static WebElement BotaoSearch( WebDriver driver) {
			//encontra o botão Search
			element = driver.findElement(By.id("menuSearch"));
			return element;
}
		public static WebElement pesquisaSearch(WebDriver driver) {
			element = driver.findElement(By.id("autoComplete"));
			return element;
			
			
		}
}
