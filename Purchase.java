package pharmacyadmin;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Purchase {

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
		// Purchase Order
		WebElement purchaseOrder = driver.findElement(By.xpath("//div[text()='Purchase Order']/.."));
		Actions action = new Actions(driver);
		action.moveToElement(purchaseOrder).click().build().perform();
		Thread.sleep(5000);
		/*
		// Add Purchase Order
		driver.findElement(By.xpath("//button[@class='btn primary-btn addpurchase-btn-size btn-secondary']")).click();
		Thread.sleep(5000);
		// Search
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("guna", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@id='search-forminput']/li)[1]")).click();
		Thread.sleep(3000);
		//purchaseDate
		driver.findElement(By.xpath("(//input[@name='datepicker'])[1]")).click();
		List<WebElement> purchaseDate=driver.findElements(By.xpath("//tbody//div/span"));
		for(int i=0;i<purchaseDate.size();i++) {
			String val=purchaseDate.get(i).getText();
			if(val.equals("2")) {
				driver.findElement(By.xpath("//tbody//div/span[contains(text(),'"+val+"')]")).click();
			}
		}
		driver.findElement(By.xpath("(//input[@class='input-field-cls form-control'])[1]")).sendKeys("Nepdone Testing",
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='suggesionMedicineLists']//li")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='input-field-cls form-control'])[2]")).sendKeys("20", Keys.ENTER);
		Thread.sleep(3000);
		// Amount
		driver.findElement(By.id("purchaseAmount")).sendKeys("20");
		Thread.sleep(3000);
		// %
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).sendKeys("4",
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[2]")).sendKeys("6",
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]")).sendKeys("8",
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='input-field-cls form-control'])[3]")).sendKeys("120987",
				Keys.ENTER);
		Thread.sleep(3000);
		// Calendar - Need to Change the code
		driver.findElement(By.xpath("(//input[@name='datepicker'])[2]")).click();
		Thread.sleep(3000);
		List<WebElement> expiryDate=driver.findElements(By.xpath("(//table[@class='el-date-table'])[2]//tr//div/span"));
		for(int i=0;i<expiryDate.size();i++) {
			String val1=expiryDate.get(i).getText();
			if(val1.equals("30")) {
				driver.findElement(By.xpath("(//table[@class='el-date-table'])[2]//tr//div/span[contains(text(),'"+val1+"')]")).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn add-btn-size primary-btn btn-secondary']")).click();
		Thread.sleep(3000);
		//Edit
		driver.findElement(By.xpath("(//div[@class='edit-group btn-group btn-group-sm']/button)[1]")).click();
		Thread.sleep(2000);
		//Delete
		driver.findElement(By.xpath("(//div[@class='edit-group btn-group btn-group-sm']/button)[2]")).click();
		Thread.sleep(2000);
		//submit
		driver.findElement(By.xpath("(//div[@class='text-right']/button)[2]")).click();
		Thread.sleep(2000);
		//cancel
		driver.findElement(By.xpath("(//div[@class='text-right']/button)[1]")).click();
		Thread.sleep(2000);
		//if yes
		driver.findElement(By.cssSelector("div.el-message-box__btns>button~button")).click();
		Thread.sleep(2000);
		//if No
		driver.findElement(By.cssSelector("div.el-message-box__btns>button")).click();
		Thread.sleep(2000);
		
		//Add Supplier
	    driver.findElement(By.xpath("//button[@class='btn primary-btn addsupplier-btn-size btn-secondary']")).click();
	    
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
	    	String city=selectCity.get(i).getText();
	    	if(city.contains("Madurai")) {
	    		driver.findElements(By.cssSelector(".autocomplete__results>li")).get(i).click();
	    	}
	    }
	    //submit
	    driver.findElement(By.cssSelector("div.col-12 button")).click();
	    //close icon
	    driver.findElement(By.cssSelector(".b-sidebar-header>button>svg")).click();
	*/    
	    //search
	    driver.findElement(By.cssSelector("#purchasequickFilter")).sendKeys("sanjith");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()='View'])[1]")).click();
	    Thread.sleep(2000);
	    //Return
	    driver.findElement(By.cssSelector(".ag-selection-checkbox>div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn primary-btn returnpurchase-btn-size btn-secondary']")).click();
	    Thread.sleep(2000);
	    WebElement returnValue = driver.findElement(By.xpath("(//div[@class='ag-center-cols-container']//div)[5]"));
	    returnValue.click();
	    Thread.sleep(2000);
	    returnValue.sendKeys("2");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn primary-btn   return-btn-size btn-secondary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".el-message-box__btns>button~button")).click();


	}

}
