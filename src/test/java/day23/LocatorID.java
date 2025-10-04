package day23;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorID {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		
		//id
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		

	}

}
