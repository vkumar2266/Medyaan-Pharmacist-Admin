package pharmacyadmin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Report {
	
	static void PM(WebDriver driver) {
		WebElement previousMonth=driver.findElement(By.xpath("(//button[@aria-label='Previous Month'])[1]"));
		for(int p=0;p<2;p++) {
			previousMonth.click();
		}	
	}
	static void NM(WebDriver driver) {
		WebElement nextMonth=driver.findElement(By.xpath("(//button[@aria-label='Next Month'])[2]"));
		for(int n=0;n<2;n++) {
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

		// Report
		driver.findElement(By.xpath("//a[@href='/report-details']")).click();
		Thread.sleep(2000);
		// From date
		driver.findElement(By.id("startDate")).click();
		PM(driver);
		String fromDate = "2";
		List<WebElement> calenderFrom = driver.findElements(By.xpath("//tbody//td"));
		for (int i = 0; i < calenderFrom.size(); i++) {
			if (fromDate.equals(calenderFrom.get(i).getText())) {
				driver.findElements(By.xpath("//tbody//td")).get(i).click();
				break;
			}
		}
		// To date
		driver.findElement(By.id("endDate")).click();
		String toDate = "3";
		List<WebElement> calenderTo = driver.findElements(By.xpath("//tbody//td"));
		for (int i = 0; i < calenderTo.size(); i++) {
			if (toDate.equals(calenderTo.get(i).getText())) {
				driver.findElements(By.xpath("//tbody//td")).get(i).click();
				break;
			}
		}
		//Report Type
		WebElement typesOfReport= driver.findElement(By.id("reportType"));
		Select report=new Select(typesOfReport);
		report.selectByVisibleText("Purchase");
		//Download
		driver.findElement(By.xpath("//button[@class='btn primary-btn download-btn-size btn-secondary']")).click();

	}

}
