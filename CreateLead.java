package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.chrome.chromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String driverpath = System.getProperty("webdriver.chrome.driver");
		System.out.println(driverpath);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thenmozhi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thenmozhi Balaji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeaf week2 Day1 Assignment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mailthenu@gmail.com");
		WebElement eleAt = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleAt);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
//		dd.selectByIndex(1);
//		dd.selectByVisibleText("Conference");
//		dd.getFirstSelectedOption();
//		dd.deselectAll();
//		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
//		System.out.println(firstName);
//		if(firstName.equals("def"))
//			System.out.println(true);
//		else
//			System.out.println(false);
		Thread.sleep(1000);
		System.out.println("The Page Title is :" +driver.getTitle());
		driver.close();
//		driver.executeScript("alert('Test Done!'); confirm('Are you happy?')");
//		WebElement userName1 = driver.findElement(By.id("createLeadForm_companyName"));
//		userName1.sendKeys("abc");
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver = new FirefoxDriver();
//		String driverpath = System.getProperty("webdriver.gecko.driver");
//		System.out.println(driverpath);
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();

	}
}
