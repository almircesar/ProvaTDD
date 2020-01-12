package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	public static WebElement element = null;
// definindo os atributos
	public static WebElement username(WebElement driver) {
		element = driver.findElement(By.name("usernameRegisterPage"));
		return element;

	}

	public static WebElement email(WebElement driver) {
		element = driver.findElement(By.name("emailRegisterPage"));
		return element;
	}

	public static WebElement senha(WebElement driver) {
		element = driver.findElement(By.name("passwordRegisterPage"));
		return element;
	}

	public static WebElement confirmacaoSenha(WebElement driver) {
		element = driver.findElement(By.className("star"));
		return element;
	}

	public static WebElement Primeironome(WebElement driver) {
		element = driver.findElement(By.name("first_nameRegisterPage"));
		return element;
	}

	public static WebElement ultimoNome(WebElement driver) {
	
		element = driver.findElement(By.name("last_nameRegisterPage"));
		return element;
	}
	
	public static WebElement numeroTelefone(WebElement driver) {
		
		element = driver.findElement(By.className("phone_numberRegisterPage"));
		return element;
	}
	
	public static WebElement paisescolhido(WebElement driver) {
		 element = driver.findElement(By.name("countryListboxRegisterPage"));
	        Select oSelect = new Select(element);
	        return (WebElement) oSelect;
		
	}
	
	public static WebElement cidade(WebElement driver) {
		element = driver.findElement(By.name("cityRegisterPage"));
		return element;
	
}
	public static WebElement endereco(WebElement driver) {
		element = driver.findElement(By.className("addressRegisterPage"));
		return element;
		
	}
	public static WebElement estado(WebElement driver) {
		
		element = driver.findElement(By.className("state_/_province_/_regionRegisterPage"));
		return element;
	}
	
	public static WebElement agree(WebElement driver) {
		element = driver.findElement(By.className("i_agree"));
		return element;
	}
       public static WebElement endereço(WebElement driver) {
		element = driver.findElement(By.id("register_btnundefined"));
		return element;
		
	}
}