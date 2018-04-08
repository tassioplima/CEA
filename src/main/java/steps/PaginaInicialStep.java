package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import funcionalidades.PaginaInicialFuncionalidade;

public class PaginaInicialStep {
	
	private PaginaInicialFuncionalidade paginaInicial;
	
	public PaginaInicialStep() {
		paginaInicial = new PaginaInicialFuncionalidade(); 
		
	}
	
	@Dado("^que estou na pagina inicial$")
	public void que_estou_na_pagina_inicial() throws Throwable {
		paginaInicial.login();
	}

	@Entao("^vai exibir o site da C&A$")
	public void e_exibida_o_site_da_C_A() throws Throwable {
		paginaInicial.isPaginaInicial();
	}
	
	

}
