import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\total solutions\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Portal")).click();
		boolean b=switchWindow(driver, "Smart Video Calling with Alexa Built-inn | Portal from Facebook");
		if(b) {System.out.println(driver.getTitle()); }
		else
		{System.out.println("Not found");}
	}
        public static boolean switchWindow(WebDriver driver, String st) {
        	boolean b=false;
		Set<String> handles=driver.getWindowHandles();
		
       for(String handle:handles)
        {
	driver.switchTo().window(handle);
	String currentTitle=driver.getTitle();
	if(currentTitle.equals(st))
		{
		b=true;
		break;
		}
	    }
			
		 
		return b;                                             }

	}
	

