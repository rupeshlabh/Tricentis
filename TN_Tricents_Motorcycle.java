package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

public class TN_Tricents_Motorcycle {

WebDriver driver;
	
	public TN_Tricents_Motorcycle(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By motorcycle=By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/ul/li[3]/a");
	
	By make=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select");
	By model=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select");
	By cylindercapacity=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input");
	By engineperform=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/input");
	By date=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/input");
	By seatno=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select");
	By listprice=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input");
	By mileage=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input");
	By button1=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/button");
	
	By firstname=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input");
	By lastname=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input");
	By dob=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input");
	By male=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span");
	By address=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input");
	By country=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select");
	By zipcode=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input");
	By city=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input");
	By occupation=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select");
	By hobbies=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]/span");
	By website=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[11]/input");
	By open=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/button");
	By filepath=By.xpath("//input[@type='file']");
	By button2=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]");
	
	By startdate=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input");
	By insurancesum=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select");
	By damageinsurance=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select");
	By optionalproducts=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span");
	By button3=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/button[2]");
	
	By silver=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span");
	By gold=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span");
	By platinum=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span");
	By ultimate=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span");
	By button4=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]");
	
	
	By email=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input");
	By phone=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input");
	By username=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input");
	By password=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input");
	By confirmpassword=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input");
	By comments=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea");
	By button5=By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]");
	
	By ok=By.xpath("/html/body/div[4]/div[7]/div/button");
	
	By homepage=By.xpath("/html/body/div[1]/main/div/div/a");
	
	
	
	public void motorcyclePage()
	{
		driver.findElement(motorcycle).click();
	}

	public void setMake() {
		WebElement make1=driver.findElement(make);
		Select s1=new Select(make1);
		s1.selectByIndex(2);
	}

	public void setModel() {
		WebElement model1=driver.findElement(model);
		Select s1=new Select(model1);
		s1.selectByIndex(2);
	}

	public void setCylindercapacity(String cylindercapacity1) {
		driver.findElement(cylindercapacity).sendKeys(cylindercapacity1);
	}

	public void setEngineperform(String engineperform1) {
		driver.findElement(engineperform).sendKeys(engineperform1);
	}

	public void setDate(String date1) {
		driver.findElement(date).sendKeys(date1);
	}

	public void setSeatno() {
		WebElement seatno1=driver.findElement(seatno);
		Select s2=new Select(seatno1);
		s2.selectByIndex(1);
	}

	public void setListprice(String listprice1) {
		driver.findElement(listprice).sendKeys(listprice1);
	}

	public void setMileage(String mileage1) {
		driver.findElement(mileage).sendKeys(mileage1);
	}

	public void setButton1() {
		driver.findElement(button1).click();
	}

	public void setFirstname(String firstname1) {
		driver.findElement(firstname).sendKeys(firstname1);
	}

	public void setLastname(String lastname1) {
		driver.findElement(lastname).sendKeys(lastname1);
	}

	public void setDob(String dob1) {
		driver.findElement(dob).sendKeys(dob1);
	}

	public void setMale() {
		driver.findElement(male).click();
	}

	public void setAddress(String address1) {
		driver.findElement(address).sendKeys(address1);
	}

	public void setCountry() {
		WebElement country1=driver.findElement(country);
		Select s3=new Select(country1);
		s3.selectByVisibleText("India");
	}

	public void setZipcode(String zipcode1) {
		driver.findElement(zipcode).sendKeys(zipcode1);
	}

	public void setCity(String city1) {
		driver.findElement(city).sendKeys(city1);
	}

	public void setOccupation() {
		WebElement occupation1=driver.findElement(occupation);
		Select s=new Select(occupation1);
		s.selectByIndex(1);
	}

	public void setHobbies() {
		driver.findElement(hobbies).click();;
	}

	public void setWebsite(String website1) {
		driver.findElement(website).sendKeys(website1);
	}

	public void setOpen() {
		driver.findElement(open);
		WebElement filepath_data=driver.findElement(filepath);
		filepath_data.sendKeys("C:\\Users\\prati\\OneDrive\\Desktop\\WFH\\APITest2\\bike.jpg");
	}

	public void setButton2() {
		driver.findElement(button2).click();
	}

	public void setStartdate(String startdate1) {
		driver.findElement(startdate).sendKeys(startdate1);
	}

	public void setInsurancesum() {
		WebElement insurancesum1=driver.findElement(insurancesum);
		Select s=new Select(insurancesum1);
		s.selectByIndex(1);
	}

	public void setDamageinsurance() {
		WebElement damageinsurance1=driver.findElement(damageinsurance);
		Select s=new Select(damageinsurance1);
		s.selectByIndex(2);
	}

	public void setOptionalproducts() {
		driver.findElement(optionalproducts).click();
	}

	public void setButton3() {
		driver.findElement(button3).click();
	}

	public void setSilver() {
		driver.findElement(silver).click();
		System.out.println("You have selected Silver price option ");
	}

	public void setGold() {
		driver.findElement(gold).click();
		System.out.println("You have selected Gold price option ");
	}

	public void setPlatinum() {
		driver.findElement(platinum).click();
		System.out.println("You have selected Platinum price option ");
	}

	public void setUltimate() {
		driver.findElement(ultimate).click();
		System.out.println("You have selected Ultimate price option ");
	}

	public void setButton4() {
		driver.findElement(button4).click();
	}
	
	public void setEmail(String email1)
	{
		driver.findElement(email).sendKeys(email1);
	}
	
	public void setPhone(String phone1)
	{
		driver.findElement(phone).sendKeys(phone1);
	}
	
	public void setUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		driver.findElement(confirmpassword).sendKeys(pwd);
	}
	
	public void setComment(String comment)
	{
		driver.findElement(comments).sendKeys(comment);
	}
	
	public void send()
	{
		driver.findElement(button5).click();
	}
	
	public void click_ok()
	{
		driver.findElement(ok).click();
	}
	
	public void goto_Homepage()
	{
		driver.findElement(homepage).click();
	}
	
}
