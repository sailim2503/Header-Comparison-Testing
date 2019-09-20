import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ComparingHeaderChannels {
	public WebDriver driver;
    String baseUrl1 = "https://www.forbes.com/";
	String baseUrl2="https://www.forbes.com/advisor/";
	String list1;
	String list2;
	String arr1[];
	String arr2[];
	
	@BeforeTest
	public void beforeTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saili.m\\chromedriver_win32\\chromedriver.exe");
	}	
	
  @Test(priority=0)
  public void forbesIndustryPage() throws IOException {
	  driver = new ChromeDriver();
	  driver.get(baseUrl1);
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
		List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul"));
		arr1=new String[list.size()];
		for(WebElement li:list) 
			list1=li.getText();
   String arr1[]=list1.split("\n");
	for(int i=0;i<arr1.length;i++) {
		System.out.println("Industry:"+arr1[i]);
	}
	  driver = new ChromeDriver();
	  driver.get(baseUrl2);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	 List<WebElement> list1=driver.findElements(By.xpath("//*[@id=\"menu-header-forbes-style\"]"));
		arr2=new String[list1.size()];
		for(WebElement li:list1) 
			list2=li.getText();
		String arr2[]=list2.split("\n");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("advisor:"+arr2[i]);
		}
	 int size=arr1.length;
	 for(int i=0;i<size;i++) {
		 String str1=arr1[i];
		 String str2=arr2[i];
		 if(!(str1.equals(str2)))
			  System.out.println("Header channels for FORBES PAGE DOES NOT MATCH with ADVISOR PAGE:"+str1); 
		 else
			 continue;
	  }
	  }
  
     @AfterTest
  public void afterTest() {
	 driver.close();
  }
}
