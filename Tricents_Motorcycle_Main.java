package Pkg1;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tricents_Motorcycle_Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Pratik\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		TN_Tricents_Motorcycle m=new TN_Tricents_Motorcycle(driver);
		
		m.motorcyclePage();
		
		m.setMake();
		m.setModel();
		m.setCylindercapacity("500");
		m.setEngineperform("50");
		m.setDate("10/08/2023");
		m.setSeatno();
		m.setListprice("5000");
		m.setMileage("100");
		m.setButton1();
		
		m.setFirstname("Rupesh");
		m.setLastname("Labh");
		m.setDob("06/08/1993");
		m.setMale();
		m.setAddress("Lonikand");
		m.setCountry();
		m.setZipcode("412216");
		m.setCity("Pune");
		m.setOccupation();
		m.setHobbies();
		m.setWebsite("www.abcd.com");
		m.setOpen();
		m.setButton2();
		
		m.setStartdate("11/10/2023");
		m.setInsurancesum();
		m.setDamageinsurance();
		m.setOptionalproducts();
		m.setButton3();
		
		System.out.println("Select price option : \n 1.Silver \n 2.Gold \n 3. Platinum \n 4. Ultimate");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1:	m.setSilver();
				break;
		case 2:	m.setGold();
				break;
		case 3:	m.setPlatinum();
				break;
		case 4:	m.setUltimate();
				break;
		default:
				System.out.println("Invalid price option selection");
		}
		Thread.sleep(5000);
		m.setButton4();
		
		m.setEmail("rupl@gmail.com");
		m.setPhone("1234567890");
		m.setUsername("rupeshl");
		m.setPassword("Rup@1234");
		m.setConfirmPassword("Rup@1234");
		m.setComment("No comment");
		m.send();
		
		Thread.sleep(15000);
		m.click_ok();
		
		driver.navigate().refresh();
		
		m.goto_Homepage();
		
		
	}

}
