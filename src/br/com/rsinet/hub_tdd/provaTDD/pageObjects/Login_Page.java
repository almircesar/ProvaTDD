package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	public static WebElement element = null;
	
	public static WebElement botaoregister (WebDriver driver) {
		
		//procura o cadastro
		element = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));       
		return element;
	  
		}
}