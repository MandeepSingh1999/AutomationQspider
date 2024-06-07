package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemapusingiframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.className("gb_f")).click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
