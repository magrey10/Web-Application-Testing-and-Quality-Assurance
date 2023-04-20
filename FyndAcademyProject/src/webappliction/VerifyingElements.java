package webappliction;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class VerifyingElements {
public WebDriver driver;
	
	@BeforeMethod
	public void launchapp() throws Exception{
		
		// Importing Driver location and application URL with help the of Excel sheet.
		FileInputStream f = new FileInputStream("C:\\Users\\Farhan Javaid\\Documents\\Testing\\FInaldriverlocation.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet appurl = wb.getSheet("Sheet1");
		
		System.setProperty(appurl.getCell(0, 0).getContents(), appurl.getCell(0, 1).getContents());
		driver = new ChromeDriver();
		driver.get(appurl.getCell(0, 2).getContents());
	}

	 @Test
	 public void verifyingelement() throws Exception{
		 //Scenario-2 : Verifying the Availability of each Tab.
		 
		 //Importing the Page Object Model
		 PageObjectModel  v= PageFactory.initElements(driver, PageObjectModel.class);
		 
		 //Soft Assertion will proceed to next test case even if there is any element is not present
		 SoftAssert soft = new SoftAssert();
		 
		 boolean footballavailable = v.Football.isDisplayed();
		 soft.assertEquals(footballavailable, true);
		 System.out.println("Football Tab is Available");
		 
		 boolean cricketavailable = v.Cricket.isDisplayed();
		 soft.assertEquals(cricketavailable, true);
		 System.out.println("Kriket Tab is Available");
		 
		 boolean homeavailable = v.Football.isDisplayed();
		 soft.assertEquals(homeavailable, true);
		 System.out.println("Home Tab is Available");
		 
		 boolean basketballavailable = v.BasketBall.isDisplayed();
		 soft.assertEquals(basketballavailable, true);
		 System.out.println("BasketBall Tab is Available");
		 
		 boolean cybersportavailable = v.cyberSport.isDisplayed();
		 soft.assertEquals(cybersportavailable, true);
		 System.out.println("CiberSports Tab is Available");
		 
		 // Scenario-3: Verifying the link of Each tab with speciefied condition
		 v.Home.click();
		 Thread.sleep(2000);
		 
		 //getting URL of page and printing it
		 String HomeURL = driver.getCurrentUrl();
		 System.out.println(HomeURL);
		 
		 //Creating objects to check if the Tabs contain specified values
		 boolean homecheck = HomeURL.contains("Home");
		 
		 //Again using Assert Method to check if the condition is true or not
		 soft.assertEquals(homecheck, true);
		 
		 v.Football.click();
		 String FootballUrl= driver.getCurrentUrl();
		 System.out.println(FootballUrl);
		 boolean Footballcheck = FootballUrl.contains("Football");
		 soft.assertEquals(Footballcheck,true);
		 
		 v.BasketBall.click();
		 String BasketballUrl= driver.getCurrentUrl();
		 System.out.println(BasketballUrl);
		 boolean Basketballcheck = BasketballUrl.contains("Football");
		 soft.assertEquals(Basketballcheck,true);
		 
		 v.Cricket.click();
		 String CricketUrl= driver.getCurrentUrl();
		 System.out.println(CricketUrl);
		 boolean Cricketcheck = CricketUrl.contains("Football");
		 soft.assertEquals(Cricketcheck,true);
		 
		 v.cyberSport.click();
		 String cybersportUrl= driver.getCurrentUrl();
		 System.out.println(cybersportUrl);
		 boolean cybersportcheck = cybersportUrl.contains("Football");
		 soft.assertEquals(cybersportcheck,true);
		 
		 // Scenario-4: Storing all the link into Excel file on System
		 //Using FileOutputStream to Set the Excel sheet location on System.
		 FileOutputStream f = new FileOutputStream("C:\\Users\\Farhan Javaid\\Documents\\Testing\\FinalSheet.xls");
		 
		 //Opening writable workbook to store Excel Sheet
		 WritableWorkbook wb = Workbook.createWorkbook(f);
		 
		 //creating a sheet on the opened workbook.
		 WritableSheet sheet = wb.createSheet("WebPage URL ",1);
		 
		 //Creating Cell on the opened Sheet to store the specified values/
		 Label cell1 = new Label(0,0,"Home Tab URL is: " + HomeURL);
		 Label cell2 = new Label(0,1,"Football Tab URL is: " + FootballUrl);
		 Label cell3 = new Label(0,2,"Busketball Tab URL is: " + BasketballUrl);
		 Label cell4 = new Label(0,3,"Kriket Tab URL is: " + CricketUrl);
		 Label cell5 = new Label(0,4,"CiberSport Tab URL is: " + cybersportUrl);
		 
		 //Adding the cell to the Opened Sheet
		 sheet.addCell(cell1);
		 sheet.addCell(cell2);
		 sheet.addCell(cell3);
		 sheet.addCell(cell4);
		 sheet.addCell(cell5);
		 
		 //Saving the writable Workbook
		 wb.write();
		 
		 //Closing the Opened Workbook
		 wb.close();
	 }
	 
	 //In After method, we will close the window after every test case execution
	 @AfterMethod 
		 public void closeapp() {
		 driver.close();
		 	 
	 }

}
