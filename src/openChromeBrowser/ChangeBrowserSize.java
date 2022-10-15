package openChromeBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeBrowserSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		int x = driver.manage().window().getSize().getWidth();
		int y = driver.manage().window().getSize().getHeight();
		System.out.println("width is :" + x + "Height is:" + y);
				
		//x=1000pixel
		//y=500pixel
		Dimension p = new Dimension(1000,500);
		driver.manage().window().setSize(p);
		int x1=driver.manage().window().getSize().getWidth();  //x axis
		
		int y1=driver.manage().window().getSize().getHeight();//y axis
		System.out.println("new width is : "+ x1 +"new height is : " + y1);
				
		
		
		
		
		
	}

	}


