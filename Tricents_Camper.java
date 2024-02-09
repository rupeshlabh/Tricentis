package Pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tricents_Camper {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\WFH\\APITest2\\ReadData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		// return no. of rows in sheet
		int rows = sheet.getLastRowNum();
		System.out.println("No. of rows in sheet : " + rows);

		// return no. of cells/cols at one row
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("No. of cols in a row : " + cols);

		
		
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			/*for(int j=0;j<cols;j++) {
				//XSSFCell cell=row.getCell(j);
			
			  /*for(int j=0;j<cols;j++) { XSSFCell cell=row.getCell(j); 
			  switch
			 * (cell.getCellType()) {
			 * 
			 * case NUMERIC: engineperform.sendKeys(cell.getNumericCellValue()); break;
			 * 
			 * case STRING: engineperform.sendKeys(cell.getStringCellValue()); break;
			 * 
			 * } System.out.print("|"); }
			 */
			
			WebElement make = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select"));
			Select sl = new Select(make);
			sl.selectByIndex(1);

			WebElement engineperform = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"));
			
			WebElement date=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"));
			date.sendKeys("10/08/2023");
			
			String value= String.valueOf((int)row.getCell(0).getNumericCellValue());
			engineperform.sendKeys(value);
			WebElement seatno=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select"));
			Select s2=new Select(seatno);
			s2.selectByIndex(1);
			WebElement drive=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/p/label[1]/span"));
			drive.click();
			WebElement fueltyp=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select"));
			Select s3=new Select(fueltyp);
			s3.selectByIndex(2);
			WebElement payload=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"));
			//String value2= String.valueOf((int)row.getCell(1).getNumericCellValue());
			payload.sendKeys(row.getCell(1).getStringCellValue());
			WebElement totalweight=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"));
			String value3= String.valueOf((int)row.getCell(2).getNumericCellValue());
			totalweight.sendKeys(value3);
			WebElement listprice=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/input"));
			String value4= String.valueOf((int)row.getCell(3).getNumericCellValue());
			listprice.sendKeys(value4);
			WebElement lisceneno=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input"));
			//String value5= String.valueOf((int)row.getCell(4).getNumericCellValue());
			lisceneno.sendKeys(row.getCell(4).getStringCellValue());
			WebElement mileage=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/input"));
			String value6= String.valueOf((int)row.getCell(5).getNumericCellValue());
			mileage.sendKeys(value6);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[12]/button")).click();
			
			WebElement firstname=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"));
			firstname.sendKeys(row.getCell(6).getStringCellValue());
			WebElement lastname=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"));
			lastname.sendKeys(row.getCell(7).getStringCellValue());
			WebElement dob=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"));
			dob.sendKeys("06/08/1993");
			WebElement male=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
			male.click();
			WebElement address=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"));
			address.sendKeys(row.getCell(8).getStringCellValue());
			WebElement country = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select"));
			Select s4 = new Select(country);
			s4.selectByVisibleText("India");
			WebElement zipcode=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"));
			String value9= String.valueOf((int)row.getCell(9).getNumericCellValue());
			zipcode.sendKeys(value9);
			WebElement city=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"));
			city.sendKeys(row.getCell(10).getStringCellValue());
			WebElement occupation = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select"));
			Select s5 = new Select(occupation);
			s5.selectByIndex(1);
			WebElement hobbies=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span"));
			hobbies.click();
			WebElement website=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[11]/input"));
			website.sendKeys(row.getCell(11).getStringCellValue());
			WebElement open=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/button"));
			WebElement filepath = driver.findElement(By.xpath("//input[@type='file']"));
			filepath.sendKeys(row.getCell(12).getStringCellValue());
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]")).click();
			
			WebElement startdate=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"));
			startdate.sendKeys("11/10/2023");
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
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]")).click();
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			WebElement nextbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]")));
			nextbutton.click();
			
			WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"));
			email.sendKeys(row.getCell(13).getStringCellValue());
			WebElement phone=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"));
			String phoneno= String.valueOf((int)row.getCell(14).getNumericCellValue());
			phone.sendKeys(phoneno);
			WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input"));
			username.sendKeys(row.getCell(15).getStringCellValue());
			WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input"));
			password.sendKeys(row.getCell(16).getStringCellValue());
			WebElement confirmpassword=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input"));
			confirmpassword.sendKeys(row.getCell(17).getStringCellValue());
			WebElement comments=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"));
			comments.sendKeys(row.getCell(18).getStringCellValue());
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
			driver.navigate().refresh();
			
			break;
				/*String value= String.valueOf((int)row.getCell(0).getNumericCellValue());
				String cell0=String.valueOf((int)row.getCell(0));
				engineperform.sendKeys(value);*/
			}
		
		//Go to home page
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/a")).click();

		}

	//}

}
