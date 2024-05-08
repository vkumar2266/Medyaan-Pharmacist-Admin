package pharmacyadmin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scrap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// To Open Chrome Web Browser
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

		// Purchase
		driver.findElement(By.xpath("((//div[@role='listbox'])[2]/div)[5]")).click();
		Thread.sleep(2000);

		// Scrap
		driver.findElement(By.xpath("//a[@href='/scrap']")).click();
		Thread.sleep(2000);
		// Add Scrap
		driver.findElement(By.xpath("//button[@class='btn primary-btn addscrap-btn-size btn-secondary']")).click();
		Thread.sleep(2000);
		// Create scrap details
		driver.findElement(By.cssSelector("#searchVal")).sendKeys("nepdone");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#search-forminput>li")).click();
		Thread.sleep(2000);
		WebElement batchId = driver.findElement(By.cssSelector("#batchId"));
		Select selectBatch = new Select(batchId);
		selectBatch.selectByVisibleText("121212/20Q");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#scarpquantity")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[wrap='soft']")).sendKeys("Medicine was damaged");
		Thread.sleep(2000);
		//Add 
		driver.findElement(By.cssSelector(".add-med-btndiv>button~button")).click();
		//Edit
		//driver.findElement(By.cssSelector("#scrap-edit-rendered")).click();
		//clear
		//driver.findElement(By.cssSelector(".add-med-btndiv>button")).click();
		//Back
		driver.findElement(By.xpath("//button[@class='btn secondary-btn back-btn-size mr-3 btn-secondary']")).click();
		//Submit
		//driver.findElement(By.xpath("//button[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		
		//search
		driver.findElement(By.cssSelector("#scrapquickFilter")).sendKeys("103");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ScarpViewRendered")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[ref='eBodyViewport']")).getText());
		driver.findElement(By.xpath("//button[@class='btn secondary-btn back-btn-size btn-secondary']")).click();



	}

}
