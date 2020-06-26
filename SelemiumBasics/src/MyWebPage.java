import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWebPage {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/total%20solutions/Desktop/mk.html");
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.id("email")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dfdsf");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//	WebElement element=driver.findElement(By.xpath("//select[@id='age']"));
//	Select selage=new Select(element);
//	selage.selectByVisibleText("Child");
//	selage.selectByValue("y");
//	selage.selectByIndex(3);
//	driver.findElement(By.xpath("//a[@href='https://www.selenium.dev']")).click();
//	
		
		List<WebElement> rows=driver.findElement(By.id("tbl")).findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			List<WebElement> columns=row.findElements(By.tagName("td"));
			for(WebElement column:columns)
			{
				System.out.print(column.getText());
				System.out.print(" ");
			}
			System.out.println();
		}
	
	}
	
}
