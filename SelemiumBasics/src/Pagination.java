import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\total solutions\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mdbootstrap.com/docs/jquery/tables/pagination/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Next"))));
	 boolean b=true;
		do {
		WebElement element=driver.findElement(By.id("dtBasicExample"));
		List<WebElement> rows=element.findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			List<WebElement> columns=row.findElements(By.tagName("td"));
			for(WebElement column:columns)
			{
				System.out.print(column.getText());
				System.out.print("  ");
	
			}		
			System.out.println();
		}
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//li[@id='dtBasicExample_next']")).getAttribute("class").equals("paginate_button page-item next disabled"))
	{b=false;}
	else
	driver.findElement(By.linkText("Next")).click();
	}
		while(b) ;
driver.close();
}
}