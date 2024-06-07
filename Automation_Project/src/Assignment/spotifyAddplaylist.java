package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spotifyAddplaylist {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.spotify.com/");
		
		driver.findElement(By.cssSelector("button[data-testid='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='login-username']")).click();
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("ms959915@gmail.com");
		driver.findElement(By.cssSelector("input[id='login-password']")).sendKeys("mandeep@13");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='IconWrapper__Wrapper-sc-16usrgb-0 hYdsxw']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create a new playlist']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='o4KVKZmeHsoRZ2Ltl078']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Add a name']")).sendKeys("Qspider");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for songs or episodes']")).sendKeys("Shubh");
		driver.findElement(By.xpath("//p[text()='Shubh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [text()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button [text()='Add'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button [text()='Add'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button [text()='Add'])[4]")).click();
		Thread.sleep(2000);
			
		Actions act = new Actions(driver) ;
		act.moveToElement(driver.findElement(By.xpath("//button[@class='j2s64Lz8y6VzBLB_V9Gm']"))).perform();
		act.click().perform();
		Thread.sleep(15000);
		act.moveToElement(driver.findElement(By.xpath("(//button[@class='j2s64Lz8y6VzBLB_V9Gm'])[2]"))).perform();
		act.click().perform();
		Thread.sleep(30000);
		act.moveToElement(driver.findElement(By.xpath("(//button[@class='j2s64Lz8y6VzBLB_V9Gm'])[3]"))).perform();
		act.click().perform();
		Thread.sleep(30000);
		act.moveToElement(driver.findElement(By.xpath("(//button[@class='j2s64Lz8y6VzBLB_V9Gm'])[4]"))).perform();
		act.click().perform();
		
		
	}

}
