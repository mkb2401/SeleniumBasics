import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSwitching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/total%20solutions/Desktop/Mobile.html");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@value='ok']")).click();
		System.out.println(driver.switchTo().alert().getText());
	      Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("mob")).getText());
		
	}

}
