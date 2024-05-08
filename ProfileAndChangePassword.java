package pharmacyadmin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProfileAndChangePassword {

	static void PM(WebDriver driver) {
		WebElement previousMonth = driver.findElement(By.xpath("(//button[@aria-label='Previous Month'])[1]"));
		for (int p = 0; p < 2; p++) {
			previousMonth.click();
		}
	}

	static void NM(WebDriver driver) {
		WebElement nextMonth = driver.findElement(By.xpath("(//button[@aria-label='Next Month'])[1]"));
		for (int n = 0; n < 600; n++) {
			nextMonth.click();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://development.medyaan.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To Click Sign In and choose the Pharmacy Admin
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Pharmacy Admin']")).click();
		Thread.sleep(2000);

		// Signin to Pharmacy Admin Dashboard
		driver.findElement(By.name("phone")).sendKeys("9894378744");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn login-button btn-secondary btn-block']")).click();
		Thread.sleep(2000);

		// Profile
		driver.findElement(By.xpath("//a[@href='/basic-profile']")).click();
		// Edit Profile
		/*
		 * driver.findElement(By.
		 * cssSelector("button[title='Click here, to edit profile']")).click();
		 * 
		 * WebElement firstname=driver.findElement(By.cssSelector("#firstnames"));
		 * firstname.clear(); firstname.sendKeys("Arumugam"); Thread.sleep(2000);
		 * 
		 * WebElement lastname=driver.findElement(By.cssSelector("#lastname"));
		 * lastname.clear(); lastname.sendKeys("K"); Thread.sleep(2000);
		 * 
		 * WebElement dob=driver.findElement(By.cssSelector("#dateofbirth"));
		 * dob.click(); Thread.sleep(2000); NM(driver);
		 * driver.findElement(By.xpath("((//tbody/tr)[5]/td)[5]")).click();
		 * 
		 * WebElement d1= driver.findElement(By.name("radioInline")); Select gender=new
		 * Select(d1); gender.selectByVisibleText("Others"); Thread.sleep(2000);
		 * 
		 * WebElement mobileno=driver.findElement(By.cssSelector("#phonenumber"));
		 * mobileno.clear(); mobileno.sendKeys("8675378009");
		 * 
		 * WebElement
		 * emergencycontact=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		 * emergencycontact.clear(); emergencycontact.sendKeys("7094755145");
		 * 
		 * WebElement email=driver.findElement(By.cssSelector("#email")); email.clear();
		 * email.sendKeys("medyaan@gmail.com"); Thread.sleep(2000);
		 * 
		 * WebElement d2= driver.findElement(By.cssSelector("#maritalstatus")); Select
		 * maritalstatus=new Select(d2); Thread.sleep(2000);
		 * maritalstatus.selectByVisibleText("Married"); Thread.sleep(2000);
		 * 
		 * WebElement d3= driver.findElement(By.cssSelector("#language")); Select
		 * language=new Select(d3); Thread.sleep(2000);
		 * language.selectByVisibleText("English"); Thread.sleep(2000);
		 * 
		 * WebElement d4= driver.findElement(By.
		 * xpath("//label[text()='Blood Group ']/../following-sibling::Select")); Select
		 * bloodGrp=new Select(d4); Thread.sleep(2000);
		 * bloodGrp.selectByVisibleText("O+"); Thread.sleep(2000); //Submit
		 * driver.findElement(By.
		 * xpath("//button[@class='btn submit_btn primary_btn submitbtn-color btn-secondary']"
		 * )).click();
		

		// Change-Password
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("(//ul[@class='nav nav-tabs']//a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='v-input__slot'])[4]")).click();
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='password'])[4]"))).sendKeys("ak").build()
				.perform();

		driver.findElement(By.xpath("(//div[@class='v-input__slot'])[5]")).click();
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='password'])[5]"))).sendKeys("ak").build()
				.perform();

		driver.findElement(By.xpath("(//div[@class='v-input__slot'])[6]")).click();
		action.moveToElement(driver.findElement(By.xpath("(//input[@type='password'])[6]"))).sendKeys("ak").build()
				.perform();
		// Submit
		driver.findElement(By.xpath("(//button[@class='btn proceed-btn submitbtn-color btn-secondary'])[2]")).click();
 */
		//Logout
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]/..")).click();
		

	}

}
