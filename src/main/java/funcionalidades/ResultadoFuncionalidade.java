package funcionalidades;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageobjetcs.PaginaInicial;
import pageobjetcs.Resultado;
import util.Navegador;
import util.Print;

public class ResultadoFuncionalidade{
	private WebDriver driver;
	private PaginaInicial paginaInicial;
	private Resultado resultado;
	private Print print;
	private Navegador navegador;
	private Actions action;
	
	public ResultadoFuncionalidade(){
		
		driver = Navegador.getChromeDriver();
		paginaInicial = new PaginaInicial(driver);
		resultado = new Resultado(driver);
		print = new Print();
		navegador = new Navegador();
		action = new Actions(driver);
	}
	
	/**
	 * Acessa a categoria de ajuda 
	 */
	public void acessarAjuda(){

		resultado.clickPerguntasFrequentes();
		
	}
	
	/**
	 * Realiza a expansão dos elementos de perguntas frequentes, apresentados na tela de "Ajuda"
	 */
	public void expandirPerguntas( ){
		
		resultado.clickPerguntas();
		String perguntas = resultado.getTextPerguntas();
		System.out.println(perguntas);
		print.tirarPrint(driver, "Ex1 - PerguntasFrequentes");
		//driver.close();
	}
	
	/**
	 * Acessa menu Institucional
	 */
	public void acessaInstitucional(){
		
		resultado.clickPerguntasFrequentes();
		resultado.clickInstitucional();
		
	}
	
	/**
	 * Valida todas as informações institucionais como Telefone, Atendimento, Onde localizar, Onde comprar cartão e enviar currículo
	 */
	public void validaInformacoesIntitucionais(){
		
		resultado.getTelefoneCartao();
		resultado.getAtendimentoLoja();
		resultado.getOndeLocalizar();
		resultado.getComprarCartao();
		resultado.getEnviarCurriculo();
		print.tirarPrint(driver, "Ex2 - Institucional");
		//driver.close();
		
	}
	
	/**
	 * Acessar menu de telefone do cartão
	 */
	public void acessarTelefonedoCartao(){
		
		resultado.clickPerguntasFrequentes();
		resultado.clickInstitucional();
		resultado.clickTelefoneCartao();
		
	}
	
	/** Baixa arquivo de imagem dos cartões
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public void downloadImg(){
		
		action.contextClick(resultado.getImg()).build().perform();
		action.sendKeys(Keys.SHIFT, "s").build().perform();
		print.tirarPrint(driver, "Ex3 - ImagemCartão");
		//driver.close();
	}	

}
