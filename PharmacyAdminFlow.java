package pharmacyadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PharmacyAdminFlow {

	public static void main(String[] args) throws InterruptedException, AWTException {

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
		Thread.sleep(5000);

		/*		// Search - Dashboard - Product filter - Low Quantity
		driver.findElement(By.xpath("//input[@id='productquickFilter']")).sendKeys("Tablet");
		Thread.sleep(4000);
		// Expiring
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		Thread.sleep(4000);
		// Search
		driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("demo", Keys.ENTER);
		Thread.sleep(5000);

		// Sales - Module
		driver.findElement(By.xpath("//div[contains(text(),'Sales')]")).click();
		Thread.sleep(7000);
		// Search for Sales
		driver.findElement(By.xpath("//input[@id='saleshistoryFilter']")).sendKeys("Kamala n", Keys.ENTER);
		Thread.sleep(7000);
		// View
		driver.findElement(By.xpath("(//a[@class='view-btn'])[1]")).click();
		Thread.sleep(5000);
		// Close icon
		driver.findElement(By.xpath("//button[@class='close text-dark']")).click();
		Thread.sleep(5000);

		// Product
		driver.findElement(By.xpath("//div[contains(text(),'Product')]")).click();
		Thread.sleep(8000);

		// Products - Module
		driver.findElement(By.xpath("//div[text()='Product']")).click();
		Thread.sleep(5000);

		// ------------------------------------------------------------------------------

			// Products Tab
		driver.findElement(By.xpath("(//li[@class='nav-item'])[1]")).click();
		Thread.sleep(2000);
		// Batch Tab
		driver.findElement(By.xpath("(//li[@class='nav-item'])[2]")).click();
		Thread.sleep(2000);

		// Add Product Fields
		driver.findElement(By.xpath("//button[@class='btn primary-btn addproduct-btn-size mr-3 btn-secondary']"))
				.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("AcidicSolver");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchVal']")).sendKeys("SampleManufacturer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@id='search-forminput'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mrpValue']")).sendKeys("10");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='bestPrice']")).sendKeys("8");
		Thread.sleep(5000);
		// Dropdown
		WebElement ProductCategory = driver.findElement(By.xpath("//select[@id='productCategory']"));
		Select dropdown1 = new Select(ProductCategory);
		dropdown1.selectByVisibleText("Homeophathy");
		Thread.sleep(5000);
		// Dropdown
		WebElement ProductType = driver.findElement(By.xpath("//select[@id='productType']"));
		Select dropdown2 = new Select(ProductType);
		dropdown2.selectByVisibleText("Vaccine");
		driver.findElement(By.xpath("//input[@id='uomPurchase']")).sendKeys("package of 2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='uomSuggesionLists']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hsnCode']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cgstPercent']")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sgstPercent']")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='igstPercent']")).sendKeys("6");
		Thread.sleep(2000);

		// File Upload - .jpg image
		WebElement uploadElementJpg = driver
				.findElement(By.xpath("//div[@class='vue-dropzone dropzone dz-clickable']"));
		uploadElementJpg.click();
		StringSelection selectionJpg = new StringSelection(
				"C:\\Users\\AjithaManikandan\\Downloads\\heart diseaseee.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectionJpg, null);
		Thread.sleep(3000);

		// Robot Class for Performing the Keyboard actions
		Robot robotjpg = new Robot();
		robotjpg.keyPress(KeyEvent.VK_CONTROL);
		robotjpg.keyPress(KeyEvent.VK_V);
		robotjpg.keyRelease(KeyEvent.VK_CONTROL);
		robotjpg.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robotjpg.keyPress(KeyEvent.VK_ENTER);
		robotjpg.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@id='composition']")).sendKeys("Acetaminophen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Yes']/..")).click(); // Child to Parent
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(8000);
*/
		// Manufacturer - Module
		driver.findElement(By.xpath("//div[contains(text(),'Manufacturer')]")).click();
		Thread.sleep(5000);
/*
		// Add Manufacturer
		driver.findElement(By.xpath("//button[@class='btn primary-btn addmanufacturer-btn-size mr-3 btn-secondary']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("AutomationTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobilenumber']")).sendKeys("9087654321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("abc street");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("2nd cross");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Tambaram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='autocomplete__results']/li)[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(2000);

		// Edit Manufacturer
		driver.findElement(By.id("manufacturequickFilter")).sendKeys("Ak Medical");
		driver.findElement(By.xpath("//button[@class='btn edit-btn btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address1']")).clear();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Wales street");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address2']")).clear();
		driver.findElement(By.xpath("//input[@id='address2']"))
		.sendKeys("Super palace");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(2000);

		// Delete Manufacturer
		driver.findElement(By.xpath("(//button[@class='btn delete-btn btn-secondary'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='el-message-box__btns']/button)[2]")).click();
		Thread.sleep(5000);

		// Navigation
		driver.findElement(By.xpath("//span[@class='ag-icon ag-icon-next']")).click(); // Page 2
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ag-icon ag-icon-next']")).click(); // Page 3
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ag-icon ag-icon-next']")).click(); // Page 4
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ag-icon ag-icon-first']")).click(); // Page 1
		Thread.sleep(5000);

		// Product Category - Module
		driver.findElement(By.xpath("//div[text()='Product Category']/..")).click();
		Thread.sleep(5000);

		// Search
		driver.findElement(By.xpath("//input[@id='supplierquickFilter']")).sendKeys("Allopathic", Keys.ENTER);
		Thread.sleep(2000);

		// Add Product Category
		driver.findElement(By.xpath("//button[@class='btn primary-btn addcategory-btn-size mr-3 btn-secondary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='categoryName']")).sendKeys("TestCatego");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='descValue']")).sendKeys("The TestCategory is the best product");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/button[@class='submit_btn primary_btn submitbtn-color']")).click();
		Thread.sleep(2000);

		// Edit Product Category
		driver.findElement(By.xpath("(//button[@class='btn edit-btn btn-secondary'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='categoryName']")).sendKeys("TestCatego");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit_btn primary_btn submitbtn-color']")).click();
		Thread.sleep(2000);

		// Delete Product Category
		driver.findElement(By.xpath("(//button[@class='btn delete-btn btn-secondary'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='el-message-box__btns']/button)[2]")).click();
		Thread.sleep(5000);
*/
		// Purchase
		driver.findElement(By.xpath("((//div[@role='listbox'])[2]/div)[5]")).click();
		Thread.sleep(5000);
		// Purchase Order
		driver.findElement(By.xpath("(//div[@class='v-list-group__items']/a)[4]")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Search
		driver.findElement(By.xpath("//input[@id='purchasequickFilter']")).sendKeys("priyadharshan", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='view-btn'])[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("((//div[contains(@class,'ag-cell ag-cell-not-inline-editing ')])[1]//div/div)[2]"))
				.click(); // grandparent - grandchild
		Thread.sleep(2000);
		// Return Purchase
		driver.findElement(By.xpath("//button[@class='btn submitbtn-color returnbtn btn-secondary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='ag-center-cols-container'])//div[2]")).click();
		Thread.sleep(5000);
		// Return Quantity
		WebElement returnqty = driver.findElement(By.xpath("(//div[@col-id='returnquantity'])[2]"));
		returnqty.click();
		// returnqty.clear();
		returnqty.sendKeys(Keys.BACK_SPACE, "2");
		Thread.sleep(5000);
		// Return
		driver.findElement(By.xpath("//button[@class='btn submitbtn-color btn-secondary']")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']"))
				.click(); // Yes
		Thread.sleep(5000);

		// Add Purchase Order
		driver.findElement(By.xpath("//button[@class='btn submitbtn-color w-auto btn-secondary']")).click();
		Thread.sleep(5000);

		// Search
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("guna", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@id='search-forminput'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='input-field-cls form-control'])[1]")).sendKeys("dolo",
				Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Dolo 360 Dolo')])[1]")).click();
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
		driver.findElement(By.name("datepicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(((//tbody/tr)[6]/td)[3])")).click();
		Thread.sleep(3000);
		// Submit
		driver.findElement(By.xpath("(//button[@class='btn submitbtn-color btn-secondary'])[1]")).click();
		Thread.sleep(3000);
		// Edit action
		driver.findElement(By.xpath("(//button[@class='btn edit-btn btn-secondary'])[1]")).click();
		Thread.sleep(3000);
		// Edit Fields - Quantity
		WebElement editqty = driver.findElement(By.xpath("(//input[@class='input-field-cls form-control'])[2]"));
		editqty.sendKeys(Keys.BACK_SPACE, "22");
		Thread.sleep(5000);
//		    driver.findElement(By.xpath("(//input[@class='input-field-cls form-control'])[2]")).sendKeys("20",Keys.ENTER);
//		    Thread.sleep(3000);
		// Amount
		WebElement editamount = driver.findElement(By.id("purchaseAmount"));
		editamount.sendKeys(Keys.BACK_SPACE, "23");
		Thread.sleep(5000);
//		    driver.findElement(By.id("purchaseAmount")).sendKeys("20");
//		    Thread.sleep(3000);

		// have to add a syntax for add button.
		// Submit
		driver.findElement(By.xpath("(//button[@class='btn submitbtn-color btn-secondary'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);

	}

}
