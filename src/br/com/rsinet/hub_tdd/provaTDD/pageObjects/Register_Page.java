package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	public static WebElement element = null;

// definindo os atributos
	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.name("usernameRegisterPage"));
		return element;

	}

	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.name("emailRegisterPage"));
		return element;
	}

	public static WebElement senha(WebDriver driver) {
		element = driver.findElement(By.name("passwordRegisterPage"));
		return element;
	}

	public static WebElement confirmacaoSenha(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input"));
		return element;
	}

	public static WebElement Primeironome(WebDriver driver) {
		element = driver.findElement(By.name("first_nameRegisterPage"));
		return element;
	}

	public static WebElement ultimoNome(WebDriver driver) {

		element = driver.findElement(By.name("last_nameRegisterPage"));
		return element;
	}

	public static WebElement numeroTelefone(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input"));
		return element;
	}

	public static Select paisescolhido(WebDriver driver) {
		element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select oSelect = new Select(element);
		return oSelect;

	}

	public static WebElement agree(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/sec-view/div/input"));
		return element;
	}

public static WebElement city(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input"));
	return element;
}
public static WebElement adress(WebDriver driver) {
	element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input"));
	return element;

}

public static WebElement state(WebDriver driver) {
	element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input"));
	return element;
}
public static WebElement codpostal(WebDriver driver) {
	element = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input"));
	return element;

}
public static WebElement register(WebDriver driver) {
	element = driver.findElement(By.id("register_btnundefined"));
	return element;

}
public static WebElement caracteresAMais(WebDriver driver) {
	element = driver.findElement(By.linkText("Use maximum 15 character"));
	return element;
	
	
	
	
}
}