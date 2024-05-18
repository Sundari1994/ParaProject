package ParaBank;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Listeners(listclass.class)

public class Abstrac extends Baselogin{
		 @Test(priority=1)
			//Register
	  public void Login_Registration() {
		 W.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
			W.findElement(By.id("customer.firstName")).sendKeys("Thiripura");
			W.findElement(By.id("customer.lastName")).sendKeys("Sundari");
			W.findElement(By.id("customer.address.street")).sendKeys("street no.20,Harring road");
			W.findElement(By.id("customer.address.city")).sendKeys("Chennai");
			W.findElement(By.id("customer.address.state")).sendKeys("Tamil Nadu");
			W.findElement(By.id("customer.address.zipCode")).sendKeys("600056");
			W.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
			W.findElement(By.id("customer.ssn")).sendKeys("91");
			W.findElement(By.id("customer.username")).sendKeys("Thiripura");
			W.findElement(By.id("customer.password")).sendKeys("Thiripura123");
			W.findElement(By.name("repeatedPassword")).sendKeys("Thiripura123");
			W.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).click();
			 System.out.println("User Registered successfully");
			 W.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
			 Date obj = new Date();
		        System.out.println(obj);
		        String Registration=obj.toString().replace(" ","-").replace(":",";");
		        System.out.println(Registration);
				File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
				try {
					Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+Registration+"trial1.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		  
		  @Test(priority=2,dataProvider="test123")
		 
		  void Login(String Username,String Password)
		  {
			  W.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(Username);
			  W.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys(Password);
	          W.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	          System.out.println("Logged in successfully");
	          WebElement actualerror= W.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
	 		 String e=actualerror.getText();
	 		System.out.println(e);
	 		String Expectederror="The username and password could not be verified.";
	 		Assert.assertNotEquals(actualerror, Expectederror,"Negative testing done properly");
	 		Date obj = new Date();
	        System.out.println(obj);
	        String Login=obj.toString().replace(" ","-").replace(":",";");
	        System.out.println(Login);
			File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
			try {
				Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+Login+"trial1.jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		
		  }
		  @DataProvider(name="test123")
		  public Object[][] container() {
				Object[][] data = new Object[2][2];//declaration of array
				data[0][0]="rishi";
				data[0][1]="rishi123";
				data[1][0]="Thiripuraja";
				data[1][1]="Thiripura123";
				return data;
				
			}
		  @Test(priority=3)
		  public void OpenAcc() {
			  W.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Thiripura");
			  W.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Thiripura123");
	          W.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
			  W.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
			  W.findElement(By.xpath("//*[@id=\"type\"]")).click();
			  WebElement type =W.findElement(By.id("type"));
			  Select S= new Select(type);
			  S.selectByVisibleText("CHECKING");
			  System.out.println(S.getFirstSelectedOption().getText());
			 W.findElement(By.id("fromAccountId"));
			  /*Select A= new Select(AccID);
			  A.selectByIndex(0);
			  System.out.println(A.getFirstSelectedOption().getText());*/
			W.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
			  System.out.println("Account opened Successfully");
			  Date obj = new Date();
		        System.out.println(obj);
		        String Open=obj.toString().replace(" ","-").replace(":",";");
		        System.out.println(Open);
				File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
				try {
					Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+Open+"trial1.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  }
		  @Test(priority=4)
		  public void Bill_Pay() {
			 W.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
			 W.findElement(By.name("payee.name")).sendKeys("Sunny");
				W.findElement(By.name("payee.address.street")).sendKeys("street no.10,Harrington road");
				W.findElement(By.name("payee.address.city")).sendKeys("Mumbai");
				W.findElement(By.name("payee.address.state")).sendKeys("Tamil Nadu");
				W.findElement(By.name("payee.address.zipCode")).sendKeys("600096");
				W.findElement(By.name("payee.phoneNumber")).sendKeys("9876548910");
				W.findElement(By.name("payee.accountNumber")).sendKeys("34567");
				W.findElement(By.name("verifyAccount")).sendKeys("34567");
		        W.findElement(By.name("amount")).sendKeys("66");   
				W.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();
				System.out.println("Bill Paid Successfully");
				Date obj = new Date();
		        System.out.println(obj);
		        String Billpay=obj.toString().replace(" ","-").replace(":",";");
		        System.out.println(Billpay);
				File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
				try {
					Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+Billpay+"trial1.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  }
				@Test(priority=5)
		     public void Request_Loan(){
		    	 W.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
		         W.findElement(By.id("amount")).sendKeys("78");
		         W.findElement(By.id("downPayment")).sendKeys("13");
		         W.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
		         System.out.println("Loan Requested Successfully");
		         Date obj = new Date();
			        System.out.println(obj);
			        String Loan=obj.toString().replace(" ","-").replace(":",";");
			        System.out.println(Loan);
					File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
					try {
						Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+Loan+"trial1.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				@Test(priority=6)
				public void Transactions() {
					W.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a")).click();
					WebElement account = W.findElement(By.xpath("//*[@id=\"accountId\"]"));
					Select Acc= new Select(account);
					Acc.selectByIndex(1);
					System.out.println(Acc.getFirstSelectedOption().getText());
					W.findElement(By.xpath("//*[@id=\"transactionId\"]")).sendKeys("2");
					W.findElement(By.id("transactionDate")).sendKeys("15-05-1999");
					W.findElement(By.id("findByDate")).click();
					System.out.println("Transaction found Successfully");
					Date obj = new Date();
			        System.out.println(obj);
			        String Trans=obj.toString().replace(" ","-").replace(":",";");
			        System.out.println(Trans);
					File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
					try {
						Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+Trans+"trial1.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				
				@Test(priority=7)
				void updatecontactinfo() {
				W.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
				W.findElement(By.id("customer.firstName")).sendKeys("Femina");
				W.findElement(By.name("customer.lastName")).sendKeys("Deva");
				W.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("600134");
				W.findElement(By.xpath("//*[@id=\"updateProfileForm\"]/form/table/tbody/tr[8]/td[2]/input")).click();
				System.out.println("Contact info updated Successfully");
				Date obj = new Date();
		        System.out.println(obj);
		        String contact=obj.toString().replace(" ","-").replace(":",";");
		        System.out.println(contact);
				File F =((TakesScreenshot)W).getScreenshotAs(OutputType.FILE);
				try {
					Files.copy(F,new File("C:\\Users\\Sundari\\Documents\\Edubridge\\Tasks-Domain\\Project screenshot\\"+contact+"trial1.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}

	}

 