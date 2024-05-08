package pharmacyadmin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SupplierorVendor {

	public static void main(String[] args) throws InterruptedException {
		
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
		// Purchase Order
		WebElement purchaseOrder = driver.findElement(By.xpath("//div[text()='Supplier / Vendor']/.."));
		Actions action = new Actions(driver);
		action.moveToElement(purchaseOrder).click().build().perform();
		Thread.sleep(5000);
		//Add supplier
		driver.findElement(By.xpath("//button[@class='btn primary-btn addsupplier-btn-size mr-3 btn-secondary']")).click();
		//Add supplier details
	    driver.findElement(By.cssSelector("#name")).sendKeys("New",Keys.TAB);
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#mobilenumber")).sendKeys("8056221601",Keys.TAB);
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#email")).sendKeys("priyadharshan062001@gmail.com",Keys.TAB);
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#address1")).sendKeys("171, Muggapair",Keys.TAB);
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#address2")).sendKeys("121,Thomos street",Keys.TAB);
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("div.autocomplete__inputs>input")).sendKeys("Madurai");
	    Thread.sleep(2000);
	    List<WebElement> selectCity=driver.findElements(By.cssSelector(".autocomplete__results>li"));
	    for(int i=0;i<selectCity.size();i++) {
	    	Thread.sleep(2000);
	    	String city=selectCity.get(i).getText();
	    	if(city.equals("Madurai")) {
	    		driver.findElements(By.cssSelector(".autocomplete__results>li")).get(i).click();
	    		break;
	    	}
	    }
	    //submit
	 //   driver.findElement(By.cssSelector("div[class='py-0 col'] button~button")).click();
	    Thread.sleep(2000);
	    //Cancel
	//    driver.findElement(By.cssSelector("div[class='py-0 col'] button")).click();
	    Thread.sleep(2000);
	    //close icon
	    driver.findElement(By.cssSelector(".close")).click();
	    Thread.sleep(2000);
	    
	    //search
	    driver.findElement(By.cssSelector("#supplierquickFilter")).sendKeys("Tharun");
	    Thread.sleep(2000);
	    //Edit supplier details
	    driver.findElement(By.xpath("((//div[@id='editdelete-rendered'])[1]//button)[1]")).click();
	    WebElement editMobileno= driver.findElement(By.cssSelector("#mobilenumber"));
	    Thread.sleep(2000);
	    editMobileno.sendKeys("8056221601");
	    Thread.sleep(2000);
	    //submit
		driver.findElement(By.cssSelector("div[class='py-0 col'] button~button")).click();
	    //Cancel
		//driver.findElement(By.cssSelector("div[class='py-0 col'] button")).click();
		Thread.sleep(2000);
	    //Delete the supplier details
	    driver.findElement(By.cssSelector("#editdelete-rendered button~button")).click();
	    driver.findElement(By.cssSelector(".el-message-box__btns>button~button")).click();

	}

}
