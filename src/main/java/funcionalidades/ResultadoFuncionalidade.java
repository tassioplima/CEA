package funcionalidades;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

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
		navegador.tearDown();
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
		navegador.tearDown();
		
	}
	
	/**
	 * Acessar menu de telefone do cartão
	 */
	public void acessarTelefonedoCartao(){
		
		resultado.clickPerguntasFrequentes();
		resultado.clickInstitucional();
		resultado.clickTelefoneCartao();
		
	}
	
	public void downloadImg() throws IOException, MalformedURLException{
		
		//action.contextClick(resultado.getImg()).build().perform();
		try {
			String cartaoImg = resultado.getImg().getAttribute("src");
			URL imageURL = new URL(cartaoImg);
			BufferedImage saveImage = ImageIO.read(imageURL);
			
			ImageIO.write(saveImage, "png", new File("cartao.png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
		}
		
		//action.sendKeys(Keys.SHIFT, "s").build().perform();
		
	}
	
	
	

}
