package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Print {
	
	
	
	public void tirarPrint(WebDriver driver, String nomePrint){
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(scrFile, new File("./evidencias/",nomePrint+"_"+dateFormat.format(date)+".png"));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}

}
