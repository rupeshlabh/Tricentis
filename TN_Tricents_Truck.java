package Pkg1;

import org.testng.annotations.Test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class TN_Tricents_Truck {
  @Test(dataProvider = "dp")
  public void f(String ep, String date1, String payload1, String totalweight1, String listprice1, String lisceneno1, String mileage1, String firstname1, String lastname1, String dob1, String address1, String country1, String zipcode1, String city1, String occupation1, String website1, String filepath1, String startdate1, String email1, String phone1, String username1, String password1, String confirmpassword1, String comments1) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		WebElement make=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select"));
		Select sl=new Select(make);
		sl.selectByIndex(1);
		WebElement engineperform=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"));
		engineperform.sendKeys(ep);
		WebElement date=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"));
		date.sendKeys(date1);
		WebElement seatno=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select"));
		Select s2=new Select(seatno);
		s2.selectByIndex(1);
		WebElement fueltyp=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select"));
		Select s3=new Select(fueltyp);
		s3.selectByIndex(2);
		WebElement payload=driver.findElement(By.xpath("//*[@id=\'payload\']"));
		payload.sendKeys(payload1);
		WebElement totalweight=driver.findElement(By.xpath("//*[@id=\'totalweight\']"));
		totalweight.sendKeys(totalweight1);
		WebElement listprice=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"));
		listprice.sendKeys(listprice1);
		WebElement lisceneno=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/input"));
		lisceneno.sendKeys(lisceneno1);
		WebElement mileage=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input"));
		mileage.sendKeys(mileage1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/button")).click();
		WebElement firstname=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"));
		firstname.sendKeys(firstname1);
		WebElement lastname=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"));
		lastname.sendKeys(lastname1);
		WebElement dob=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"));
		dob.sendKeys(dob1);
		WebElement gender=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
		gender.click();
		WebElement address=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"));
		address.sendKeys(address1);
		WebElement country=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select"));
		Select s4=new Select(country);
		s4.selectByVisibleText(country1);
		WebElement zipcode=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"));
		zipcode.sendKeys(zipcode1);
		WebElement city=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"));
		city.sendKeys(city1);
		WebElement occupation=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select"));
		Select s5=new Select(occupation);
		s5.selectByVisibleText(occupation1);
		WebElement hobbies=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span"));
		hobbies.click();
		WebElement website=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[11]/input"));
		website.sendKeys(website1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/button"));
		Thread.sleep(3000);
		WebElement filepath = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(3000);
		//filepath.sendKeys("C:\\Users\\prati\\OneDrive\\Desktop\\WFH\\APITest2\\bike.jpg");
		filepath.sendKeys(filepath1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]")).click();
		WebElement startdate=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"));
		startdate.sendKeys(startdate1);
		WebElement sum=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select"));
		Select s6=new Select(sum);
		s6.selectByIndex(2);
		WebElement damageinsurance=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select"));
		Select s8=new Select(damageinsurance);
		s8.selectByIndex(1);
		WebElement optionalproducts=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span"));
		optionalproducts.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/button[2]")).click();
		System.out.println("Select price option : \n 1.Silver \n 2.Gold \n 3. Platinum \n 4. Ultimate");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1:	WebElement silver=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span"));
				silver.click();
				System.out.println("You have selected Silver price option ");
				break;
		case 2:	WebElement gold=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span"));
				gold.click();
				System.out.println("You have selected Gold price option ");
				break;
		case 3:	WebElement platinum=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span"));
				platinum.click();
				System.out.println("You have selected Platinum price option ");
				break;
		case 4:	WebElement ultimate=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span"));
				ultimate.click();
				System.out.println("You have selected Ultimate price option ");
				break;
		default:
				System.out.println("Invalid price option selection");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]")).click();
		WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"));
		email.sendKeys(email1);
		WebElement phone=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"));
		phone.sendKeys(phone1);
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input"));
		username.sendKeys(username1);
		WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input"));
		password.sendKeys(password1);
		WebElement confirmpassword=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input"));
		confirmpassword.sendKeys(confirmpassword1);
		WebElement comments=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"));
		comments.sendKeys(comments1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		//Go to home page
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/a")).click();
		
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "100","10/02/2023","50", "150", "5000", "MH12RE1352", "100", "Rupesh", "Labh", "06/08/1993", "Lonikand", "India", "412216", "Pune", "Employee", "www.abcd.com", "C:\\Users\\prati\\OneDrive\\Desktop\\WFH\\APITest2\\bike.jpg", "11/10/2023", "rupl@gmail.com", "1234567890", "rupeshl", "Rupesh1#111", "Rupesh1#111", "No comments" },
      
    };
  }
}
