package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import baseClass.BaseClass1;
import pomProgram.HomePage;
import pomProgram.LoginPage;
import pomProgram.ProfilePage;

public class TestClass1 {

	//public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

	//	WebDriver driver = new ChromeDriver();   //object-->Upcasting
	//	driver.get("https://www.flipkart.com/");
//	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//}	login(driver);
//	
//	public static void login(WebDriver driver ) 
//	
//	{
//	LoginPage lp = new LoginPage(driver);	
//	lp.enterEmailID();
//	lp.enterPassword();
//	lp.clickOnSubmitBtn();
//	
//	}	
	
static WebDriver driver;
	
	LoginPage lp;
	HomePage hp;
	
	
	@BeforeClass
	public void beforeClass() {
		
		driver = BaseClass1.getDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
   }
	@Test
	public void test1() throws InterruptedException {
		lp.enterEmailID();
		lp.enterPassword();
		lp.clickOnSubmitBtn();
		
		
		String profileName = hp.getProfileName();
		
		if(profileName.equals("Harsha")) {  
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
	}
	
	@AfterMethod
	public void afterMethod(){
		
	}
	
	
	@AfterClass
	public void afterClass() {
		
	}

	

}



