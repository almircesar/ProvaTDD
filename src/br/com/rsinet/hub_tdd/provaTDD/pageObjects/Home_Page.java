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
			driver.findElement(By.id("menuSearch")).click();
			return element;
}
}
