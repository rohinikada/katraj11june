package testClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass1;
import pomProgram.HomePage;
import pomProgram.LoginPage;

public class TestClass2 {

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
	
	
	@DataProvider(name="testData")
	public String[] getData() {
		
		String[] pName = {"realme", "apple"};
		
		return pName;
	}
	

	@Test(priority = 1)
	public void VerifyUserCanSearchProduct() throws InterruptedException {
		
		hp.searchProduct();
		
		hp = new HomePage(driver);
		
		String actualText = hp.getValidText();
		
		if(actualText.contains("Showing 1-")) {
			System.out.println("Test case Passed");
		}else {
			Assert.fail();
		}	
	}
	
	@Test(priority = 2)
	public void VerifyUserCanGetLowestPriceProductFromEachPage() {
		
		List<String> lowsetPriceFron5Page = new ArrayList<>();
		
		Map<Integer, String> lowPriceMap = new HashMap<>();
		
		for(int i=1; i<=5; i++) {
			
			if(i != 1) {
				
				hp.switchToPage(i);
			}
			hp = new HomePage(driver);
			
		//	lowsetPriceFron5Page.add(hp.getLowestPriceOfProduct());
			
			lowPriceMap.put(i, hp.getLowestPriceOfProduct());
		}
		
		System.out.println(lowPriceMap);
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
}



