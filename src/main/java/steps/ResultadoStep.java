package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.ResultadoFuncionalidade;

public class ResultadoStep {
	
	
	ResultadoFuncionalidade resultado = new ResultadoFuncionalidade();
	
	
	@Quando("^acessar categoria de ajuda$")
	public void acessar_categoria_de_ajuda() throws Throwable {
		resultado.acessarAjuda();
	}
	
	@Entao("^apresenta resultado das perguntas frequentes e realiza print$")
	public void apresentaResultadoDasPerguntasFrequentesERealizaPrint() throws Throwable {
		resultado.expandirPerguntas();
	}
	
	@Quando("^acessar a opcao institucional na secao de loja fisica$")
	public void acessar_a_categoria_institucional_na_secao_de_loja_fisica() throws Throwable {
		resultado.acessaInstitucional();
	}

	@Entao("^validar as perguntas exibidas na tela$")
	public void validar_as_perguntas_exibidas_na_tela() throws Throwable {
		resultado.validaInformacoesIntitucionais();
		
	}
	
	@Quando("^acessar opcao \"([^\"]*)\"$")
	public void acessar_opcao(String arg1) throws Throwable {
		resultado.acessarTelefonedoCartao();
	}

	@Quando("^salvar a imagem do cartao$")
	public void salvar_a_imagem_do_cartÃ£o() throws Throwable {
		resultado.downloadImg();
	}

	@Entao("^validar os telefones$")
	public void validar_os_telefones() throws Throwable {
	}
	
	

}
