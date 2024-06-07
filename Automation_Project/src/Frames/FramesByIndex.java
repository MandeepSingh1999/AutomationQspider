package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesByIndex {
 
	public static void main(String[] args) {
		
		FrameByWebElement();
		
	}
	
	public static void FrameByIndex() {
	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.dream11.com/");
	
	    //identify frames and use indexing
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("regEmail")).sendKeys("987897896");
	
}
	
	public static void FrameById() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		//identify frames and use id
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("987897896");
	}

	public static void FrameByWebElement() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("regEmail")).sendKeys("987897896");
		
		
	}
}