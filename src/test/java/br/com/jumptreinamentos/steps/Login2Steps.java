package br.com.jumptreinamentos.steps;

import br.com.jumptreinamentos.pageobjects.HomePage;
import br.com.jumptreinamentos.pageobjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Login2Steps {
	LoginPage login = new LoginPage();
	HomePage homePage = new HomePage();

	/*
	 * 
	 * 
	 * @Dado("que o usuario esteja na pagina de login") public void
	 * que_o_usuario_esteja_na_pagina_de_login() { login.toLogin(); }
	 * 
	 * @Quando("o usuario preecher as credencias de acesso") public void
	 * o_usuario_preecher_as_credencias_de_acesso(DataTable dataTable) { //
	 * dataTable.asMaps().forEach(linha ->{ //
	 * System.out.println(linha.get("email")); // }); login.realizaLogin("email",
	 * "senha", "btEntrar"); }
	 * 
	 * @Entao("o usuario estara logado") public void o_usuario_estara_logado() {
	 * login.validarUsuario(); }
	 */

	@Dado("que o usuario esteja na pagina de login")
	public void queOUsuarioEstejaNaPaginaDeLogin() {
		login.toLogin();
	}

	@Quando("o usuario preecher as credencias de acesso")
	public void oUsuarioPreecherAsCredenciasDeAcesso(DataTable dataTable) {
		dataTable.asMaps().forEach(linha -> {
			login.realizaLogin(linha.get("email"), linha.get("password"));
		});
		
	}

	@Entao("o usuario estara logado")
	public void oUsuarioEstaraLogado() {
		login.validarUsuario();
	}
}
