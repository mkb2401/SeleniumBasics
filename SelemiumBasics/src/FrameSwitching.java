import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/total%20solutions/Desktop/mk.html");
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(driver.findElement(By.id("f1")));
		driver.findElement(By.id("mob")).sendKeys("45454");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("f2");// id or name value can be used as string
		driver.findElement(By.id("age")).sendKeys("54");
		
	}

}
