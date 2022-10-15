package pkg2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","c:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
driver.manage().window().maximize();

int x=driver.manage().window().getSize().getWidth();   //x axis
int y=driver.manage().window().getSize().getHeight();
System.out.println("width is :"+ x + "height is :");

//x-1000px
//y-500px
Dimension p = new Dimension(1000,500);
driver.manage().window().setSize(p);

int x1=driver.manage().window().getSize().getWidth();   //x axis
int y1=driver.manage().window().getSize().getHeight();
System.out.println("new width is :"+ x + " new height is :");

	}

}
