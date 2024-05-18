package ParaBank;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;




public class Baselogin  {
	WebDriver W= new EdgeDriver();
	private String firstname;
	private String Lastname;
	@Parameters("URL")
  @BeforeTest
  public void URL(@Optional String URL) {
		W.manage().window().maximize();
		W.get(URL);
		}
	@AfterSuite
	void teardown() {
		W.quit();
	}
	
	 

			
	  }
 

 

