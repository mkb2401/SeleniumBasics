import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\total solutions\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//b[text()='Admin']"))).moveToElement(driver.findElement(By.id("menu_admin_Job"))).click(driver.findElement(By.id("menu_admin_viewPayGrades"))).build().perform();
	
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.id("payGrade_name")).sendKeys("Anything6");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		driver.findElement(By.id("btnAddCurrency")).click();
		driver.findElement(By.id("payGradeCurrency_currencyName")).sendKeys("INR");
		driver.findElement(By.xpath("/html/body/div[4]/ul/li")).click();
		driver.findElement(By.id("payGradeCurrency_minSalary")).sendKeys("50000");
		driver.findElement(By.id("payGradeCurrency_maxSalary")).sendKeys("150000");
		driver.findElement(By.id("btnSaveCurrency")).click();
		
		driver.findElement(By.linkText("Indian Rupee")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("payGradeCurrency_minSalary"))));
		act.doubleClick(driver.findElement(By.id("payGradeCurrency_minSalary"))).sendKeys(Keys.BACK_SPACE).sendKeys("25000").build().perform();;
		act.doubleClick(driver.findElement(By.id("payGradeCurrency_maxSalary"))).sendKeys(Keys.BACK_SPACE).sendKeys("200000").build().perform();;
	    driver.findElement(By.id("btnSaveCurrency")).click();
		
		
	}

}
