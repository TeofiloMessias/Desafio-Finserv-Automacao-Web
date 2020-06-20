package br.com.jumptreinamentos.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage{
	

	
	private By inputEmail 	 = By.name("email");
	private By inputPassword = By.id("senha");
	private By botaoEntrar   = By.xpath("//button[contains(text(),'Entrar')] ");
	private By msn = By.xpath("//div[contains(text(),'Bem vindo, Teofilo!')]");
	
	public void toLogin() {
		getDriver().navigate().to("https://srbarriga.herokuapp.com");
	}
	
	public void realizaLogin(String email, String senha ) {
		
		getDriver().findElement(inputEmail).sendKeys(email);
		getDriver().findElement(inputPassword).sendKeys(senha);		
		getDriver().findElement(botaoEntrar).click();
	}
	public void validarUsuario() {	
		
	
	String validarUsuario = getDriver().findElement(msn).getText();

		Assert.assertEquals("Bem vindo, Teofilo!", validarUsuario);
	}



}
