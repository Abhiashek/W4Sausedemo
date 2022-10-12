package com.sausedemo.utlity.Class;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import com.pom.all.Loginpomclass;

public class Screenshot {
	
	public static void TakeScrrenshot(WebDriver driver,String ssname) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy&HH-mm-ss");
		String Date = d1.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File salefile=ts.getScreenshotAs(OutputType.FILE);
		File Myfile=new File("./ScreenshotFolder\\"+ssname+Date+".jpg ");
		FileHandler.copy(salefile, Myfile);
	
	}

	
	
}

