import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\total solutions\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//List<WebElement> list=driver.findElements(By.xpath("//a"));
//System.out.println(list.size());
//int count=0;
//for(WebElement element:list)
//{
//	
//		if(element.getText().isEmpty())
//	{}
//	else
//	{
//		count++;
//	System.out.println(element.getText());
//	System.out.println(element.getAttribute("href"));
//}
//	}
//System.out.println(count);

//////////////////////////////////// WAiting thing

//driver.findElement(By.xpath("//a[@title='Show more languages']")).click();
//WebDriverWait w=new WebDriverWait(driver, 1);
//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Americas")));
//driver.findElement(By.linkText("Americas")).click();
//driver.close();

///// element.findelement --less scope
int count =0;
List<WebElement> tagsinFooter=driver.findElement(By.xpath("//div[@id='pageFooter']")).findElements(By.tagName("a"));
for(WebElement e:tagsinFooter)
{
System.out.println(e.getText());	
count++;
}
System.out.println(count);
}
}