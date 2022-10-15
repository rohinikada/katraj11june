package apachePoiProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFetchFromExcellSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.flipkart.com/");
		
		FileInputStream file = new FileInputStream("C:\\HP\\data1.xlsx");
		
		Workbook work = WorkbookFactory.create(file);
		
		Sheet sheet = work.getSheet("Sheet1");
	  
		Row row = sheet.getRow(0);
	
		Cell cell = row.getCell(0);
		String expectedData = cell.getStringCellValue();  
		System.out.println(expectedData);
		

	}

}
