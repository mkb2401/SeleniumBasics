import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("watch");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//a[@aria-label='Page 2']")).click();
		driver.findElement(By.linkText("Watch - Wikipedia")).click();
		
//		List<WebElement> list=driver.findElements(By.xpath("//h3"));
//		for(WebElement el:list)
//		{
//			if(el.getText().contains("Wikipedia"))
//			{
//				el.click();
//						break;	
//			}
//		}
	System.out.println(driver.getTitle());
		
		
		
		driver.quit();
	}

}
