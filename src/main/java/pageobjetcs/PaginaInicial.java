package pageobjetcs;

import org.openqa.selenium.WebDriver;

public class PaginaInicial extends Page {
	
	public PaginaInicial(WebDriver driver){
		super (driver);	
	}
	
	public String getURL(){
		return driver.getCurrentUrl();
		
	}

}
