package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-d595gen/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			checkbox.click();
		}
		
	}
}
