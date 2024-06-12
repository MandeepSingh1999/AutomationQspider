package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/");
		
		driver.findElement(By.cssSelector("button[data-testid='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='login-username']")).click();
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("ms959915@gmail.com");
		driver.findElement(By.cssSelector("input[id='login-password']")).sendKeys("mandeep@13");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-testid='search-input']")).sendKeys("winning");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='ouEZqTcvcvMfvezimm_J']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bXrXni encore-bright-accent-set']")).click();
		
	}

}
