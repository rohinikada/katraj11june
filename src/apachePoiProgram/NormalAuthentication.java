package apachePoiProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAuthentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/basic_auth";
		String userName = "admin";
		String password = "admin";
		
    String newUrl="https://"+userName +":"+password+"@the-internet.herokuapp.com/basic_auth";
    driver.get(newUrl);
		
	}



	}


