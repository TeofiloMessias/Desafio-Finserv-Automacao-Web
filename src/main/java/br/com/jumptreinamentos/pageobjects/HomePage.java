package br.com.jumptreinamentos.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;



public class HomePage extends BasePage {

	private By painelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");
	private By mensagemCredencialInvalida = By.id("spanMessage");
	Actions action = new Actions(getDriver());

	/**
	 * Método que valida se está realmente na pagina Home
	 */
	public void validaPainelDashboard() {		
		String resposta = getDriver().findElement(painelDashboard).getText();
		Assert.assertEquals("Dashboard", resposta);
	}

	/**
	 * Métod para validar que o login está incorreto.
	 */
	public void validaMensagem() {
		String mensagem = getDriver().findElement(mensagemCredencialInvalida).getText();
		Assert.assertEquals("Invalid credentials", mensagem);

	}

}
