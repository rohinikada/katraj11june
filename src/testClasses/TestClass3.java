package testClasses;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass1;
import pomProgram.HomePage;
import pomProgram.LoginPage;
import pomProgram.ProfilePage;

public class TestClass3 {

static WebDriver driver;
	
	LoginPage lp;
	HomePage hp;
	ProfilePage pp;
	
	@BeforeClass
	public void beforeClass() {
		
		driver = BaseClass1.getDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		pp = new ProfilePage(driver);
	}
	
	
	@Test(priority = 1)
	public void verifyUserCanOpenProfilePage() {
		
		//hover on profileName
		hp.hoverProfileName();
		
		//click on my profile
		hp.clickOnMyProfile();
		
		//check page is opened
		boolean onPage = pp.checkUserOnProfilePage();
		
		if(onPage) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}	
	}
	
	@DataProvider(name="addressData")
	public Object[][] getData() {
		
		
		
		
		
		Object[][] k = {{"Harsha", "8956235623","413512","Nanded Road", "B-22, A pune"}, {"Sneha","7845124512", "411023", "Warje", "A-32, B shivaji nagar"}};
		return k;
	}
	
	@Test(priority = 2, dataProvider="addressData")
	public void addNewAddress(String name, String phone, String pincode, String locality, String fullAddress) {
		
		pp.clickOnManageAddress();
		
		List<String> addressDetails = Arrays.asList(name, phone, pincode, locality, fullAddress);
		
		pp.addNewAddress(addressDetails);
		
		
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
