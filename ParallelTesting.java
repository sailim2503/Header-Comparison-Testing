import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ParallelTesting {
    WebDriver driver;
	String baseUrl1 = "https://www.forbes.com/";
	String baseUrl2="https://www.forbes.com/advisor/";
	File file=new File("C:\\Users\\saili.m\\Desktop\\Testing.xlsx");
	
	
	String arrlink1[]=new String[11];
	String arrlink2[]=new String[11];
    
   	String arr01[]=new String[30];
	String arr02[]=new String[30];
	String arr03[]=new String[30];
	String arr04[]=new String[30];
	String arr05[]=new String[30];
	String arr06[]=new String[30];
	String arr07[]=new String[30];
	String arr08[]=new String[30];
	String arr09[]=new String[30];
	String arr010[]=new String[30];
	String arr011[]=new String[30];
	String arr11[]=new String[30];
	String arr12[]=new String[30];
	String arr13[]=new String[30];
	String arr14[]=new String[30];
	String arr15[]=new String[30];
	String arr16[]=new String[30];
	String arr17[]=new String[30];
	String arr18[]=new String[30];
	String arr19[]=new String[30];
	String arr110[]=new String[30];
	String arr111[]=new String[30];

  @Test(priority=0)
  public void industryPage() throws IOException {
	  
		FileInputStream fis=new FileInputStream(file);
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  Sheet sh=workbook.getSheet("Sheet1");
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\saili.m\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseUrl1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TakesScreenshot scrshot=((TakesScreenshot)driver);
	  	 
		//1
		  Actions action=new Actions(driver);
	 WebElement menuOption1=driver.findElement(By.xpath("//a[@class='header__title'][contains(text(),'Billionaires')]"));
		  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		  arrlink1[0]=driver.findElement(By.xpath("//a[@class='header__title'][contains(text(),'Billionaires')]")).getAttribute("href");
		  action.moveToElement(menuOption1).build().perform();
		  //System.out.println("List of Elements for Billionaries");
		  List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='header__sections header__color--centennial-silver']"));
		  
		  File SrcFile1=scrshot.getScreenshotAs(OutputType.FILE);
		  File DestFile1=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Billionarie.png");
		  FileHandler.copy(SrcFile1, DestFile1);
		  Row r1=sh.getRow(1);
		  if(r1==null) 
		      r1=sh.createRow(1); 
	      for(WebElement l1:list1) {
	    	Cell cell=r1.createCell(0);
	    	cell.setCellValue(l1.getText());
	    	arr01=l1.getText().split("\n");	      
	      
	      }
	      
		  
	      
	     //2
	       
	  	  WebElement menuOption2=driver.findElement(By.xpath("//a[contains(text(),'Innovation')]"));
	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  	  arrlink1[1]=driver.findElement(By.xpath("//a[contains(text(),'Innovation')]")).getAttribute("href");
	  	  action.moveToElement(menuOption2).build().perform();
	  	  //System.out.println("List of Elements for Innovation");
	  	  List<WebElement> list2=driver.findElements(By.xpath("//ul[@class='header__sections header__color--diamondring-blue']"));
	  	 
		  File SrcFile2=scrshot.getScreenshotAs(OutputType.FILE);
		  File DestFile2=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Innovation.png");
		  FileHandler.copy(SrcFile2, DestFile2);
	  	Row r2=sh.getRow(3);
		  if(r2==null) 
		      r2=sh.createRow(3);
	  	 for(WebElement l2:list2) {
	  		Cell cell=r2.createCell(0);
	    	cell.setCellValue(l2.getText());
	 	  	 arr02=l2.getText().split("\n");
	  	 }
	  	  
	  	  
	  	
	  	   
	  	  //3
	  	WebElement menuOption3=driver.findElement(By.xpath("//a[@class='header__title'][contains(text(),'Leadership')]"));
	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  	arrlink1[2]=driver.findElement(By.xpath("//a[@class='header__title'][contains(text(),'Leadership')]")).getAttribute("href");
	  	  action.moveToElement(menuOption3).build().perform();
	  	  //System.out.println("List of Elements for Leadership");
	  	  List<WebElement> list3=driver.findElements(By.xpath("//ul[@class='header__sections header__color--fortknox-gold']"));
	  	File SrcFile3=scrshot.getScreenshotAs(OutputType.FILE);
		  File DestFile3=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Leadership.png");
		  FileHandler.copy(SrcFile3, DestFile3);
	  	  Row r3=sh.getRow(5);
		  if(r3==null) 
		      r3=sh.createRow(5);
	  	  for(WebElement l3:list3) {
	  		Cell cell=r3.createCell(0);
	    	cell.setCellValue(l3.getText());
	    	 arr03=l3.getText().split("\n");
	  	  }
	  		
	  	  
	  	  
	  	  //4
	  	WebElement menuOption4=driver.findElement(By.xpath("//a[@class='header__title'][contains(text(),'Money')]"));
	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  	arrlink1[3]=driver.findElement(By.xpath("//a[@class='header__title'][contains(text(),'Money')]")).getAttribute("href");
	  	  action.moveToElement(menuOption4).build().perform();
	  	  //System.out.println("List of Elements for Money");
	  	  List<WebElement> list4=driver.findElements(By.xpath("//ul[@class='header__sections header__color--benjamins-green']"));
	  	  File SrcFile4=scrshot.getScreenshotAs(OutputType.FILE);
		  File DestFile4=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Money.png");
		  FileHandler.copy(SrcFile4, DestFile4);
	  	  Row r4=sh.getRow(7);
		  if(r4==null) 
		      r4=sh.createRow(7);
	  	 
	  	  for(WebElement l4:list4) {
	  		Cell cell=r4.createCell(0);
	    	cell.setCellValue(l4.getText()); 
	    	arr04=l4.getText().split("\n");
	  	  }
	  		
	  	  
	  	 
	  	  
	  	//5
		  	WebElement menuOption5=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[5]/a"));
		  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		  	arrlink1[4]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[5]/a")).getAttribute("href");
		  	  action.moveToElement(menuOption5).build().perform();
		  	 // System.out.println("List of Elements for Consumer");
		  	  List<WebElement> list5=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[5]/div[2]/ul"));
		  	File SrcFile5=scrshot.getScreenshotAs(OutputType.FILE);
			  File DestFile5=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Consumer.png");
			  FileHandler.copy(SrcFile5, DestFile5);
		  	Row r5=sh.getRow(9);
			  if(r5==null) 
			      r5=sh.createRow(9);
		  		for(WebElement l5:list5) {
		  			Cell cell=r5.createCell(0);
			    	cell.setCellValue(l5.getText()); 
		  			arr05=l5.getText().split("\n");
		  		}
			  		
		  	  
		  	  
			  	 
		  	  
		  	//6
			  	WebElement menuOption6=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[6]/a"));
			  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			  	arrlink1[5]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[6]/a")).getAttribute("href");
			  	  action.moveToElement(menuOption6).build().perform();
			  	//  System.out.println("List of Elements for Industry");
			  	  List<WebElement> list6=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[6]/div[2]/ul"));
			  	File SrcFile6=scrshot.getScreenshotAs(OutputType.FILE);
				  File DestFile6=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Industry.png");
				  FileHandler.copy(SrcFile6, DestFile6);
			  	Row r6=sh.getRow(11);
				  if(r6==null) 
				      r6=sh.createRow(11);
			  	  for(WebElement l6:list6) {
			  		Cell cell=r6.createCell(0);
			    	cell.setCellValue(l6.getText()); 
			  		arr06=l6.getText().split("\n");
			  	  }
			  		
			  	  
			  	  
			  	  
			 //7
				  	WebElement menuOption7=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[7]/a"));
				  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
				  	arrlink1[6]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[7]/a")).getAttribute("href");
				  	  action.moveToElement(menuOption7).build().perform();
				  //	  System.out.println("List of Elements for Lifestyle");
				  	  List<WebElement> list7=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[7]/div[2]/ul"));
				  	File SrcFile7=scrshot.getScreenshotAs(OutputType.FILE);
					  File DestFile7=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Lifestyle.png");
					  FileHandler.copy(SrcFile7, DestFile7);
				  	  Row r7=sh.getRow(13);
					  if(r7==null) 
					      r7=sh.createRow(13);
				  	  for(WebElement l7:list7) {
				  		Cell cell=r7.createCell(0);
				    	cell.setCellValue(l7.getText()); 
				    	arr07=l7.getText().split("\n");
				  	  }
				  		
				  	  
				  	  
				  	//8
					  	WebElement menuOption8=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[8]/span"));
					  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
					  	arrlink1[7]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[8]/span")).getAttribute("href");
					  	  action.moveToElement(menuOption8).build().perform();
					//  	  System.out.println("List of Elements for BrandVoice");
					  	  List<WebElement> list8=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[8]/div[2]/ul"));
					  	File SrcFile8=scrshot.getScreenshotAs(OutputType.FILE);
						  File DestFile8=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\BrandVoice.png");
						  FileHandler.copy(SrcFile8, DestFile8);
					  	Row r8=sh.getRow(15);
						  if(r8==null) 
						      r8=sh.createRow(15);
					  	  for(WebElement l8:list8) {
					  		Cell cell=r8.createCell(0);
					    	cell.setCellValue(l8.getText());
					    	arr08=l8.getText().split("\n");
					  	  }
					  		
					  	  
					  	   
					  	//9
						  	WebElement menuOption9=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[9]/a"));
						  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
						  	arrlink1[8]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[9]/a")).getAttribute("href");
						  	  action.moveToElement(menuOption9).build().perform();
						//  	  System.out.println("List of Elements for Lists");
						  	  List<WebElement> list9=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[9]/div[2]/ul"));
						  	File SrcFile9=scrshot.getScreenshotAs(OutputType.FILE);
							  File DestFile9=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Lists.png");
							  FileHandler.copy(SrcFile9, DestFile9);
						  	  Row r9=sh.getRow(17);
							  if(r9==null) 
							      r9=sh.createRow(17);
						  	for(WebElement l9:list9) {
						  		Cell cell=r9.createCell(0);
						    	cell.setCellValue(l9.getText());
						    	arr09=l9.getText().split("\n");
						  	}
				      	      	  
				      	      
				      	       
							  	 
						  	  
						  	//10
								  	WebElement menuOption10=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[10]/a"));
								  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
								  	arrlink1[9]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[10]/a")).getAttribute("href");
								  	  action.moveToElement(menuOption10).build().perform();
							//	  	  System.out.println("List of Elements for Advisor");
								  	  List<WebElement> list10=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[10]/div[2]/ul"));
								  	File SrcFile10=scrshot.getScreenshotAs(OutputType.FILE);
									  File DestFile10=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Advisor.png");
									  FileHandler.copy(SrcFile10, DestFile10);
								  	  Row r10=sh.getRow(19);
									  if(r10==null) 
									      r10=sh.createRow(19);
								  	  for(WebElement l10:list10) {
								  		Cell cell=r10.createCell(0);
								    	cell.setCellValue(l10.getText());
								    	arr010=l10.getText().split("\n");
								  	  }
								  		
								 	
								  	 
							  	//11
								  	WebElement menuOption11=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[11]/span"));
								  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
								  	arrlink1[10]=driver.findElement(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[11]/span")).getAttribute("href");
								  	  action.moveToElement(menuOption11).build().perform();
								 // 	  System.out.println("List of Elements for Featured");
								  	  List<WebElement> list11=driver.findElements(By.xpath("/html/body/div[1]/header/nav/div[2]/ul/li[11]/div[2]/ul"));
								  	File SrcFile11=scrshot.getScreenshotAs(OutputType.FILE);
									  File DestFile11=new File("C:\\Users\\saili.m\\Screenshots\\Industry Page\\Featured.png");
									  FileHandler.copy(SrcFile11, DestFile11);
								  	  Row r11=sh.getRow(21);
									  if(r11==null) 
									      r11=sh.createRow(21);
								  	  for(WebElement l11:list11) {
								  		Cell cell=r11.createCell(0);
								    	cell.setCellValue(l11.getText());
								    	arr011=l11.getText().split("\n");
								  	  }
								
					      	        	
								  	  
								  	fis.close();
									  FileOutputStream fos=new FileOutputStream(file);
									 workbook.write(fos);
									 fos.close();
								  	  
  }
	    
        
 @Test(priority=1)
public void advisorPage() throws IOException {
	 FileInputStream fis=new FileInputStream(file);
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  Sheet sh=workbook.getSheet("Sheet2");
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\saili.m\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	      		
	      		driver.get(baseUrl2);
	      		driver.manage().window().maximize();
	      		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      		TakesScreenshot scrshot=((TakesScreenshot)driver);
	      		
	      	  	 
	      		//1
	      		  Actions action=new Actions(driver);
	      	  WebElement menuOption1=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2527']/a[1]"));
	      		  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	      		  arrlink2[0]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2527']/a[1]")).getAttribute("href");
	      		  action.moveToElement(menuOption1).build().perform();
	      		//  System.out.println("List of Elements for Billionaries");
	      		  List<WebElement> list1=driver.findElements(By.xpath("//li[@id='menu-item-2527']//ul[@class='sub-menu']"));
	      		File SrcFile1=scrshot.getScreenshotAs(OutputType.FILE);
				  File DestFile1=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Billionaries.png");
				  FileHandler.copy(SrcFile1, DestFile1);
	      	 Row r1=sh.getRow(1);
	  		  if(r1==null) 
	  		      r1=sh.createRow(1); 
	      	      for(WebElement l1:list1) {
	      	    	Cell cell=r1.createCell(0);
	    	    	cell.setCellValue(l1.getText());
	    	    	arr11=l1.getText().split("\n");
	      	      }
	      	     for(int i=0;i<arr11.length;i++) {
	      	    	 if(arr11[i].contains("’")) {
	      	    		 arr11[i]=arr11[i].replace("’", "'");
	      	    	 }
	      	     }
	      		  
	      	     //2
	      	        
	      	  	  WebElement menuOption2=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2544']/a[1]"));
	      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	      	  	  action.moveToElement(menuOption2).build().perform();
	      	  	arrlink2[1]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2544']/a[1]")).getAttribute("href");
	      	  //	  System.out.println("List of Elements for Innovation");
	      	  	  List<WebElement> list2=driver.findElements(By.xpath("//li[@id='menu-item-2544']//ul[@class='sub-menu']"));
	      	  	 File SrcFile2=scrshot.getScreenshotAs(OutputType.FILE);
	   		  File DestFile2=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Innovation.png");
	   		  FileHandler.copy(SrcFile2, DestFile2);
	      		Row r2=sh.getRow(3);
	  		  if(r2==null) 
	  		      r2=sh.createRow(3);
	      	        for(WebElement l2:list2) {
	      	        	Cell cell=r2.createCell(0);
	      		    	cell.setCellValue(l2.getText());
	      		    	arr12=l2.getText().split("\n"); 
	      	        }
	      	      for(int i=0;i<arr12.length;i++) {
		      	    	 if(arr12[i].contains("’")) {
		      	    		 arr12[i]=arr12[i].replace("’", "'");
		      	    	 }
		      	     }  
	      	     
	     	  	     
	      	    //3
	      	        
		      	  	  WebElement menuOption3=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2563']/a[1]"));
		      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		      	  	arrlink2[2]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2563']/a[1]")).getAttribute("href");
		      	  	  action.moveToElement(menuOption3).build().perform();
		      	 // 	  System.out.println("List of Elements for Leadership");
		      	  	  List<WebElement> list3=driver.findElements(By.xpath("//li[@id='menu-item-2563']//ul[@class='sub-menu']"));
		      	  	File SrcFile3=scrshot.getScreenshotAs(OutputType.FILE);
		  		  File DestFile3=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Leadership.png");
		  		  FileHandler.copy(SrcFile3, DestFile3);
		      	  	Row r3=sh.getRow(5);
		  		  if(r3==null) 
		  		      r3=sh.createRow(5);
		      	        for(WebElement l3:list3) {
		      	        	Cell cell=r3.createCell(0);
		      		    	cell.setCellValue(l3.getText());
		      		    	arr13=l3.getText().split("\n");
		      	        }
		      	      for(int i=0;i<arr13.length;i++) {
			      	    	 if(arr13[i].contains("’")) {
			      	    		 arr13[i]=arr13[i].replace("’", "'");
			      	    	 }
			      	     }
		      	      	  
		      	    //4
		      	        
			      	  	  WebElement menuOption4=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2576']/a[1]"));
			      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			      	  	arrlink2[3]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2576']/a[1]")).getAttribute("href");
			      	  	  action.moveToElement(menuOption4).build().perform();
			      	  //	  System.out.println("List of Elements for Money");
			      	  	  List<WebElement> list4=driver.findElements(By.xpath("//li[@id='menu-item-2576']//ul[@class='sub-menu']"));
			      	  	File SrcFile4=scrshot.getScreenshotAs(OutputType.FILE);
			  		  File DestFile4=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Money.png");
			  		  FileHandler.copy(SrcFile4, DestFile4);
			      	  	Row r4=sh.getRow(7);
			  		  if(r4==null) 
			  		      r4=sh.createRow(7);
			      	        for(WebElement l4:list4) {
			      	        	Cell cell=r4.createCell(0);
			      		    	cell.setCellValue(l4.getText()); 
			      		    	 arr14=l4.getText().split("\n");
			      	        }
			      	      for(int i=0;i<arr14.length;i++) {
				      	    	 if(arr14[i].contains("’")) {
				      	    		 arr14[i]=arr14[i].replace("’", "'");
				      	    	 }
				      	     } 
			      	        
			      	    //5
			      	        
				      	  	  WebElement menuOption5=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2591']/a[1]"));
				      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
				      	  	arrlink2[4]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2591']/a[1]")).getAttribute("href");
				      	  	  action.moveToElement(menuOption5).build().perform();
				      //	  	  System.out.println("List of Elements for Consumer");
				      	  	  List<WebElement> list5=driver.findElements(By.xpath("//li[@id='menu-item-2591']//ul[@class='sub-menu']"));
				      	  	File SrcFile5=scrshot.getScreenshotAs(OutputType.FILE);
							  File DestFile5=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Consumer.png");
							  FileHandler.copy(SrcFile5, DestFile5);
				      	  	Row r5=sh.getRow(9);
							  if(r5==null) 
							      r5=sh.createRow(9);
				      	        for(WebElement l5:list5) {
				      	        	Cell cell=r5.createCell(0);
							    	cell.setCellValue(l5.getText()); 
							    	 arr15=l5.getText().split("\n");
				      	        }
				      	      for(int i=0;i<arr15.length;i++) {
					      	    	 if(arr15[i].contains("’")) {
					      	    		 arr15[i]=arr15[i].replace("’", "'");
					      	    	 }
					      	     } 
				      	        
				      	    //6
				      	        
					      	  	  WebElement menuOption6=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2599']/a[1]"));
					      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
					      	  	arrlink2[5]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2599']/a[1]")).getAttribute("href");
					      	  	  action.moveToElement(menuOption6).build().perform();
					      //	  	  System.out.println("List of Elements for Industry");
					      	  	  List<WebElement> list6=driver.findElements(By.xpath("//li[@id='menu-item-2599']//ul[@class='sub-menu']"));
					      	  	File SrcFile6=scrshot.getScreenshotAs(OutputType.FILE);
								  File DestFile6=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Industry.png");
								  FileHandler.copy(SrcFile6, DestFile6);
					      	  	Row r6=sh.getRow(11);
								  if(r6==null) 
								      r6=sh.createRow(11);
					      	        for(WebElement l6:list6) {
					      	        	Cell cell=r6.createCell(0);
								    	cell.setCellValue(l6.getText()); 
								    	 arr16=l6.getText().split("\n");
					      	        }
					      	      for(int i=0;i<arr16.length;i++) {
						      	    	 if(arr16[i].contains("’")) {
						      	    		 arr16[i]=arr16[i].replace("’", "'");
						      	    	 }
						      	     }  
					      	        
					      	    //7
					      	        
						      	  	  WebElement menuOption7=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2607']/a[1]"));
						      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
						      	  	arrlink2[6]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2607']/a[1]")).getAttribute("href");
						      	  	  action.moveToElement(menuOption7).build().perform();
						      	//  	  System.out.println("List of Elements for LifeStyle");
						      	  	  List<WebElement> list7=driver.findElements(By.xpath("//li[@id='menu-item-2607']//ul[@class='sub-menu']"));
						      	  	File SrcFile7=scrshot.getScreenshotAs(OutputType.FILE);
									  File DestFile7=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Lifestyle.png");
									  FileHandler.copy(SrcFile7, DestFile7);
						      	  	Row r7=sh.getRow(13);
									  if(r7==null) 
									      r7=sh.createRow(13);
						      	        for(WebElement l7:list7) {
						      	        	Cell cell=r7.createCell(0);
									    	cell.setCellValue(l7.getText()); 
									    	arr17=l7.getText().split("\n");
						      	        }
						      	      for(int i=0;i<arr17.length;i++) {
							      	    	 if(arr17[i].contains("’")) {
							      	    		 arr17[i]=arr17[i].replace("’", "'");
							      	    	 }
							      	     }  
						      	        
						      	        
						      	    //8
						      	        
							      	  	  WebElement menuOption8=driver.findElement(By.xpath("//li[@id='menu-item-2631']//a[contains(text(),'BrandVoice')]"));
							      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
							      	  	arrlink2[7]=driver.findElement(By.xpath("//li[@id='menu-item-2631']//a[contains(text(),'BrandVoice')]")).getAttribute("href");
							      	  	  action.moveToElement(menuOption8).build().perform();
							    //  	  	  System.out.println("List of Elements for BrandVoice");
							      	  	  List<WebElement> list8=driver.findElements(By.xpath("//li[@id='menu-item-2631']//ul[@class='sub-menu']"));
							      	  	File SrcFile8=scrshot.getScreenshotAs(OutputType.FILE);
										  File DestFile8=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\BrandVoice.png");
										  FileHandler.copy(SrcFile8, DestFile8);
							      	  	  Row r8=sh.getRow(15);
										  if(r8==null) 
										      r8=sh.createRow(15);
							      	        for(WebElement l8:list8) {
							      	        	Cell cell=r8.createCell(0);
										    	cell.setCellValue(l8.getText());
										    	arr18=l8.getText().split("\n");  
							      	        }
							      	      for(int i=0;i<arr18.length;i++) {
								      	    	 if(arr18[i].contains("’")) {
								      	    		 arr18[i]=arr18[i].replace("’", "'");
								      	    	 }
								      	     }    
							      	        
							      	    //9
							      	        
								      	  	  WebElement menuOption9=driver.findElement(By.xpath("//a[contains(text(),'Lists')]"));
								      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
								      	  	arrlink2[8]=driver.findElement(By.xpath("//a[contains(text(),'Lists')]")).getAttribute("href");
								      	  	  action.moveToElement(menuOption9).build().perform();
								   //   	  	  System.out.println("List of Elements for Lists");
								      	  	 List<WebElement> list9=driver.findElements(By.xpath("//*[@id=\"menu-item-2544\"]/div/ul"));
								      	  	File SrcFile9=scrshot.getScreenshotAs(OutputType.FILE);
											  File DestFile9=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Lists.png");
											  FileHandler.copy(SrcFile9, DestFile9);
								      	  	 Row r9=sh.getRow(17);
											  if(r9==null) 
											      r9=sh.createRow(17);
								      	       for(WebElement l9:list9) {
								      	    	 Cell cell=r9.createCell(0);
											    	cell.setCellValue(l9.getText()); 
											    	 arr19=l9.getText().split("\n");
								      	       }
								      	     for(int i=0;i<arr19.length;i++) {
								      	    	 if(arr19[i].contains("’")) {
								      	    		 arr19[i]=arr19[i].replace("’", "'");
								      	    	 }
								      	     }	 
								      	      
								      	        
								      	        
								      	    //10
								      	        
									      	 	  WebElement menuOption10=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2641']/a[1]"));
									      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
									      	  	arrlink2[9]=driver.findElement(By.xpath("//body[@class='home page-template page-template-page-templates page-template-page-forbes-inner page-template-page-templatespage-forbes-inner-php page page-id-5003 desktop-ui']/div[@class='site-wrapper sticky']/header[@class='header sticky']/div[@class='pos-r']/div[@class='header__container']/nav[@class='header__nav']/div[@class='menu-header-forbes-style-container']/ul[@id='menu-header-forbes-style']/li[@id='menu-item-2641']/a[1]")).getAttribute("href");
									      	  	  action.moveToElement(menuOption10).build().perform();
									      	//  	  System.out.println("List of Elements for Advisor");
									      	  	  List<WebElement> list10=driver.findElements(By.xpath("//li[@id='menu-item-2641']//ul[@class='sub-menu']"));
									      	  	File SrcFile10=scrshot.getScreenshotAs(OutputType.FILE);
												  File DestFile10=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Advisor.png");
												  FileHandler.copy(SrcFile10, DestFile10);
									      	  	  Row r10=sh.getRow(19);
												  if(r10==null) 
												      r10=sh.createRow(19);
									      	        for(WebElement l10:list10) {
									      	        	Cell cell=r10.createCell(0);
												    	cell.setCellValue(l10.getText());
												    	arr110=l10.getText().split("\n");
												    	
									      	        }
									      	      for(int i=0;i<arr110.length;i++) {
										      	    	 if(arr110[i].contains("’")) {
										      	    		 arr110[i]=arr110[i].replace("’", "'");
										      	    	 }
										      	     }  
									      	
									      	        
									      	    //11
									      	        
										      	  	  WebElement menuOption11=driver.findElement(By.xpath("//a[contains(text(),'Featured')]"));
										      	  	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
										      	  	arrlink2[10]=driver.findElement(By.xpath("//a[contains(text(),'Featured')]")).getAttribute("href");
										      	  	  action.moveToElement(menuOption11).build().perform();
										      //	  	  System.out.println("List of Elements for Featured");
										      	  	  List<WebElement> list11=driver.findElements(By.xpath("//li[@id='menu-item-2618']//ul[@class='sub-menu']"));
										      	  	File SrcFile11=scrshot.getScreenshotAs(OutputType.FILE);
													  File DestFile11=new File("C:\\Users\\saili.m\\Screenshots\\Advisor Page\\Featured.png");
													  FileHandler.copy(SrcFile11, DestFile11);
										      	  	  Row r11=sh.getRow(21);
													  if(r11==null) 
													      r11=sh.createRow(21);
										      	        for(WebElement l11:list11) {
										      	        	Cell cell=r11.createCell(0);
													    	cell.setCellValue(l11.getText());
										      	        	arr111=l11.getText().split("\n");
										      	        }
										      	        for(int i=0;i<arr111.length;i++) {
										      	        	if(arr111[i].contains("’")) {
										      	        		arr111[i]=arr111[i].replace("’", "'");
										      	        	}
										      	        }
										      	        
										      	      fis.close();
													  FileOutputStream fos=new FileOutputStream(file);
													 workbook.write(fos);
													 fos.close();  
										      	       
										      	     
}  
 
 @Test(priority=3)
 public void onHoverBillionarie() {
	 if(arr01.length==arr11.length) {
		 
		 if(Arrays.equals(arr01,arr11))
			 System.out.println("On Hover Menu for Billionaries on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Billionaries on Advisor Page DOES NOT MATCH with Industry Page");
		 }
 
     else {
	    System.out.println("On Hover Menu for Billionaries on Advisor Page DOES NOT MATCH with Industry Page");
     }	
	 
 }
 

 @Test(priority=3)
 public void onHoverInnovation() {
	 if(arr02.length==arr12.length) {
	 if(Arrays.equals(arr02,arr12))
		 System.out.println("On Hover Menu for Innovation on Advisor Page MATCHES with Industry Page");
	 else
		 System.out.println("On Hover Menu for Innovation on Advisor Page DOES NOT MATCH with Industry Page");
 }
	 else
		 System.out.println("On Hover Menu for Innovation on Advisor Page DOES NOT MATCH with Industry Page");
	 
 }
 @Test(priority=5)
 public void onHoverLeadership() {
	 if(arr03.length==arr13.length) {
		 if(Arrays.equals(arr03,arr13))
			 System.out.println("On Hover Menu for Leadership on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Leadership on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Leadership on Advisor Page DOES NOT MATCH with Industry Page");
		 
 }
 @Test(priority=6)
 public void onHoverMoney() {
	 if(arr04.length==arr14.length) {
		 if(Arrays.equals(arr04,arr14))
			 System.out.println("On Hover Menu for Money on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Money on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Money on Advisor Page DOES NOT MATCH with Industry Page");
		 
 }
 @Test(priority=7)
 public void onHoverConsumer() {
	 if(arr05.length==arr15.length) {
		 if(Arrays.equals(arr05,arr15))
			 System.out.println("On Hover Menu for Business on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Business on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Business on Advisor Page DOES NOT MATCH with Industry Page");
 }
 @Test(priority=8)
 public void onHoverIndustry() {
	 if(arr06.length==arr16.length) {
		 if(Arrays.equals(arr06,arr16))
			 System.out.println("On Hover Menu for Small Business on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Small Business on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Small Business on Advisor Page DOES NOT MATCH with Industry Page");
 }
 @Test(priority=9)
 public void onHoverLifestyle() {
	 if(arr07.length==arr17.length) {
		 if(Arrays.equals(arr07,arr17))
			 System.out.println("On Hover Menu for Lifestyle on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Lifestyle on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Lifestyle on Advisor Page DOES NOT MATCH with Industry Page");
 }
 @Test(priority=10)
 public void onHoverBrandVoice() {
	 if(arr08.length==arr18.length) {
		 if(Arrays.equals(arr08,arr18))
			 System.out.println("On Hover Menu for BrandVoice on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for BrandVoice on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Brandvoice on Advisor Page DOES NOT MATCH with Industry Page");
 }  
 
 @Test(priority=11)
 public void onHoverLists() {
	 if(arr09.length==arr19.length) {
		 if(Arrays.equals(arr09,arr19))
			 System.out.println("On Hover Menu for Lists on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Lists on Advisor Page DOES NOT MATCH with Industry Page");
	 }
		 else
			 System.out.println("On Hover Menu for Lists on Advisor Page DOES NOT MATCH with Industry Page");
 }
 
 @Test(priority=12)
 public void onHoverAdvisor() {
	 if(arr010.length==arr110.length) {
		 if(Arrays.equals(arr010,arr110))
			 System.out.println("On Hover Menu for Advisor on Advisor Page MATCHES with Industry Page");
		 else
			 System.out.println("On Hover Menu for Advisor on Advisor Page DOES NOT MATCH with Industry Page");
	 }
	else
			 System.out.println("On Hover Menu for Advisor on Advisor Page DOES NOT MATCH with Industry Page");
 }
  
 
 @Test(priority=13)
 public void onHoverFeatured() {
	 
	if(arr011.length==arr111.length) {
	   if(Arrays.equals(arr011,arr111))
			   System.out.println("On Hover Menu for Featured on Advisor Page MATCHES with Industry Page");
	   else
		   System.out.println("On Hover Menu for Featured on Advisor Page DOES NOT MATCH with Industry Page");
	 }
	 
	 else
		 System.out.println("On Hover Menu for Featured on Advisor Page DOES NOT MATCH with Industry Page");
	

 }
 @Test(priority=14)
 public void HeaderLinksMatch() {
	 for(int i=0;i<arrlink1.length;i++) {
		/* if(!(arrlink1[i].equals(arrlink2[i]))) 
			System.out.println("Index is:"+i+arrlink2[i]);
		*/
		 if(arrlink1[i].equals(null)) {
			 arrlink1[i]="NA";
		 }
		 if(arrlink2[i].equals(null)) {
			 arrlink2[i]="NA";
		 }
		 System.out.println("link1:"+arrlink1[i]);
		 System.out.println("link2:"+arrlink2[i]);
	 }
 }

}
	 
 


