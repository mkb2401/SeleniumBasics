import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();


driver.get("https://www.facebook.com");
driver.manage().window().maximize();


driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mandy");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kaur");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mandeep8486@yahoo.in");
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("mandeep8486@yahoo.in");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("grsgrg");

WebElement element1 =driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select day=new Select(element1);
day.selectByValue("24");

WebElement element2 =driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select month=new Select(element2);
month.selectByIndex(3);

WebElement element3 =driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select year=new Select(element3);
year.selectByVisibleText("1993");

driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();
//List <WebElement> list=driver.findElements(By.xpath("//input[@name='sex']"));
//for(WebElement el:list)
//{
//	el.click();
//	}
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
Thread.sleep(3000);
//driver.navigate().back();
	}

}
