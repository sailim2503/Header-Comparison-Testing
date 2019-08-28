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
	
	File file=new File("C:\\Users\\saili.m\\Desktop\\Testing.xlsx");	
	String baseUrl1 = "https://www.forbes.com/industry/";
	String baseUrl2="https://www.forbes.com/advisor/";
	String list1;
	String list2;
	String arr1[]=new String[50];
	String arr2[]=new String[50];
	
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
	  TakesScreenshot scrshot=((TakesScreenshot)driver);
	  File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
	  File DestFile=new File("C:\\Users\\saili.m\\Screenshots\\IndustryPage.png");
	  FileHandler.copy(SrcFile, DestFile);
	  FileInputStream fis=new FileInputStream(file);
  	  //Reading data from excel file
   	  
  XSSFWorkbook workbook=new XSSFWorkbook(fis);
  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
  Sheet sh=workbook.getSheet("Sheet3");
  	  
  Row r=sh.getRow(1);
  if(r==null) 
      r=sh.createRow(1);
	  
	  
	  
	  
	  
	  
		List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul"));
		
		for(WebElement li:list) 
			list1=li.getText();
		Cell cell=r.createCell(0);
		cell.setCellValue(list1);
	String arr1[]=list1.split("\n");
			
	fis.close();
	  FileOutputStream fos=new FileOutputStream(file);
	  workbook.write(fos);
	  fos.close();
		
  }
  @Test(priority=1)
  public void advisorPage() throws IOException {
	  driver = new ChromeDriver();
	  driver.get(baseUrl2);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  TakesScreenshot scrshot=((TakesScreenshot)driver);
	  File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
	  File DestFile=new File("C:\\Users\\saili.m\\Screenshots\\AdvisorPage.png");
	  FileHandler.copy(SrcFile, DestFile);
	  FileInputStream fis=new FileInputStream(file);
  	  //Reading data from excel file
   	  
  XSSFWorkbook workbook=new XSSFWorkbook(fis);
  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
  Sheet sh=workbook.getSheet("Sheet3");
  	  
  Row r=sh.getRow(1);
  if(r==null) 
      r=sh.createRow(1);

	  
	  
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"menu-header-forbes-style\"]"));
		
		for(WebElement li:list) 
			list2=li.getText();
		Cell cell=r.createCell(1);
		cell.setCellValue(list1);
		String arr2[]=list2.split("\n");
		
		fis.close();
		  FileOutputStream fos=new FileOutputStream(file);
		  workbook.write(fos);
		  fos.close();
  }
  @Test(priority=2)
  public void compare(){
	  boolean match=true;
	  for(int i=0;i<arr1.length;i++) {
		  if(arr1[i]!=arr2[i])
			  match=false;
	  }
	  if(match==true)
			  System.out.println("Header channels for FORBES INDUSTRY PAGE MATCHES with ADVISOR PAGE");
	  else
			  System.out.println("Header channels for FORBES INDUSTRY PAGE DOES NOT MATCH with ADVISOR PAGE");
		  
	  }
  
  
  
  /*@AfterTest
  public void afterTest() {
	 driver.close();
  }*/
}
