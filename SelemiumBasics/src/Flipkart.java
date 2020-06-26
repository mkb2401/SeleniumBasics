import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
			
		
		
		driver.findElement(By.xpath("//input[contains(@title,'Search for products')]")).sendKeys("camera");
		driver.findElement(By.xpath("//input[contains(@title,'Search for products')]")).sendKeys(Keys.ENTER);
			
		List<WebElement> list=driver.findElements(By.xpath("//div[contains(text(),'Sony')]"));
		
		System.out.println(list.size());
		int count =0;
				for(WebElement el:list)
		{
					if(el.getText().startsWith("Sony "))
					{
						count++;
System.out.println(el.getText());
					}
					System.out.println();
					
			}
	System.out.println(count);
		// driver.close();
	}

}
