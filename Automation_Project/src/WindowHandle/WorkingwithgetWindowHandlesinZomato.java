package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithgetWindowHandlesinZomato {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.Zomato.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0; i<2; i++)
		{
			js.executeScript("window.scrollBy(0,1300)");
			Thread.sleep(2000);
		}
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String id: allWindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Zomato"))
		    	{
					break;
				}
		}
		
		driver.findElement(By.xpath("//div[@class='sc-elhb8j-7 jBOGYb']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
