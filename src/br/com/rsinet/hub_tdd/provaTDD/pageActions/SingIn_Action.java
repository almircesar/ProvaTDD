package br.com.rsinet.hub_tdd.provaTDD.pageActions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class SingIn_Action {
    public static void logar(WebDriver driver) {

        Home_Page.botaoUser(driver).click();
        
    }
}